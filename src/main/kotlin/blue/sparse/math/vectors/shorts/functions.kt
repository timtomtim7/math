package blue.sparse.math.vectors.shorts

import blue.sparse.math.abs

operator fun Short.plus(other: Vector2s) = Vector2s(this) + other
operator fun Short.minus(other: Vector2s) = Vector2s(this) - other
operator fun Short.times(other: Vector2s) = Vector2s(this) * other
operator fun Short.div(other: Vector2s) = Vector2s(this) / other
operator fun Short.rem(other: Vector2s) = Vector2s(this) % other

operator fun Short.plus(other: Vector3s) = Vector3s(this) + other
operator fun Short.minus(other: Vector3s) = Vector3s(this) - other
operator fun Short.times(other: Vector3s) = Vector3s(this) * other
operator fun Short.div(other: Vector3s) = Vector3s(this) / other
operator fun Short.rem(other: Vector3s) = Vector3s(this) % other

operator fun Short.plus(other: Vector4s) = Vector4s(this) + other
operator fun Short.minus(other: Vector4s) = Vector4s(this) - other
operator fun Short.times(other: Vector4s) = Vector4s(this) * other
operator fun Short.div(other: Vector4s) = Vector4s(this) / other
operator fun Short.rem(other: Vector4s) = Vector4s(this) % other

fun abs(vector: Vector2s) = Vector2s(abs(vector.x), abs(vector.y))
fun abs(vector: Vector3s) = Vector3s(abs(vector.x), abs(vector.y), abs(vector.z))
fun abs(vector: Vector4s) = Vector4s(abs(vector.x), abs(vector.y), abs(vector.z), abs(vector.w))

fun sum(vector: Vector2s) = vector.x + vector.y
fun sum(vector: Vector3s) = vector.x + vector.y + vector.z
fun sum(vector: Vector4s) = vector.x + vector.y + vector.z + vector.w

fun dot(a: Vector2s, b: Vector2s) = sum(a * b)
fun dot(a: Vector3s, b: Vector3s) = sum(a * b)
fun dot(a: Vector4s, b: Vector4s) = sum(a * b)

fun lengthSquared(vector: Vector2s) = dot(vector, vector)
fun lengthSquared(vector: Vector3s) = dot(vector, vector)
fun lengthSquared(vector: Vector4s) = dot(vector, vector)

fun cross(a: Vector2s, b: Vector2s) = a.x * b.y - a.y * b.x
fun cross(a: Vector3s, b: Vector3s) = Vector3s(a.y * b.z - a.z * b.y, a.z * b.x - a.x * b.z, a.x * b.y - a.y * b.x)
