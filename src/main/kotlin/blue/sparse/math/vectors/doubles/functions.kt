package blue.sparse.math.vectors.doubles

import blue.sparse.math.*

operator fun Double.plus(other: Vector2d) = Vector2d(this) + other
operator fun Double.minus(other: Vector2d) = Vector2d(this) - other
operator fun Double.times(other: Vector2d) = Vector2d(this) * other
operator fun Double.div(other: Vector2d) = Vector2d(this) / other
operator fun Double.rem(other: Vector2d) = Vector2d(this) % other

operator fun Double.plus(other: Vector3d) = Vector3d(this) + other
operator fun Double.minus(other: Vector3d) = Vector3d(this) - other
operator fun Double.times(other: Vector3d) = Vector3d(this) * other
operator fun Double.div(other: Vector3d) = Vector3d(this) / other
operator fun Double.rem(other: Vector3d) = Vector3d(this) % other

operator fun Double.plus(other: Vector4d) = Vector4d(this) + other
operator fun Double.minus(other: Vector4d) = Vector4d(this) - other
operator fun Double.times(other: Vector4d) = Vector4d(this) * other
operator fun Double.div(other: Vector4d) = Vector4d(this) / other
operator fun Double.rem(other: Vector4d) = Vector4d(this) % other

operator fun Vector3d.times(other: Quaternion4d) = ((other * this) * other.conjugate).toVector3d()

fun abs(vector: Vector2d) = Vector2d(abs(vector.x), abs(vector.y))
fun abs(vector: Vector3d) = Vector3d(abs(vector.x), abs(vector.y), abs(vector.z))
fun abs(vector: Vector4d) = Vector4d(abs(vector.x), abs(vector.y), abs(vector.z), abs(vector.w))

fun floor(vector: Vector2d) = Vector2d(floor(vector.x), floor(vector.y))
fun floor(vector: Vector3d) = Vector3d(floor(vector.x), floor(vector.y), floor(vector.z))
fun floor(vector: Vector4d) = Vector4d(floor(vector.x), floor(vector.y), floor(vector.z), floor(vector.w))

fun ceil(vector: Vector2d) = Vector2d(ceil(vector.x), ceil(vector.y))
fun ceil(vector: Vector3d) = Vector3d(ceil(vector.x), ceil(vector.y), ceil(vector.z))
fun ceil(vector: Vector4d) = Vector4d(ceil(vector.x), ceil(vector.y), ceil(vector.z), ceil(vector.w))

fun round(vector: Vector2d) = Vector2d(round(vector.x).toDouble(), round(vector.y).toDouble())
fun round(vector: Vector3d) = Vector3d(round(vector.x).toDouble(), round(vector.y).toDouble(), round(vector.z).toDouble())
fun round(vector: Vector4d) = Vector4d(round(vector.x).toDouble(), round(vector.y).toDouble(), round(vector.z).toDouble(), round(vector.w).toDouble())

fun clamp(vector: Vector2d, min: Double, max: Double) = Vector2d(clamp(vector.x, min, max), clamp(vector.y, min, max))
fun clamp(vector: Vector3d, min: Double, max: Double) = Vector3d(clamp(vector.x, min, max), clamp(vector.y, min, max), clamp(vector.z, min, max))
fun clamp(vector: Vector4d, min: Double, max: Double) = Vector4d(clamp(vector.x, min, max), clamp(vector.y, min, max), clamp(vector.z, min, max), clamp(vector.w, min, max))

fun wrap(vector: Vector2d, min: Double, max: Double) = Vector2d(wrap(vector.x, min, max), wrap(vector.y, min, max))
fun wrap(vector: Vector3d, min: Double, max: Double) = Vector3d(wrap(vector.x, min, max), wrap(vector.y, min, max), wrap(vector.z, min, max))
fun wrap(vector: Vector4d, min: Double, max: Double) = Vector4d(wrap(vector.x, min, max), wrap(vector.y, min, max), wrap(vector.z, min, max), wrap(vector.w, min, max))

fun sum(vector: Vector2d) = vector.x + vector.y
fun sum(vector: Vector3d) = vector.x + vector.y + vector.z
fun sum(vector: Vector4d) = vector.x + vector.y + vector.z + vector.w

fun dot(a: Vector2d, b: Vector2d) = sum(a * b)
fun dot(a: Vector3d, b: Vector3d) = sum(a * b)
fun dot(a: Vector4d, b: Vector4d) = sum(a * b)

fun dot(a: Quaternion4d, b: Quaternion4d) = dot(a.toVector4d(), b.toVector4d())

fun sqrt(vector: Vector2d) = Vector2d(sqrt(vector.x), sqrt(vector.y))
fun sqrt(vector: Vector3d) = Vector3d(sqrt(vector.x), sqrt(vector.y), sqrt(vector.z))
fun sqrt(vector: Vector4d) = Vector4d(sqrt(vector.x), sqrt(vector.y), sqrt(vector.z), sqrt(vector.w))

fun lengthSquared(vector: Vector2d) = dot(vector, vector)
fun lengthSquared(vector: Vector3d) = dot(vector, vector)
fun lengthSquared(vector: Vector4d) = dot(vector, vector)
fun lengthSquared(vector: Quaternion4d) = dot(vector, vector)

fun length(vector: Vector2d) = sqrt(lengthSquared(vector))
fun length(vector: Vector3d) = sqrt(lengthSquared(vector))
fun length(vector: Vector4d) = sqrt(lengthSquared(vector))
fun length(vector: Quaternion4d) = sqrt(lengthSquared(vector))

fun distance(a: Vector2d, b: Vector2d) = length(a - b)
fun distance(a: Vector3d, b: Vector3d) = length(a - b)
fun distance(a: Vector4d, b: Vector4d) = length(a - b)

fun normalize(vector: Vector2d) = vector / length(vector)
fun normalize(vector: Vector3d) = vector / length(vector)
fun normalize(vector: Vector4d) = vector / length(vector)
fun normalize(vector: Quaternion4d) = vector / length(vector)

fun cross(a: Vector2d, b: Vector2d) = a.x * b.y - a.y * b.x
fun cross(a: Vector3d, b: Vector3d) = Vector3d(a.y * b.z - a.z * b.y, a.z * b.x - a.x * b.z, a.x * b.y - a.y * b.x)

fun min(vector: Vector2d) = Math.min(vector.x, vector.y)
fun min(vector: Vector3d) = Math.min(vector.x, Math.min(vector.y, vector.z))
fun min(vector: Vector4d) = Math.min(vector.x, Math.min(vector.y, Math.min(vector.z, vector.w)))

fun max(vector: Vector2d) = Math.max(vector.x, vector.y)
fun max(vector: Vector3d) = Math.max(vector.x, Math.max(vector.y, vector.z))
fun max(vector: Vector4d) = Math.max(vector.x, Math.max(vector.y, Math.max(vector.z, vector.w)))

fun lerp(a: Vector2d, b: Vector2d, lerpFactor: Double) = (b - a) * lerpFactor + a
fun lerp(a: Vector3d, b: Vector3d, lerpFactor: Double) = (b - a) * lerpFactor + a
fun lerp(a: Vector4d, b: Vector4d, lerpFactor: Double) = (b - a) * lerpFactor + a

//Implementation of these is from my old game engine, other than that, I have no clue where it comes from or why it works
fun nLerp(a: Quaternion4d, b: Quaternion4d, lerpFactor: Double, shortest: Boolean = true): Quaternion4d
{
	val c = if (shortest && dot(a, b) < 0) -b else b

	return normalize((c - a) * lerpFactor + a)
}

fun sLerp(a: Quaternion4d, b: Quaternion4d, lerpFactor: Double, shortest: Boolean = true): Quaternion4d
{
	val epsilon = 1e3f

	val cos = dot(a, b)
	val c = if (shortest && cos < 0) -b else b

	if (abs(cos) >= 1 - epsilon)
		return nLerp(a, c, lerpFactor, false)

	val sin = sqrt(1.0f - cos * cos)
	val angle = atan2(sin, cos)
	val invSin = 1.0f / sin

	val aFactor = sin((1.0f - lerpFactor) * angle) * invSin
	val bFactor = sin(lerpFactor * angle) * invSin

	return (a * aFactor) + (b * bFactor)
}