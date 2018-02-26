package blue.sparse.math.vectors.shorts

interface ShortVector : Iterable<Short>, Cloneable
{
	operator fun get(index: Int): Short
	operator fun set(index: Int, value: Short)

	public override fun clone(): ShortVector
}