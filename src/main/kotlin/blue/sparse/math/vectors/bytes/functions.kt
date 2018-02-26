package blue.sparse.math.vectors.bytes

import blue.sparse.math.abs

operator fun Byte.plus(other: Vector2b) = Vector2b(this) + other
operator fun Byte.minus(other: Vector2b) = Vector2b(this) - other
operator fun Byte.times(other: Vector2b) = Vector2b(this) * other
operator fun Byte.div(other: Vector2b) = Vector2b(this) / other
operator fun Byte.rem(other: Vector2b) = Vector2b(this) % other

operator fun Byte.plus(other: Vector3b) = Vector3b(this) + other
operator fun Byte.minus(other: Vector3b) = Vector3b(this) - other
operator fun Byte.times(other: Vector3b) = Vector3b(this) * other
operator fun Byte.div(other: Vector3b) = Vector3b(this) / other
operator fun Byte.rem(other: Vector3b) = Vector3b(this) % other

operator fun Byte.plus(other: Vector4b) = Vector4b(this) + other
operator fun Byte.minus(other: Vector4b) = Vector4b(this) - other
operator fun Byte.times(other: Vector4b) = Vector4b(this) * other
operator fun Byte.div(other: Vector4b) = Vector4b(this) / other
operator fun Byte.rem(other: Vector4b) = Vector4b(this) % other

fun abs(vector: Vector2b) = Vector2b(abs(vector.x), abs(vector.y))
fun abs(vector: Vector3b) = Vector3b(abs(vector.x), abs(vector.y), abs(vector.z))
fun abs(vector: Vector4b) = Vector4b(abs(vector.x), abs(vector.y), abs(vector.z), abs(vector.w))

fun sum(vector: Vector2b) = vector.x + vector.y
fun sum(vector: Vector3b) = vector.x + vector.y + vector.z
fun sum(vector: Vector4b) = vector.x + vector.y + vector.z + vector.w

fun dot(a: Vector2b, b: Vector2b) = sum(a * b)
fun dot(a: Vector3b, b: Vector3b) = sum(a * b)
fun dot(a: Vector4b, b: Vector4b) = sum(a * b)

fun lengthSquared(vector: Vector2b) = dot(vector, vector)
fun lengthSquared(vector: Vector3b) = dot(vector, vector)
fun lengthSquared(vector: Vector4b) = dot(vector, vector)

fun cross(a: Vector2b, b: Vector2b) = a.x * b.y - a.y * b.x
fun cross(a: Vector3b, b: Vector3b) = Vector3b(a.y * b.z - a.z * b.y, a.z * b.x - a.x * b.z, a.x * b.y - a.y * b.x)
