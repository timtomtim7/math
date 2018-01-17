package blue.sparse.math.vectors.floats

enum class Axis(vector: Vector4f)
{
	X(Vector4f(1f, 0f, 0f, 0f)),
	Y(Vector4f(0f, 1f, 0f, 0f)),
	Z(Vector4f(0f, 0f, 1f, 0f)),
	W(Vector4f(0f, 0f, 0f, 1f));

	val vector2: Vector2f = vector.xy
		get() = field.copy()

	val vector3: Vector3f = vector.xyz
		get() = field.copy()

	val vector4: Vector4f = vector
		get() = field.copy()
}