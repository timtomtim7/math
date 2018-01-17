package blue.sparse.math.vectors.doubles

import blue.sparse.math.vectors.floats.Vector2f
import blue.sparse.math.vectors.ints.Vector2i

data class Vector2d(var x: Double, var y: Double) : DoubleVector
{
	constructor(all: Double) : this(all, all)
	constructor(xy: Vector2d) : this(xy.x, xy.y)

	fun assign(x: Double, y: Double)
	{
		this.x = x
		this.y = y
	}

	operator fun plus(other: Vector2d) = Vector2d(x + other.x, y + other.y)
	operator fun minus(other: Vector2d) = Vector2d(x - other.x, y - other.y)
	operator fun times(other: Vector2d) = Vector2d(x * other.x, y * other.y)
	operator fun div(other: Vector2d) = Vector2d(x / other.x, y / other.y)
	operator fun rem(other: Vector2d) = Vector2d(x % other.x, y % other.y)

	operator fun plus(other: Double) = Vector2d(x + other, y + other)
	operator fun minus(other: Double) = Vector2d(x - other, y - other)
	operator fun times(other: Double) = Vector2d(x * other, y * other)
	operator fun div(other: Double) = Vector2d(x / other, y / other)
	operator fun rem(other: Double) = Vector2d(x % other, y % other)

	operator fun plusAssign(other: Vector2d) = assign(x + other.x, y + other.y)
	operator fun minusAssign(other: Vector2d) = assign(x - other.x, y - other.y)
	operator fun timesAssign(other: Vector2d) = assign(x * other.x, y * other.y)
	operator fun divAssign(other: Vector2d) = assign(x / other.x, y / other.y)
	operator fun remAssign(other: Vector2d) = assign(x % other.x, y % other.y)

	operator fun plusAssign(other: Double) = assign(x + other, y + other)
	operator fun minusAssign(other: Double) = assign(x - other, y - other)
	operator fun timesAssign(other: Double) = assign(x * other, y * other)
	operator fun divAssign(other: Double) = assign(x / other, y / other)
	operator fun remAssign(other: Double) = assign(x % other, y % other)

	operator fun unaryPlus() = Vector2d(+x, +y)
	operator fun unaryMinus() = Vector2d(-x, -y)

	override operator fun get(index: Int) = when (index)
	{
		0 -> x
		1 -> y
		else -> throw IndexOutOfBoundsException(index.toString())
	}

	override operator fun set(index: Int, value: Double) = when (index)
	{
		0 -> x = value
		1 -> y = value
		else -> throw IndexOutOfBoundsException(index.toString())
	}

	override fun iterator(): Iterator<Double>
	{
		return sequenceOf(x, y).iterator()
	}

	override fun toIntVector() = Vector2i(x.toInt(), y.toInt())
	override fun toFloatVector() = Vector2f(x.toFloat(), y.toFloat())

	override fun clone() = Vector2d(x, y)
}