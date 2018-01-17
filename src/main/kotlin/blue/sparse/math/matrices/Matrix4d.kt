package blue.sparse.math.matrices

import blue.sparse.math.vectors.doubles.*
import java.nio.*
import java.util.Arrays

class Matrix4d : Cloneable
{
	private val values = Array(4, { Vector4d(0.0) })

	constructor() : this(1.0)

	constructor(diagonal: Double)
	{
		for (i in 0 until 4) values[i][i] = diagonal
	}

	operator fun get(x: Int): Vector4d
	{
		return values[x]
	}

	operator fun set(x: Int, column: Vector4d)
	{
		values[x].assign(column.x, column.y, column.z, column.w)
	}

	fun fill(value: Double)
	{
		values.forEach { it.assign(value, value, value, value) }
	}

	fun identity()
	{
		fill(0.0)
		for (i in 0 until 4) values[i][i] = 1.0
	}

	fun translate(vec: Vector3d): Matrix4d
	{
		timesAssign(columns(
				Vector4d(1.0, 0.0, 0.0, vec.x),
				Vector4d(0.0, 1.0, 0.0, vec.y),
				Vector4d(0.0, 0.0, 1.0, vec.z),
				Vector4d(0.0, 0.0, 0.0, 1.0)
		))
		return this
	}

	fun scale(vec: Vector3d): Matrix4d
	{
		timesAssign(columns(
				Vector4d(vec.x, 0.0, 0.0, 0.0),
				Vector4d(0.0, vec.y, 0.0, 0.0),
				Vector4d(0.0, 0.0, vec.z, 0.0),
				Vector4d(0.0, 0.0, 0.0, 1.0)
		))
		return this
	}

	fun rotate(forward: Vector3d, up: Vector3d, right: Vector3d): Matrix4d
	{
		timesAssign(columns(
				Vector4d(right, 0.0),
				Vector4d(up, 0.0),
				Vector4d(forward, 0.0),
				Vector4d(0.0, 0.0, 0.0, 1.0)
		))
		return this
	}

	fun rotate(quaternion: Quaternion4d): Matrix4d
	{
		timesAssign(quaternion.toMatrix())
		return this
	}

	operator fun times(other: Matrix4d): Matrix4d
	{
		val result = Matrix4d(0.0)

		for (i in 0 until 4)
			for (j in 0 until 4)
				for (k in 0 until 4)
					result[i][j] += this[i][k] * other[k][j]

		return result
	}

	operator fun timesAssign(other: Matrix4d)
	{
		val copiedValues = values.map { it.copy() }
		fill(0.0)

		for (i in 0 until 4)
			for (j in 0 until 4)
				for (k in 0 until 4)
//					this[i][j] += copiedValues[k][j] * other[i][k]
					this[i][j] += copiedValues[i][k] * other[k][j]
	}

	operator fun times(vec: Vector4d): Vector4d
	{
		val result = Vector4d(0.0)

		for (i in 0 until 4)
			for (j in 0 until 4)
				result[i] += values[i][j] * vec[j]

		return result
	}

	operator fun times(vec: Vector3d) = times(Vector4d(vec, 1.0)).xyz

	fun toDoubleBuffer(): DoubleBuffer = toByteBuffer().asDoubleBuffer()

	fun toByteBuffer(): ByteBuffer
	{
		val buffer = ByteBuffer.allocateDirect(4 * 4 * 4).order(ByteOrder.nativeOrder())
		for (i in 0 until 4)
			for (j in 0 until 4)
				buffer.putDouble(this[i][j])
		buffer.flip()

		return buffer
	}

	override fun equals(other: Any?): Boolean
	{
		if (this === other) return true
		if (other !is Matrix4d) return false

		if (!Arrays.equals(values, other.values)) return false

		return true
	}

	override fun hashCode(): Int
	{
		return Arrays.hashCode(values)
	}

	override fun toString(): String
	{
		val sb = StringBuilder("Matrix4.0(\n")

		for (i in 0 until 4)
		{
			for (j in 0 until 4)
			{
				sb.append('\t').append(values[j][i])
			}
			sb.append('\n')
		}


		sb.append(')')
		return sb.toString()
	}

	public override fun clone(): Matrix4d
	{
		return columns(values[0], values[1], values[2], values[3])
	}

	companion object
	{
		fun rows(r0: Vector4d, r1: Vector4d, r2: Vector4d, r3: Vector4d): Matrix4d
		{
			return columns(
					Vector4d(r0.x, r1.x, r2.x, r3.x),
					Vector4d(r0.y, r1.y, r2.y, r3.y),
					Vector4d(r0.z, r1.z, r2.z, r3.z),
					Vector4d(r0.w, r1.w, r2.w, r3.w)
			)
		}

		fun columns(c0: Vector4d, c1: Vector4d, c2: Vector4d, c3: Vector4d): Matrix4d
		{
			val result = Matrix4d(0.0)
			result[0] = c0.copy()
			result[1] = c1.copy()
			result[2] = c2.copy()
			result[3] = c3.copy()
			return result
		}

		fun identity() = Matrix4d(1.0)

		fun translation(vec: Vector3d) = columns(
				Vector4d(1.0, 0.0, 0.0, vec.x),
				Vector4d(0.0, 1.0, 0.0, vec.y),
				Vector4d(0.0, 0.0, 1.0, vec.z),
				Vector4d(0.0, 0.0, 0.0, 1.0)
		)

		fun scale(vec: Vector3d) = columns(
				Vector4d(vec.x, 0.0, 0.0, 0.0),
				Vector4d(0.0, vec.y, 0.0, 0.0),
				Vector4d(0.0, 0.0, vec.z, 0.0),
				Vector4d(0.0, 0.0, 0.0, 1.0)
		)

		fun perspective(fov: Double, aspectRatio: Double, zNear: Double, zFar: Double): Matrix4d
		{
			val tanHalfFOV = Math.tan(Math.toRadians((fov / 2.0)))
			val zRange = zNear - zFar

			return columns(
					Vector4d(1.0 / (tanHalfFOV * aspectRatio), 0.0, 0.0, 0.0),
					Vector4d(0.0, 1.0 / tanHalfFOV, 0.0, 0.0),
					Vector4d(0.0, 0.0, (-zNear - zFar) / zRange, 2 * zFar * zNear / zRange),
					Vector4d(0.0, 0.0, 1.0, 0.0)
			)
		}

		fun orthographic(left: Double, right: Double, bottom: Double, top: Double, near: Double, far: Double): Matrix4d
		{
			val width = right - left
			val height = top - bottom
			val depth = far - near

			return columns(
					Vector4d(2.0 / width, 0.0, 0.0, -(right + left) / width),
					Vector4d(0.0, 2.0 / height, 0.0, -(top + bottom) / height),
					Vector4d(0.0, 0.0, -2.0 / depth, -(far + near) / depth),
					Vector4d(0.0, 0.0, 0.0, 1.0)
			)
		}

		fun rotation(forward: Vector3d, up: Vector3d, right: Vector3d): Matrix4d
		{
			return columns(
					Vector4d(right, 0.0),
					Vector4d(up, 0.0),
					Vector4d(forward, 0.0),
					Vector4d(0.0, 0.0, 0.0, 1.0)
			)
		}

		fun rotation(quaternion: Quaternion4d): Matrix4d
		{
			return quaternion.toMatrix()
		}

		fun fromByteBuffer(buffer: ByteBuffer): Matrix4d
		{
			val values = Array(4) { Vector4d(0.0) }
			for(x in 0 until 4)
				values[x] = Vector4d(buffer.double, buffer.double, buffer.double, buffer.double)
			return columns(values[0], values[1], values[2], values[3])
		}
	}
}
