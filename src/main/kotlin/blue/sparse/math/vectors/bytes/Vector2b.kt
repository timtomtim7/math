package blue.sparse.math.vectors.bytes

data class Vector2b(var x: Byte, var y: Byte) : ByteVector
{
	constructor(all: Byte) : this(all, all)
	constructor(xy: Vector2b) : this(xy.x, xy.y)

	constructor(x: Int, y: Int) : this(x.toByte(), y.toByte())

	fun assign(x: Byte, y: Byte)
	{
		this.x = x
		this.y = y
	}

	fun assign(x: Int, y: Int)
	{
		assign(x.toByte(), y.toByte())
	}

	operator fun plus(other: Vector2b) = Vector2b(x + other.x, y + other.y)
	operator fun minus(other: Vector2b) = Vector2b(x - other.x, y - other.y)
	operator fun times(other: Vector2b) = Vector2b(x * other.x, y * other.y)
	operator fun div(other: Vector2b) = Vector2b(x / other.x, y / other.y)
	operator fun rem(other: Vector2b) = Vector2b(x % other.x, y % other.y)

	operator fun plus(other: Byte) = Vector2b(x + other, y + other)
	operator fun minus(other: Byte) = Vector2b(x - other, y - other)
	operator fun times(other: Byte) = Vector2b(x * other, y * other)
	operator fun div(other: Byte) = Vector2b(x / other, y / other)
	operator fun rem(other: Byte) = Vector2b(x % other, y % other)

	operator fun plusAssign(other: Vector2b) = assign(x + other.x, y + other.y)
	operator fun minusAssign(other: Vector2b) = assign(x - other.x, y - other.y)
	operator fun timesAssign(other: Vector2b) = assign(x * other.x, y * other.y)
	operator fun divAssign(other: Vector2b) = assign(x / other.x, y / other.y)
	operator fun remAssign(other: Vector2b) = assign(x % other.x, y % other.y)

	operator fun plusAssign(other: Byte) = assign(x + other, y + other)
	operator fun minusAssign(other: Byte) = assign(x - other, y - other)
	operator fun timesAssign(other: Byte) = assign(x * other, y * other)
	operator fun divAssign(other: Byte) = assign(x / other, y / other)
	operator fun remAssign(other: Byte) = assign(x % other, y % other)

	operator fun unaryPlus() = Vector2b(+x, +y)
	operator fun unaryMinus() = Vector2b(-x, -y)

	override operator fun get(index: Int) = when (index)
	{
		0 -> x
		1 -> y
		else -> throw IndexOutOfBoundsException(index.toString())
	}

	override operator fun set(index: Int, value: Byte) = when (index)
	{
		0 -> x = value
		1 -> y = value
		else -> throw IndexOutOfBoundsException(index.toString())
	}

	override fun iterator(): Iterator<Byte>
	{
		return sequenceOf(x, y).iterator()
	}

	override fun clone() = Vector2b(x, y)
}