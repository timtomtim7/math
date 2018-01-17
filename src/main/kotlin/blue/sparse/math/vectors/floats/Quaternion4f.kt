package blue.sparse.math.vectors.floats

import blue.sparse.math.*
import blue.sparse.math.matrices.Matrix4f
import blue.sparse.math.vectors.ints.Vector4i

data class Quaternion4f(var x: Float, var y: Float, var z: Float, var w: Float) : FloatVector
{
	val conjugate: Quaternion4f get() = Quaternion4f(-x, -y, -z, w)

	//	constructor(x: Float, y: Float, z: Float, w: Float) : this(x.toFloat(), y.toFloat(), z.toFloat(), w.toFloat())
	constructor() : this(0f, 0f, 0f, 1f)

	/**
	 * @param angle the angle in radians
	 */
	constructor(axis: Vector3f, angle: Float) : this()
	{
		val normalized = normalize(axis)
		val sinHalf = sin(angle / 2f)
		val cosHalf = cos(angle / 2f)
		assign(normalized.x * sinHalf, normalized.y * sinHalf, normalized.z * sinHalf, cosHalf)
	}

	constructor(forward: Vector3f, up: Vector3f) : this()
	{
		val dot = dot(Vector3f(0f, 0f, 1f), forward)

		if (abs(dot + 1) < 0)
		{
			assign(up.x, up.y, up.z, PI.toFloat())
		} else if (abs(dot - 1) > 0)
		{
			val angle = acos(dot)
			val axis = normalize(cross(Vector3f(0f, 0f, 1f), forward))
			rotate(axis, angle)
		}
	}

	/**
	 * @param yaw the yaw in radians
	 * @param pitch the pitch in radians
	 * @param roll the roll in radians
	 */
	constructor(yaw: Float, pitch: Float, roll: Float) : this()
	{
//		rotateRad(Vector3f(1, 0, 0), roll)
//		rotateRad(Vector3f(0, 1, 0), pitch)
//		rotateRad(Vector3f(0, 0, 1), yaw)
		val cy = cos(yaw / 2f)
		val sy = sin(yaw / 2f)
		val cp = cos(pitch / 2f)
		val sp = sin(pitch / 2f)
		val cr = cos(roll / 2f)
		val sr = sin(roll / 2f)

		assign(
				cy * sr * cp - sy * cr * sp,
				cy * cr * sp + sy * sr * cp,
				sy * cr * cp - cy * sr * sp,
				cy * cr * cp + sy * sr * sp
		)
	}

	fun assign(x: Float, y: Float, z: Float, w: Float)
	{
		this.x = x
		this.y = y
		this.z = z
		this.w = w
	}

	fun rotate(axis: Vector3f, angle: Float)
	{
		val normalized = normalize(axis)
		val sinHalf = sin(angle / 2f)
		val cosHalf = cos(angle / 2f)

		val other = Quaternion4f(normalized.x * sinHalf, normalized.y * sinHalf, normalized.z * sinHalf, cosHalf) * this
		assign(other.x, other.y, other.z, other.w)
	}

	operator fun times(other: Float) = Quaternion4f(x * other, y * other, z * other, w * other)

	operator fun times(other: Quaternion4f): Quaternion4f
	{
		val nw = w * other.w - x * other.x - y * other.y - z * other.z
		val nx = x * other.w + w * other.x + y * other.z - z * other.y
		val ny = y * other.w + w * other.y + z * other.x - x * other.z
		val nz = z * other.w + w * other.z + x * other.y - y * other.x

		return Quaternion4f(nx, ny, nz, nw)
	}

	operator fun times(other: Vector3f): Quaternion4f
	{
		val nw = -x * other.x - y * other.y - z * other.z
		val nx = w * other.x + y * other.z - z * other.y
		val ny = w * other.y + z * other.x - x * other.z
		val nz = w * other.z + x * other.y - y * other.x

		return Quaternion4f(nx, ny, nz, nw)
	}

	operator fun plus(other: Vector4f) = Quaternion4f(x + other.x, y + other.y, z + other.z, w + other.w)
	operator fun minus(other: Vector4f) = Quaternion4f(x - other.x, y - other.y, z - other.z, w - other.w)
	operator fun div(other: Vector4f) = Quaternion4f(x / other.x, y / other.y, z / other.z, w / other.w)
	operator fun rem(other: Vector4f) = Quaternion4f(x % other.x, y % other.y, z % other.z, w % other.w)

	operator fun plus(other: Quaternion4f) = Quaternion4f(x + other.x, y + other.y, z + other.z, w + other.w)
	operator fun minus(other: Quaternion4f) = Quaternion4f(x - other.x, y - other.y, z - other.z, w - other.w)
	operator fun div(other: Quaternion4f) = Quaternion4f(x / other.x, y / other.y, z / other.z, w / other.w)
	operator fun rem(other: Quaternion4f) = Quaternion4f(x % other.x, y % other.y, z % other.z, w % other.w)

	operator fun plus(other: Float) = Quaternion4f(x + other, y + other, z + other, w + other)
	operator fun minus(other: Float) = Quaternion4f(x - other, y - other, z - other, w - other)
	operator fun div(other: Float) = Quaternion4f(x / other, y / other, z / other, w / other)
	operator fun rem(other: Float) = Quaternion4f(x % other, y % other, z % other, w % other)

	operator fun unaryPlus() = Quaternion4f(+x, +y, +z, +w)
	operator fun unaryMinus() = Quaternion4f(-x, -y, -z, -w)

	fun toMatrix(): Matrix4f
	{
		val forward = Vector3f(2.0f * (x * z - w * y), 2.0f * (y * z + w * x), 1.0f - 2.0f * (x * x + y * y))
		val up = Vector3f(2.0f * (x * y + w * z), 1.0f - 2.0f * (x * x + z * z), 2.0f * (y * z - w * x))
		val right = Vector3f(1.0f - 2.0f * (y * y + z * z), 2.0f * (x * y - w * z), 2.0f * (x * z + w * y))

		return Matrix4f.rotation(forward, up, right)
	}

	fun toVector3f() = Vector3f(x, y, z)
	fun toVector4f() = Vector4f(x, y, z, w)

	val forward: Vector3f get() = ((this * Vector3f(0f, 0f, 1f)) * conjugate).toVector3f()
	val back: Vector3f get() = ((this * Vector3f(0f, 0f, -1f)) * conjugate).toVector3f()
	val up: Vector3f get() = ((this * Vector3f(0f, 1f, 0f)) * conjugate).toVector3f()
	val down: Vector3f get() = ((this * Vector3f(0f, -1f, 0f)) * conjugate).toVector3f()
	val left: Vector3f get() = ((this * Vector3f(1f, 0f, 0f)) * conjugate).toVector3f()
	val right: Vector3f get() = ((this * Vector3f(-1f, 0f, 0f)) * conjugate).toVector3f()

	override operator fun get(index: Int) = when (index)
	{
		0 -> x
		1 -> y
		2 -> z
		3 -> w
		else -> throw IndexOutOfBoundsException(index.toString())
	}

	override operator fun set(index: Int, value: Float) = when (index)
	{
		0 -> x = value
		1 -> y = value
		2 -> z = value
		3 -> w = value
		else -> throw IndexOutOfBoundsException(index.toString())
	}

	override fun iterator(): Iterator<Float>
	{
		return sequenceOf(x, y, z, w).iterator()
	}

	override fun toIntVector() = Vector4i(x.toInt(), y.toInt(), z.toInt(), w.toInt())

	override fun clone() = Quaternion4f(x, y, z, w)
}