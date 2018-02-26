package blue.sparse.math.vectors.shorts

data class Vector2s(var x: Short, var y: Short) : ShortVector
{
	constructor(all: Short) : this(all, all)
	constructor(xy: Vector2s) : this(xy.x, xy.y)

	constructor(x: Int, y: Int) : this(x.toShort(), y.toShort())

	fun assign(x: Short, y: Short)
	{
		this.x = x
		this.y = y
	}

	fun assign(x: Int, y: Int)
	{
		assign(x.toShort(), y.toShort())
	}

	operator fun plus(other: Vector2s) = Vector2s(x + other.x, y + other.y)
	operator fun minus(other: Vector2s) = Vector2s(x - other.x, y - other.y)
	operator fun times(other: Vector2s) = Vector2s(x * other.x, y * other.y)
	operator fun div(other: Vector2s) = Vector2s(x / other.x, y / other.y)
	operator fun rem(other: Vector2s) = Vector2s(x % other.x, y % other.y)

	operator fun plus(other: Short) = Vector2s(x + other, y + other)
	operator fun minus(other: Short) = Vector2s(x - other, y - other)
	operator fun times(other: Short) = Vector2s(x * other, y * other)
	operator fun div(other: Short) = Vector2s(x / other, y / other)
	operator fun rem(other: Short) = Vector2s(x % other, y % other)

	operator fun plusAssign(other: Vector2s) = assign(x + other.x, y + other.y)
	operator fun minusAssign(other: Vector2s) = assign(x - other.x, y - other.y)
	operator fun timesAssign(other: Vector2s) = assign(x * other.x, y * other.y)
	operator fun divAssign(other: Vector2s) = assign(x / other.x, y / other.y)
	operator fun remAssign(other: Vector2s) = assign(x % other.x, y % other.y)

	operator fun plusAssign(other: Short) = assign(x + other, y + other)
	operator fun minusAssign(other: Short) = assign(x - other, y - other)
	operator fun timesAssign(other: Short) = assign(x * other, y * other)
	operator fun divAssign(other: Short) = assign(x / other, y / other)
	operator fun remAssign(other: Short) = assign(x % other, y % other)

	operator fun unaryPlus() = Vector2s(+x, +y)
	operator fun unaryMinus() = Vector2s(-x, -y)

	override operator fun get(index: Int) = when (index)
	{
		0 -> x
		1 -> y
		else -> throw IndexOutOfBoundsException(index.toString())
	}

	override operator fun set(index: Int, value: Short) = when (index)
	{
		0 -> x = value
		1 -> y = value
		else -> throw IndexOutOfBoundsException(index.toString())
	}

	override fun iterator(): Iterator<Short>
	{
		return sequenceOf(x, y).iterator()
	}

	override fun clone() = Vector2s(x, y)
}