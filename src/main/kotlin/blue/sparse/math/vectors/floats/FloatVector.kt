package blue.sparse.math.vectors.floats

import blue.sparse.math.vectors.ints.IntVector

interface FloatVector: Iterable<Float>, Cloneable
{
	operator fun get(index: Int): Float
	operator fun set(index: Int, value: Float)

	fun toIntVector(): IntVector

	public override fun clone(): FloatVector
}