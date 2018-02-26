package blue.sparse.math.vectors.ints

import blue.sparse.math.vectors.floats.Vector3f

data class Vector3i(var x: Int, var y: Int, var z: Int) : IntVector
{
	constructor(all: Int) : this(all, all, all)
	constructor(xy: Vector2i, z: Int) : this(xy.x, xy.y, z)
	constructor(x: Int, yz: Vector2i) : this(x, yz.x, yz.y)
	constructor(xyz: Vector3i) : this(xyz.x, xyz.y, xyz.z)

	fun assign(x: Int, y: Int, z: Int)
	{
		this.x = x
		this.y = y
		this.z = z
	}

	operator fun plus(other: Vector3i) = Vector3i(x + other.x, y + other.y, z + other.z)
	operator fun minus(other: Vector3i) = Vector3i(x - other.x, y - other.y, z - other.z)
	operator fun times(other: Vector3i) = Vector3i(x * other.x, y * other.y, z * other.z)
	operator fun div(other: Vector3i) = Vector3i(x / other.x, y / other.y, z / other.z)
	operator fun rem(other: Vector3i) = Vector3i(x % other.x, y % other.y, z % other.z)

	operator fun plus(other: Int) = Vector3i(x + other, y + other, z + other)
	operator fun minus(other: Int) = Vector3i(x - other, y - other, z - other)
	operator fun times(other: Int) = Vector3i(x * other, y * other, z * other)
	operator fun div(other: Int) = Vector3i(x / other, y / other, z / other)
	operator fun rem(other: Int) = Vector3i(x % other, y % other, z % other)

	operator fun plusAssign(other: Vector3i) = assign(x + other.x, y + other.y, z + other.z)
	operator fun minusAssign(other: Vector3i) = assign(x - other.x, y - other.y, z - other.z)
	operator fun timesAssign(other: Vector3i) = assign(x * other.x, y * other.y, z * other.z)
	operator fun divAssign(other: Vector3i) = assign(x / other.x, y / other.y, z / other.z)
	operator fun remAssign(other: Vector3i) = assign(x % other.x, y % other.y, z % other.z)

	operator fun plusAssign(other: Int) = assign(x + other, y + other, z + other)
	operator fun minusAssign(other: Int) = assign(x - other, y - other, z - other)
	operator fun timesAssign(other: Int) = assign(x * other, y * other, z * other)
	operator fun divAssign(other: Int) = assign(x / other, y / other, z / other)
	operator fun remAssign(other: Int) = assign(x % other, y % other, z % other)

	operator fun unaryPlus() = Vector3i(+x, +y, +z)
	operator fun unaryMinus() = Vector3i(-x, -y, -z)

	override operator fun get(index: Int) = when (index)
	{
		0 -> x
		1 -> y
		2 -> z
		else -> throw IndexOutOfBoundsException(index.toString())
	}

	override operator fun set(index: Int, value: Int) = when (index)
	{
		0 -> x = value
		1 -> y = value
		2 -> z = value
		else -> throw IndexOutOfBoundsException(index.toString())
	}

	override fun iterator(): Iterator<Int>
	{
		return sequenceOf(x, y, z).iterator()
	}

	override fun toFloatVector() = Vector3f(x.toFloat(), y.toFloat(), z.toFloat())

	override fun clone() = Vector3i(x, y, z)
}