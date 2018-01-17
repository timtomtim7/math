package blue.sparse.math.vectors.floats

import blue.sparse.math.vectors.ints.Vector2i
import blue.sparse.math.vectors.ints.Vector3i

data class Vector3f(var x: Float, var y: Float, var z: Float) : FloatVector
{
	constructor(all: Float) : this(all, all, all)
	constructor(xy: Vector2f, z: Float) : this(xy.x, xy.y, z)
	constructor(x: Float, yz: Vector2f) : this(x, yz.x, yz.y)
	constructor(xyz: Vector3f) : this(xyz.x, xyz.y, xyz.z)

	fun assign(x: Float, y: Float, z: Float)
	{
		this.x = x
		this.y = y
		this.z = z
	}

	operator fun plus(other: Vector3f) = Vector3f(x + other.x, y + other.y, z + other.z)
	operator fun minus(other: Vector3f) = Vector3f(x - other.x, y - other.y, z - other.z)
	operator fun times(other: Vector3f) = Vector3f(x * other.x, y * other.y, z * other.z)
	operator fun div(other: Vector3f) = Vector3f(x / other.x, y / other.y, z / other.z)
	operator fun rem(other: Vector3f) = Vector3f(x % other.x, y % other.y, z % other.z)

	operator fun plus(other: Float) = Vector3f(x + other, y + other, z + other)
	operator fun minus(other: Float) = Vector3f(x - other, y - other, z - other)
	operator fun times(other: Float) = Vector3f(x * other, y * other, z * other)
	operator fun div(other: Float) = Vector3f(x / other, y / other, z / other)
	operator fun rem(other: Float) = Vector3f(x % other, y % other, z % other)

	operator fun plusAssign(other: Vector3f) = assign(x + other.x, y + other.y, z + other.z)
	operator fun minusAssign(other: Vector3f) = assign(x - other.x, y - other.y, z - other.z)
	operator fun timesAssign(other: Vector3f) = assign(x * other.x, y * other.y, z * other.z)
	operator fun divAssign(other: Vector3f) = assign(x / other.x, y / other.y, z / other.z)
	operator fun remAssign(other: Vector3f) = assign(x % other.x, y % other.y, z % other.z)

	operator fun plusAssign(other: Float) = assign(x + other, y + other, z + other)
	operator fun minusAssign(other: Float) = assign(x - other, y - other, z - other)
	operator fun timesAssign(other: Float) = assign(x * other, y * other, z * other)
	operator fun divAssign(other: Float) = assign(x / other, y / other, z / other)
	operator fun remAssign(other: Float) = assign(x % other, y % other, z % other)

	operator fun unaryPlus() = Vector3f(+x, +y, +z)
	operator fun unaryMinus() = Vector3f(-x, -y, -z)

	override operator fun get(index: Int) = when (index)
	{
		0 -> x
		1 -> y
		2 -> z
		else -> throw IndexOutOfBoundsException(index.toString())
	}

	override operator fun set(index: Int, value: Float) = when (index)
	{
		0 -> x = value
		1 -> y = value
		2 -> z = value
		else -> throw IndexOutOfBoundsException(index.toString())
	}

	override fun iterator(): Iterator<Float>
	{
		return sequenceOf(x, y, z).iterator()
	}

	override fun toIntVector() = Vector3i(x.toInt(), y.toInt(), z.toInt())

	override fun clone() = Vector3f(x, y, z)
}