package blue.sparse.math.vectors.ints

import blue.sparse.math.vectors.floats.Vector2f

data class Vector2i(var x: Int, var y: Int) : IntVector
{
	constructor(all: Int) : this(all, all)
	constructor(xy: Vector2i) : this(xy.x, xy.y)

	fun assign(x: Int, y: Int)
	{
		this.x = x
		this.y = y
	}

	operator fun plus(other: Vector2i) = Vector2i(x + other.x, y + other.y)
	operator fun minus(other: Vector2i) = Vector2i(x - other.x, y - other.y)
	operator fun times(other: Vector2i) = Vector2i(x * other.x, y * other.y)
	operator fun div(other: Vector2i) = Vector2i(x / other.x, y / other.y)
	operator fun rem(other: Vector2i) = Vector2i(x % other.x, y % other.y)

	operator fun plus(other: Int) = Vector2i(x + other, y + other)
	operator fun minus(other: Int) = Vector2i(x - other, y - other)
	operator fun times(other: Int) = Vector2i(x * other, y * other)
	operator fun div(other: Int) = Vector2i(x / other, y / other)
	operator fun rem(other: Int) = Vector2i(x % other, y % other)

	operator fun plusAssign(other: Vector2i) = assign(x + other.x, y + other.y)
	operator fun minusAssign(other: Vector2i) = assign(x - other.x, y - other.y)
	operator fun timesAssign(other: Vector2i) = assign(x * other.x, y * other.y)
	operator fun divAssign(other: Vector2i) = assign(x / other.x, y / other.y)
	operator fun remAssign(other: Vector2i) = assign(x % other.x, y % other.y)

	operator fun plusAssign(other: Int) = assign(x + other, y + other)
	operator fun minusAssign(other: Int) = assign(x - other, y - other)
	operator fun timesAssign(other: Int) = assign(x * other, y * other)
	operator fun divAssign(other: Int) = assign(x / other, y / other)
	operator fun remAssign(other: Int) = assign(x % other, y % other)

	operator fun unaryPlus() = Vector2i(+x, +y)
	operator fun unaryMinus() = Vector2i(-x, -y)

	override operator fun get(index: Int) = when (index)
	{
		0 -> x
		1 -> y
		else -> throw IndexOutOfBoundsException(index.toString())
	}

	override operator fun set(index: Int, value: Int) = when (index)
	{
		0 -> x = value
		1 -> y = value
		else -> throw IndexOutOfBoundsException(index.toString())
	}

	override fun iterator(): Iterator<Int>
	{
		return sequenceOf(x, y).iterator()
	}

	override fun toFloatVector() = Vector2f(x.toFloat(), y.toFloat())

	override fun clone() = Vector2i(x, y)
}