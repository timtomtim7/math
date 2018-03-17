package blue.sparse.math.matrices

import blue.sparse.math.vectors.floats.*
import java.nio.*
import java.util.Arrays

class Matrix4f : Cloneable
{
	private val values = Array(4, { Vector4f(0f) })

	constructor() : this(1f)

	constructor(diagonal: Float)
	{
		for(i in 0 until 4) values[i][i] = diagonal
	}

	operator fun get(x: Int): Vector4f
	{
		return values[x]
	}

	operator fun set(x: Int, column: Vector4f)
	{
		values[x].assign(column.x, column.y, column.z, column.w)
	}

	fun fill(value: Float)
	{
		values.forEach { it.assign(value, value, value, value) }
	}

	fun identity()
	{
		fill(0f)
		for(i in 0 until 4) values[i][i] = 1f
	}

	fun translate(vec: Vector3f): Matrix4f
	{
		timesAssign(columns(
				Vector4f(1f, 0f, 0f, vec.x),
				Vector4f(0f, 1f, 0f, vec.y),
				Vector4f(0f, 0f, 1f, vec.z),
				Vector4f(0f, 0f, 0f, 1f)
		))
		return this
	}

	fun scale(vec: Vector3f): Matrix4f
	{
		timesAssign(columns(
				Vector4f(vec.x, 0f, 0f, 0f),
				Vector4f(0f, vec.y, 0f, 0f),
				Vector4f(0f, 0f, vec.z, 0f),
				Vector4f(0f, 0f, 0f, 1f)
		))
		return this
	}

	fun rotate(forward: Vector3f, up: Vector3f, right: Vector3f): Matrix4f
	{
		timesAssign(columns(
				Vector4f(right, 0f),
				Vector4f(up, 0f),
				Vector4f(forward, 0f),
				Vector4f(0f, 0f, 0f, 1f)
		))
		return this
	}

	fun rotate(quaternion: Quaternion4f): Matrix4f
	{
		timesAssign(quaternion.toMatrix())
		return this
	}

	operator fun times(other: Matrix4f): Matrix4f
	{
		val result = Matrix4f(0f)

		for(i in 0 until 4)
			for(j in 0 until 4)
				for(k in 0 until 4)
					result[i][j] += this[i][k] * other[k][j]

		return result
	}

	operator fun timesAssign(other: Matrix4f)
	{
		val copiedValues = values.map { it.copy() }
		fill(0f)

		for(i in 0 until 4)
			for(j in 0 until 4)
				for(k in 0 until 4)
//					this[i][j] += copiedValues[k][j] * other[i][k]
					this[i][j] += copiedValues[i][k] * other[k][j]
	}

	operator fun times(vec: Vector4f): Vector4f
	{
		val result = Vector4f(0f)

		for(i in 0 until 4)
			for(j in 0 until 4)
				result[i] += values[i][j] * vec[j]

		return result
	}

	operator fun times(vec: Vector3f) = times(Vector4f(vec, 1f)).xyz

	fun toFloatBuffer(): FloatBuffer = toByteBuffer().asFloatBuffer()

	fun toByteBuffer(): ByteBuffer
	{
		val buffer = ByteBuffer.allocateDirect(4 * 4 * 4).order(ByteOrder.nativeOrder())
		for(i in 0 until 4)
			for(j in 0 until 4)
				buffer.putFloat(this[i][j])
		buffer.flip()

		return buffer
	}

	override fun equals(other: Any?): Boolean
	{
		if (this === other) return true
		if (other !is Matrix4f) return false

		if (!Arrays.equals(values, other.values)) return false

		return true
	}

	override fun hashCode(): Int
	{
		return Arrays.hashCode(values)
	}

	override fun toString(): String
	{
		val sb = StringBuilder("Matrix4f(\n")

		for(i in 0 until 4)
		{
			for(j in 0 until 4)
			{
				sb.append('\t').append(values[j][i])
			}
			sb.append('\n')
		}


		sb.append(')')
		return sb.toString()
	}

	public override fun clone(): Matrix4f
	{
		return columns(values[0], values[1], values[2], values[3])
	}

	companion object
	{
		fun rows(r0: Vector4f, r1: Vector4f, r2: Vector4f, r3: Vector4f): Matrix4f
		{
			return columns(
					Vector4f(r0.x, r1.x, r2.x, r3.x),
					Vector4f(r0.y, r1.y, r2.y, r3.y),
					Vector4f(r0.z, r1.z, r2.z, r3.z),
					Vector4f(r0.w, r1.w, r2.w, r3.w)
			)
		}

		fun columns(c0: Vector4f, c1: Vector4f, c2: Vector4f, c3: Vector4f): Matrix4f
		{
			val result = Matrix4f(0f)
			result[0] = c0.copy()
			result[1] = c1.copy()
			result[2] = c2.copy()
			result[3] = c3.copy()
			return result
		}

		fun identity() = Matrix4f(1f)

		fun translation(vec: Vector3f) = columns(
				Vector4f(1f, 0f, 0f, vec.x),
				Vector4f(0f, 1f, 0f, vec.y),
				Vector4f(0f, 0f, 1f, vec.z),
				Vector4f(0f, 0f, 0f, 1f)
		)

		fun scale(vec: Vector3f) = columns(
				Vector4f(vec.x, 0f, 0f, 0f),
				Vector4f(0f, vec.y, 0f, 0f),
				Vector4f(0f, 0f, vec.z, 0f),
				Vector4f(0f, 0f, 0f, 1f)
		)

		fun perspective(fov: Float, aspectRatio: Float, zNear: Float, zFar: Float): Matrix4f
		{
			val tanHalfFOV = Math.tan(Math.toRadians((fov / 2.0f).toDouble())).toFloat()
			val zRange = zNear - zFar

			return columns(
					Vector4f(1.0f / (tanHalfFOV * aspectRatio), 0f, 0f, 0f),
					Vector4f(0f, 1.0f / tanHalfFOV, 0f, 0f),
					Vector4f(0f, 0f, (-zNear - zFar) / zRange, 2 * zFar * zNear / zRange),
					Vector4f(0f, 0f, 1f, 0f)
			)
		}

		fun orthographic(left: Float, right: Float, bottom: Float, top: Float, near: Float, far: Float): Matrix4f
		{
			val width = right - left
			val height = top - bottom
			val depth = far - near

			return columns(
					Vector4f(2f / width, 0f, 0f, -(right + left) / width),
					Vector4f(0f, 2f / height, 0f, -(top + bottom) / height),
					Vector4f(0f, 0f, -2f / depth, -(far + near) / depth),
					Vector4f(0f, 0f, 0f, 1f)
			)
		}

		fun rotation(forward: Vector3f, up: Vector3f, right: Vector3f): Matrix4f
		{
			return columns(
					Vector4f(right, 0f),
					Vector4f(up, 0f),
					Vector4f(forward, 0f),
					Vector4f(0f, 0f, 0f, 1f)
			)
		}

		fun rotation(quaternion: Quaternion4f): Matrix4f
		{
			return quaternion.toMatrix()
		}

		fun fromByteBuffer(buffer: ByteBuffer): Matrix4f
		{
			val values = Array(4) { Vector4f(0f) }
			for(x in 0 until 4)
				values[x] = Vector4f(buffer.float, buffer.float, buffer.float, buffer.float)
			return Matrix4f.columns(values[0], values[1], values[2], values[3])
		}
	}
}
