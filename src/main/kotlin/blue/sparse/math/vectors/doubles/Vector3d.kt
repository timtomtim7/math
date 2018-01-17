package blue.sparse.math.vectors.doubles

import blue.sparse.math.vectors.floats.Vector3f
import blue.sparse.math.vectors.ints.Vector3i

data class Vector3d(var x: Double, var y: Double, var z: Double) : DoubleVector
{
	constructor(all: Double) : this(all, all, all)
	constructor(xy: Vector2d, z: Double) : this(xy.x, xy.y, z)
	constructor(x: Double, yz: Vector2d) : this(x, yz.x, yz.y)
	constructor(xyz: Vector3d) : this(xyz.x, xyz.y, xyz.z)

	fun assign(x: Double, y: Double, z: Double)
	{
		this.x = x
		this.y = y
		this.z = z
	}

	operator fun plus(other: Vector3d) = Vector3d(x + other.x, y + other.y, z + other.z)
	operator fun minus(other: Vector3d) = Vector3d(x - other.x, y - other.y, z - other.z)
	operator fun times(other: Vector3d) = Vector3d(x * other.x, y * other.y, z * other.z)
	operator fun div(other: Vector3d) = Vector3d(x / other.x, y / other.y, z / other.z)
	operator fun rem(other: Vector3d) = Vector3d(x % other.x, y % other.y, z % other.z)

	operator fun plus(other: Double) = Vector3d(x + other, y + other, z + other)
	operator fun minus(other: Double) = Vector3d(x - other, y - other, z - other)
	operator fun times(other: Double) = Vector3d(x * other, y * other, z * other)
	operator fun div(other: Double) = Vector3d(x / other, y / other, z / other)
	operator fun rem(other: Double) = Vector3d(x % other, y % other, z % other)

	operator fun plusAssign(other: Vector3d) = assign(x + other.x, y + other.y, z + other.z)
	operator fun minusAssign(other: Vector3d) = assign(x - other.x, y - other.y, z - other.z)
	operator fun timesAssign(other: Vector3d) = assign(x * other.x, y * other.y, z * other.z)
	operator fun divAssign(other: Vector3d) = assign(x / other.x, y / other.y, z / other.z)
	operator fun remAssign(other: Vector3d) = assign(x % other.x, y % other.y, z % other.z)

	operator fun plusAssign(other: Double) = assign(x + other, y + other, z + other)
	operator fun minusAssign(other: Double) = assign(x - other, y - other, z - other)
	operator fun timesAssign(other: Double) = assign(x * other, y * other, z * other)
	operator fun divAssign(other: Double) = assign(x / other, y / other, z / other)
	operator fun remAssign(other: Double) = assign(x % other, y % other, z % other)

	operator fun unaryPlus() = Vector3d(+x, +y, +z)
	operator fun unaryMinus() = Vector3d(-x, -y, -z)

	override operator fun get(index: Int) = when (index)
	{
		0 -> x
		1 -> y
		2 -> z
		else -> throw IndexOutOfBoundsException(index.toString())
	}

	override operator fun set(index: Int, value: Double) = when (index)
	{
		0 -> x = value
		1 -> y = value
		2 -> z = value
		else -> throw IndexOutOfBoundsException(index.toString())
	}

	override fun iterator(): Iterator<Double>
	{
		return sequenceOf(x, y, z).iterator()
	}

	override fun toIntVector() = Vector3i(x.toInt(), y.toInt(), z.toInt())
	override fun toFloatVector() = Vector3f(x.toFloat(), y.toFloat(), z.toFloat())

	override fun clone() = Vector3d(x, y, z)
}