package blue.sparse.math.vectors.bytes

interface ByteVector : Iterable<Byte>, Cloneable
{
	operator fun get(index: Int): Byte
	operator fun set(index: Int, value: Byte)

	public override fun clone(): ByteVector
}