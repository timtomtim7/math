package blue.sparse.math.vectors.ints

import blue.sparse.math.vectors.floats.FloatVector

interface IntVector : Iterable<Int>, Cloneable
{
	operator fun get(index: Int): Int
	operator fun set(index: Int, value: Int)

	fun toFloatVector(): FloatVector

	public override fun clone(): IntVector
}