package blue.sparse.math.vectors.ints

import blue.sparse.math.*
import blue.sparse.math.vectors.floats.Quaternion4f

operator fun Int.plus(other: Vector2i) = Vector2i(this) + other
operator fun Int.minus(other: Vector2i) = Vector2i(this) - other
operator fun Int.times(other: Vector2i) = Vector2i(this) * other
operator fun Int.div(other: Vector2i) = Vector2i(this) / other
operator fun Int.rem(other: Vector2i) = Vector2i(this) % other

operator fun Int.plus(other: Vector3i) = Vector3i(this) + other
operator fun Int.minus(other: Vector3i) = Vector3i(this) - other
operator fun Int.times(other: Vector3i) = Vector3i(this) * other
operator fun Int.div(other: Vector3i) = Vector3i(this) / other
operator fun Int.rem(other: Vector3i) = Vector3i(this) % other

operator fun Int.plus(other: Vector4i) = Vector4i(this) + other
operator fun Int.minus(other: Vector4i) = Vector4i(this) - other
operator fun Int.times(other: Vector4i) = Vector4i(this) * other
operator fun Int.div(other: Vector4i) = Vector4i(this) / other
operator fun Int.rem(other: Vector4i) = Vector4i(this) % other

fun abs(vector: Vector2i) = Vector2i(abs(vector.x), abs(vector.y))
fun abs(vector: Vector3i) = Vector3i(abs(vector.x), abs(vector.y), abs(vector.z))
fun abs(vector: Vector4i) = Vector4i(abs(vector.x), abs(vector.y), abs(vector.z), abs(vector.w))

fun clamp(vector: Vector2i, min: Int, max: Int) = Vector2i(clamp(vector.x, min, max), clamp(vector.y, min, max))
fun clamp(vector: Vector3i, min: Int, max: Int) = Vector3i(clamp(vector.x, min, max), clamp(vector.y, min, max), clamp(vector.z, min, max))
fun clamp(vector: Vector4i, min: Int, max: Int) = Vector4i(clamp(vector.x, min, max), clamp(vector.y, min, max), clamp(vector.z, min, max), clamp(vector.w, min, max))

fun wrap(vector: Vector2i, min: Int, max: Int) = Vector2i(wrap(vector.x, min, max), wrap(vector.y, min, max))
fun wrap(vector: Vector3i, min: Int, max: Int) = Vector3i(wrap(vector.x, min, max), wrap(vector.y, min, max), wrap(vector.z, min, max))
fun wrap(vector: Vector4i, min: Int, max: Int) = Vector4i(wrap(vector.x, min, max), wrap(vector.y, min, max), wrap(vector.z, min, max), wrap(vector.w, min, max))

fun sum(vector: Vector2i) = vector.x + vector.y
fun sum(vector: Vector3i) = vector.x + vector.y + vector.z
fun sum(vector: Vector4i) = vector.x + vector.y + vector.z + vector.w

fun dot(a: Vector2i, b: Vector2i) = sum(a * b)
fun dot(a: Vector3i, b: Vector3i) = sum(a * b)
fun dot(a: Vector4i, b: Vector4i) = sum(a * b)

//fun sqrt(vector: Vector2i) = Vector2i(sqrt(vector.x), sqrt(vector.y))
//fun sqrt(vector: Vector3i) = Vector3i(sqrt(vector.x), sqrt(vector.y), sqrt(vector.z))
//fun sqrt(vector: Vector4i) = Vector4i(sqrt(vector.x), sqrt(vector.y), sqrt(vector.z), sqrt(vector.w))

fun lengthSquared(vector: Vector2i) = dot(vector, vector)
fun lengthSquared(vector: Vector3i) = dot(vector, vector)
fun lengthSquared(vector: Vector4i) = dot(vector, vector)

//fun length(vector: Vector2i) = sqrt(lengthSquared(vector))
//fun length(vector: Vector3i) = sqrt(lengthSquared(vector))
//fun length(vector: Vector4i) = sqrt(lengthSquared(vector))
//fun length(vector: Quaternion4f) = sqrt(lengthSquared(vector))

//fun distance(a: Vector2i, b: Vector2i) = length(a - b)
//fun distance(a: Vector3i, b: Vector3i) = length(a - b)
//fun distance(a: Vector4i, b: Vector4i) = length(a - b)

//fun normalize(vector: Vector2i) = vector / length(vector)
//fun normalize(vector: Vector3i) = vector / length(vector)
//fun normalize(vector: Vector4i) = vector / length(vector)
//fun normalize(vector: Quaternion4f) = vector / length(vector)

fun cross(a: Vector2i, b: Vector2i) = a.x * b.y - a.y * b.x
fun cross(a: Vector3i, b: Vector3i) = Vector3i(a.y * b.z - a.z * b.y, a.z * b.x - a.x * b.z, a.x * b.y - a.y * b.x)

fun min(vector: Vector2i) = Math.min(vector.x, vector.y)
fun min(vector: Vector3i) = Math.min(vector.x, Math.min(vector.y, vector.z))
fun min(vector: Vector4i) = Math.min(vector.x, Math.min(vector.y, Math.min(vector.z, vector.w)))

fun max(vector: Vector2i) = Math.max(vector.x, vector.y)
fun max(vector: Vector3i) = Math.max(vector.x, Math.max(vector.y, vector.z))
fun max(vector: Vector4i) = Math.max(vector.x, Math.max(vector.y, Math.max(vector.z, vector.w)))