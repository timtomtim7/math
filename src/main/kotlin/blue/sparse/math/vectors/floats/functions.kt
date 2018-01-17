package blue.sparse.math.vectors.floats

import blue.sparse.math.*

operator fun Float.plus(other: Vector2f) = Vector2f(this) + other
operator fun Float.minus(other: Vector2f) = Vector2f(this) - other
operator fun Float.times(other: Vector2f) = Vector2f(this) * other
operator fun Float.div(other: Vector2f) = Vector2f(this) / other
operator fun Float.rem(other: Vector2f) = Vector2f(this) % other

operator fun Float.plus(other: Vector3f) = Vector3f(this) + other
operator fun Float.minus(other: Vector3f) = Vector3f(this) - other
operator fun Float.times(other: Vector3f) = Vector3f(this) * other
operator fun Float.div(other: Vector3f) = Vector3f(this) / other
operator fun Float.rem(other: Vector3f) = Vector3f(this) % other

operator fun Float.plus(other: Vector4f) = Vector4f(this) + other
operator fun Float.minus(other: Vector4f) = Vector4f(this) - other
operator fun Float.times(other: Vector4f) = Vector4f(this) * other
operator fun Float.div(other: Vector4f) = Vector4f(this) / other
operator fun Float.rem(other: Vector4f) = Vector4f(this) % other

operator fun Vector3f.times(other: Quaternion4f) = ((other * this) * other.conjugate).toVector3f()

fun abs(vector: Vector2f) = Vector2f(abs(vector.x), abs(vector.y))
fun abs(vector: Vector3f) = Vector3f(abs(vector.x), abs(vector.y), abs(vector.z))
fun abs(vector: Vector4f) = Vector4f(abs(vector.x), abs(vector.y), abs(vector.z), abs(vector.w))

fun floor(vector: Vector2f) = Vector2f(floor(vector.x), floor(vector.y))
fun floor(vector: Vector3f) = Vector3f(floor(vector.x), floor(vector.y), floor(vector.z))
fun floor(vector: Vector4f) = Vector4f(floor(vector.x), floor(vector.y), floor(vector.z), floor(vector.w))

fun ceil(vector: Vector2f) = Vector2f(ceil(vector.x), ceil(vector.y))
fun ceil(vector: Vector3f) = Vector3f(ceil(vector.x), ceil(vector.y), ceil(vector.z))
fun ceil(vector: Vector4f) = Vector4f(ceil(vector.x), ceil(vector.y), ceil(vector.z), ceil(vector.w))

fun round(vector: Vector2f) = Vector2f(round(vector.x).toFloat(), round(vector.y).toFloat())
fun round(vector: Vector3f) = Vector3f(round(vector.x).toFloat(), round(vector.y).toFloat(), round(vector.z).toFloat())
fun round(vector: Vector4f) = Vector4f(round(vector.x).toFloat(), round(vector.y).toFloat(), round(vector.z).toFloat(), round(vector.w).toFloat())

fun clamp(vector: Vector2f, min: Float, max: Float) = Vector2f(clamp(vector.x, min, max), clamp(vector.y, min, max))
fun clamp(vector: Vector3f, min: Float, max: Float) = Vector3f(clamp(vector.x, min, max), clamp(vector.y, min, max), clamp(vector.z, min, max))
fun clamp(vector: Vector4f, min: Float, max: Float) = Vector4f(clamp(vector.x, min, max), clamp(vector.y, min, max), clamp(vector.z, min, max), clamp(vector.w, min, max))

fun wrap(vector: Vector2f, min: Float, max: Float) = Vector2f(wrap(vector.x, min, max), wrap(vector.y, min, max))
fun wrap(vector: Vector3f, min: Float, max: Float) = Vector3f(wrap(vector.x, min, max), wrap(vector.y, min, max), wrap(vector.z, min, max))
fun wrap(vector: Vector4f, min: Float, max: Float) = Vector4f(wrap(vector.x, min, max), wrap(vector.y, min, max), wrap(vector.z, min, max), wrap(vector.w, min, max))

fun sum(vector: Vector2f) = vector.x + vector.y
fun sum(vector: Vector3f) = vector.x + vector.y + vector.z
fun sum(vector: Vector4f) = vector.x + vector.y + vector.z + vector.w

fun dot(a: Vector2f, b: Vector2f) = sum(a * b)
fun dot(a: Vector3f, b: Vector3f) = sum(a * b)
fun dot(a: Vector4f, b: Vector4f) = sum(a * b)

fun dot(a: Quaternion4f, b: Quaternion4f) = dot(a.toVector4f(), b.toVector4f())

fun sqrt(vector: Vector2f) = Vector2f(sqrt(vector.x), sqrt(vector.y))
fun sqrt(vector: Vector3f) = Vector3f(sqrt(vector.x), sqrt(vector.y), sqrt(vector.z))
fun sqrt(vector: Vector4f) = Vector4f(sqrt(vector.x), sqrt(vector.y), sqrt(vector.z), sqrt(vector.w))

fun lengthSquared(vector: Vector2f) = dot(vector, vector)
fun lengthSquared(vector: Vector3f) = dot(vector, vector)
fun lengthSquared(vector: Vector4f) = dot(vector, vector)
fun lengthSquared(vector: Quaternion4f) = dot(vector, vector)

fun length(vector: Vector2f) = sqrt(lengthSquared(vector))
fun length(vector: Vector3f) = sqrt(lengthSquared(vector))
fun length(vector: Vector4f) = sqrt(lengthSquared(vector))
fun length(vector: Quaternion4f) = sqrt(lengthSquared(vector))

fun distance(a: Vector2f, b: Vector2f) = length(a - b)
fun distance(a: Vector3f, b: Vector3f) = length(a - b)
fun distance(a: Vector4f, b: Vector4f) = length(a - b)

fun normalize(vector: Vector2f) = vector / length(vector)
fun normalize(vector: Vector3f) = vector / length(vector)
fun normalize(vector: Vector4f) = vector / length(vector)
fun normalize(vector: Quaternion4f) = vector / length(vector)

fun cross(a: Vector2f, b: Vector2f) = a.x * b.y - a.y * b.x
fun cross(a: Vector3f, b: Vector3f) = Vector3f(a.y * b.z - a.z * b.y, a.z * b.x - a.x * b.z, a.x * b.y - a.y * b.x)

fun min(vector: Vector2f) = Math.min(vector.x, vector.y)
fun min(vector: Vector3f) = Math.min(vector.x, Math.min(vector.y, vector.z))
fun min(vector: Vector4f) = Math.min(vector.x, Math.min(vector.y, Math.min(vector.z, vector.w)))

fun max(vector: Vector2f) = Math.max(vector.x, vector.y)
fun max(vector: Vector3f) = Math.max(vector.x, Math.max(vector.y, vector.z))
fun max(vector: Vector4f) = Math.max(vector.x, Math.max(vector.y, Math.max(vector.z, vector.w)))

fun lerp(a: Vector2f, b: Vector2f, lerpFactor: Float) = (b - a) * lerpFactor + a
fun lerp(a: Vector3f, b: Vector3f, lerpFactor: Float) = (b - a) * lerpFactor + a
fun lerp(a: Vector4f, b: Vector4f, lerpFactor: Float) = (b - a) * lerpFactor + a

//Implementation of these is from my old game engine, other than that, I have no clue where it comes from or why it works
fun nLerp(a: Quaternion4f, b: Quaternion4f, lerpFactor: Float, shortest: Boolean = true): Quaternion4f
{
	val c = if(shortest && dot(a, b) < 0) -b else b

	return normalize((c - a) * lerpFactor + a)
}

fun sLerp(a: Quaternion4f, b: Quaternion4f, lerpFactor: Float, shortest: Boolean = true): Quaternion4f
{
	val epsilon = 1e3f

	val cos = dot(a, b)
	val c = if(shortest && cos < 0) -b else b

	if(abs(cos) >= 1 - epsilon)
		return nLerp(a, c, lerpFactor, false)

	val sin = sqrt(1.0f - cos * cos)
	val angle = atan2(sin, cos)
	val invSin = 1.0f / sin

	val aFactor = sin((1.0f - lerpFactor) * angle) * invSin
	val bFactor = sin(lerpFactor * angle) * invSin

	return (a * aFactor) + (b * bFactor)
}