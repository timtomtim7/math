package blue.sparse.math

import blue.sparse.math.matrices.Matrix4f
import blue.sparse.math.vectors.floats.*

data class FloatTransform(val translation: Vector3f, val rotation: Quaternion4f, val scale: Vector3f)
{
	constructor() : this(Vector3f(0f), Quaternion4f(), Vector3f(1f))

//	private var cachedHashCode: Long = longHashCode()
//	private var cachedMatrix: Matrix4f = computeMatrix()
//	private var cachedInverseMatrix: Matrix4f = computeInverseMatrix()

	fun reset()
	{
		translation.assign(0f,0f,0f)
		rotation.assign(0f,0f,0f,1f)
		scale.assign(1f,1f,1f)
	}

	fun translate(translation: Vector3f)
	{
		this.translation += translation
	}

	fun scale(scale: Vector3f)
	{
		this.scale *= scale
	}

	fun rotateRad(axis: Vector3f, angle: Float): FloatTransform
	{
		rotation.rotate(axis, angle)
		return this
	}

	fun rotateDeg(axis: Vector3f, angle: Float): FloatTransform
	{
		return rotateRad(axis, Math.toRadians(angle.toDouble()).toFloat())
	}

	fun lookAt(target: Vector3f, up: Vector3f = Axis.Y.vector3)
	{
		setRotation(Quaternion4f.lookAt(normalize(translation - target), up))
	}

	fun lookAway(target: Vector3f, up: Vector3f = Axis.Y.vector3)
	{
		setRotation(Quaternion4f.lookAt(normalize(target - translation), up))
	}

	fun setTranslation(translation: Vector3f)
	{
		this.translation.assign(translation.x, translation.y, translation.z)
	}

	fun setScale(scale: Vector3f)
	{
		this.scale.assign(scale.x, scale.y, scale.z)
	}

	fun setRotation(rotation: Quaternion4f)
	{
		this.rotation.assign(rotation.x, rotation.y, rotation.z, rotation.w)
	}

	private fun longHashCode(): Long
	{
		var result = translation.hashCode().toLong()
		result = 31L * result + rotation.hashCode().toLong()
		result = 31L * result + scale.hashCode().toLong()
		return result
	}

	private fun computeMatrix(): Matrix4f
	{
		return Matrix4f.translation(translation).rotate(rotation).scale(scale)
	}

	private fun computeInverseMatrix(): Matrix4f
	{
		return Matrix4f.scale(1f / scale).rotate(rotation.conjugate).translate(-translation)
	}

//	private fun check()
//	{
//		val newDataHashCode = longHashCode()
//		if(newDataHashCode != cachedHashCode)
//		{
//			cachedHashCode = newDataHashCode
//			cachedMatrix = computeMatrix()
//			cachedInverseMatrix = computeInverseMatrix()
//		}
//	}

	val matrix: Matrix4f get() = computeMatrix()
//		get()
//		{
//			check()
//			return cachedMatrix.clone()
//		}

	val inverseMatrix: Matrix4f get() = computeInverseMatrix()
//		get()
//		{
//			check()
//			return cachedInverseMatrix.clone()
//		}
}