package blue.sparse.math.vectors.doubles

import blue.sparse.math.*
import blue.sparse.math.matrices.Matrix4d
import blue.sparse.math.vectors.floats.Quaternion4f
import blue.sparse.math.vectors.ints.Vector4i

data class Quaternion4d(var x: Double, var y: Double, var z: Double, var w: Double) : DoubleVector
{
	val conjugate: Quaternion4d get() = Quaternion4d(-x, -y, -z, w)

	constructor() : this(0.0, 0.0, 0.0, 1.0)

	/**
	 * @param angle the angle in radians
	 */
	constructor(axis: Vector3d, angle: Double) : this()
	{
		val normalized = normalize(axis)
		val sinHalf = Math.sin(angle / 2.0)
		val cosHalf = Math.cos(angle / 2.0)
		assign(normalized.x * sinHalf, normalized.y * sinHalf, normalized.z * sinHalf, cosHalf)
	}

	constructor(forward: Vector3d, up: Vector3d) : this()
	{
		val dot = dot(Vector3d(0.0, 0.0, 1.0), forward)

		if (abs(dot + 1) < 0)
		{
			assign(up.x, up.y, up.z, Math.PI)
		} else if (abs(dot - 1) > 0)
		{
			val angle = acos(dot)
			val axis = normalize(cross(Vector3d(0.0, 0.0, 1.0), forward))
			rotate(axis, angle)
		}
	}

	/**
	 * @param yaw the yaw in radians
	 * @param pitch the pitch in radians
	 * @param roll the roll in radians
	 */
	constructor(yaw: Double, pitch: Double, roll: Double) : this()
	{
//		rotateRad(Vector3d(1, 0, 0), roll)
//		rotateRad(Vector3d(0, 1, 0), pitch)
//		rotateRad(Vector3d(0, 0, 1), yaw)
		val cy = Math.cos(yaw / 2.0)
		val sy = Math.sin(yaw / 2.0)
		val cp = Math.cos(pitch / 2.0)
		val sp = Math.sin(pitch / 2.0)
		val cr = Math.cos(roll / 2.0)
		val sr = Math.sin(roll / 2.0)

		assign(
				cy * sr * cp - sy * cr * sp,
				cy * cr * sp + sy * sr * cp,
				sy * cr * cp - cy * sr * sp,
				cy * cr * cp + sy * sr * sp
		)
	}

	fun assign(x: Double, y: Double, z: Double, w: Double)
	{
		this.x = x
		this.y = y
		this.z = z
		this.w = w
	}

	fun rotate(axis: Vector3d, angle: Double)
	{
		val normalized = normalize(axis)
		val sinHalf = sin(angle / 2.0)
		val cosHalf = cos(angle / 2.0)

		val other = Quaternion4d(normalized.x * sinHalf, normalized.y * sinHalf, normalized.z * sinHalf, cosHalf) * this
		assign(other.x, other.y, other.z, other.w)
	}

	operator fun times(other: Double) = Quaternion4d(x * other, y * other, z * other, w * other)

	operator fun times(other: Quaternion4d): Quaternion4d
	{
		val nw = w * other.w - x * other.x - y * other.y - z * other.z
		val nx = x * other.w + w * other.x + y * other.z - z * other.y
		val ny = y * other.w + w * other.y + z * other.x - x * other.z
		val nz = z * other.w + w * other.z + x * other.y - y * other.x

		return Quaternion4d(nx, ny, nz, nw)
	}

	operator fun times(other: Vector3d): Quaternion4d
	{
		val nw = -x * other.x - y * other.y - z * other.z
		val nx = w * other.x + y * other.z - z * other.y
		val ny = w * other.y + z * other.x - x * other.z
		val nz = w * other.z + x * other.y - y * other.x

		return Quaternion4d(nx, ny, nz, nw)
	}

	operator fun plus(other: Vector4d) = Quaternion4d(x + other.x, y + other.y, z + other.z, w + other.w)
	operator fun minus(other: Vector4d) = Quaternion4d(x - other.x, y - other.y, z - other.z, w - other.w)
	operator fun div(other: Vector4d) = Quaternion4d(x / other.x, y / other.y, z / other.z, w / other.w)
	operator fun rem(other: Vector4d) = Quaternion4d(x % other.x, y % other.y, z % other.z, w % other.w)

	operator fun plus(other: Quaternion4d) = Quaternion4d(x + other.x, y + other.y, z + other.z, w + other.w)
	operator fun minus(other: Quaternion4d) = Quaternion4d(x - other.x, y - other.y, z - other.z, w - other.w)
	operator fun div(other: Quaternion4d) = Quaternion4d(x / other.x, y / other.y, z / other.z, w / other.w)
	operator fun rem(other: Quaternion4d) = Quaternion4d(x % other.x, y % other.y, z % other.z, w % other.w)

	operator fun plus(other: Double) = Quaternion4d(x + other, y + other, z + other, w + other)
	operator fun minus(other: Double) = Quaternion4d(x - other, y - other, z - other, w - other)
	operator fun div(other: Double) = Quaternion4d(x / other, y / other, z / other, w / other)
	operator fun rem(other: Double) = Quaternion4d(x % other, y % other, z % other, w % other)

	operator fun unaryPlus() = Quaternion4d(+x, +y, +z, +w)
	operator fun unaryMinus() = Quaternion4d(-x, -y, -z, -w)

	fun toMatrix(): Matrix4d
	{
		val forward = Vector3d(2.0 * (x * z - w * y), 2.0 * (y * z + w * x), 1.0 - 2.0 * (x * x + y * y))
		val up = Vector3d(2.0 * (x * y + w * z), 1.0 - 2.0 * (x * x + z * z), 2.0 * (y * z - w * x))
		val right = Vector3d(1.0 - 2.0 * (y * y + z * z), 2.0 * (x * y - w * z), 2.0 * (x * z + w * y))

		return Matrix4d.rotation(forward, up, right)
	}

	fun toVector3d() = Vector3d(x, y, z)
	fun toVector4d() = Vector4d(x, y, z, w)

	val forward: 	Vector3d get() = ((this * Vector3d(0.0, 0.0, 1.0)) * conjugate).toVector3d()
	val back: 		Vector3d get() = ((this * Vector3d(0.0, 0.0, -1.0)) * conjugate).toVector3d()
	val up: 		Vector3d get() = ((this * Vector3d(0.0, 1.0, 0.0)) * conjugate).toVector3d()
	val down: 		Vector3d get() = ((this * Vector3d(0.0, -1.0, 0.0)) * conjugate).toVector3d()
	val left: 		Vector3d get() = ((this * Vector3d(1.0, 0.0, 0.0)) * conjugate).toVector3d()
	val right:		Vector3d get() = ((this * Vector3d(-1.0, 0.0, 0.0)) * conjugate).toVector3d()

	override operator fun get(index: Int) = when (index)
	{
		0 -> x
		1 -> y
		2 -> z
		3 -> w
		else -> throw IndexOutOfBoundsException(index.toString())
	}

	override operator fun set(index: Int, value: Double) = when (index)
	{
		0 -> x = value
		1 -> y = value
		2 -> z = value
		3 -> w = value
		else -> throw IndexOutOfBoundsException(index.toString())
	}

	override fun iterator(): Iterator<Double>
	{
		return sequenceOf(x, y, z, w).iterator()
	}

	override fun toIntVector() = Vector4i(x.toInt(), y.toInt(), z.toInt(), w.toInt())
	override fun toFloatVector() = Quaternion4f(x.toFloat(), y.toFloat(), z.toFloat(), w.toFloat())

	override fun clone() = Quaternion4d(x, y, z, w)
}