package blue.sparse.math.util

import blue.sparse.math.floor
import blue.sparse.math.sqrt
import blue.sparse.math.vectors.floats.Vector2f
import blue.sparse.math.vectors.ints.Vector2i

object SquareSpiral
{
	operator fun get(index: Int): Vector2i
	{
		if (index == 0) return Vector2i(0)

		val radius = floor((sqrt(index.toFloat()) - 1) / 2) + 1
		val p = (8 * radius * (radius - 1)) / 2
		val a = (index - p) % (radius * 8)
		val en = radius * 2
		val side = floor(a / en).toInt()

		return when (side)
		{
			0 -> Vector2f(a - radius, -radius)
			1 -> Vector2f(radius, (a % en) - radius)
			2 -> Vector2f(radius - (a % en), radius)
			3 -> Vector2f(-radius, radius - (a % en))
			else -> throw IllegalStateException("Unexpected state!")
		}.toIntVector()
	}
}