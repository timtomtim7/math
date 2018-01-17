package blue.sparse.math.vectors.floats

import blue.sparse.math.vectors.ints.Vector2i

data class Vector2f(var x: Float, var y: Float) : FloatVector
{
	constructor(all: Float) : this(all, all)
	constructor(xy: Vector2f) : this(xy.x, xy.y)

	fun assign(x: Float, y: Float)
	{
		this.x = x
		this.y = y
	}

	operator fun plus(other: Vector2f) = Vector2f(x + other.x, y + other.y)
	operator fun minus(other: Vector2f) = Vector2f(x - other.x, y - other.y)
	operator fun times(other: Vector2f) = Vector2f(x * other.x, y * other.y)
	operator fun div(other: Vector2f) = Vector2f(x / other.x, y / other.y)
	operator fun rem(other: Vector2f) = Vector2f(x % other.x, y % other.y)

	operator fun plus(other: Float) = Vector2f(x + other, y + other)
	operator fun minus(other: Float) = Vector2f(x - other, y - other)
	operator fun times(other: Float) = Vector2f(x * other, y * other)
	operator fun div(other: Float) = Vector2f(x / other, y / other)
	operator fun rem(other: Float) = Vector2f(x % other, y % other)

	operator fun plusAssign(other: Vector2f) = assign(x + other.x, y + other.y)
	operator fun minusAssign(other: Vector2f) = assign(x - other.x, y - other.y)
	operator fun timesAssign(other: Vector2f) = assign(x * other.x, y * other.y)
	operator fun divAssign(other: Vector2f) = assign(x / other.x, y / other.y)
	operator fun remAssign(other: Vector2f) = assign(x % other.x, y % other.y)

	operator fun plusAssign(other: Float) = assign(x + other, y + other)
	operator fun minusAssign(other: Float) = assign(x - other, y - other)
	operator fun timesAssign(other: Float) = assign(x * other, y * other)
	operator fun divAssign(other: Float) = assign(x / other, y / other)
	operator fun remAssign(other: Float) = assign(x % other, y % other)

	operator fun unaryPlus() = Vector2f(+x, +y)
	operator fun unaryMinus() = Vector2f(-x, -y)

	override operator fun get(index: Int) = when (index)
	{
		0 -> x
		1 -> y
		else -> throw IndexOutOfBoundsException(index.toString())
	}

	override operator fun set(index: Int, value: Float) = when (index)
	{
		0 -> x = value
		1 -> y = value
		else -> throw IndexOutOfBoundsException(index.toString())
	}

	override fun iterator(): Iterator<Float>
	{
		return sequenceOf(x, y).iterator()
	}

	override fun toIntVector() = Vector2i(x.toInt(), y.toInt())

	override fun clone() = Vector2f(x, y)
}