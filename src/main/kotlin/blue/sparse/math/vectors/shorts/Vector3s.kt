package blue.sparse.math.vectors.shorts

data class Vector3s(var x: Short, var y: Short, var z: Short) : ShortVector
{
	constructor(all: Short) : this(all, all, all)
	constructor(xy: Vector2s, z: Short) : this(xy.x, xy.y, z)
	constructor(x: Short, yz: Vector2s) : this(x, yz.x, yz.y)
	constructor(xyz: Vector3s) : this(xyz.x, xyz.y, xyz.z)

	constructor(x: Int, y: Int, z: Int): this(x.toShort(), y.toShort(), z.toShort())

	fun assign(x: Short, y: Short, z: Short)
	{
		this.x = x
		this.y = y
		this.z = z
	}

	fun assign(x: Int, y: Int, z: Int)
	{
		assign(x.toShort(), y.toShort(), z.toShort())
	}

	operator fun plus(other: Vector3s) = Vector3s(x + other.x, y + other.y, z + other.z)
	operator fun minus(other: Vector3s) = Vector3s(x - other.x, y - other.y, z - other.z)
	operator fun times(other: Vector3s) = Vector3s(x * other.x, y * other.y, z * other.z)
	operator fun div(other: Vector3s) = Vector3s(x / other.x, y / other.y, z / other.z)
	operator fun rem(other: Vector3s) = Vector3s(x % other.x, y % other.y, z % other.z)

	operator fun plus(other: Short) = Vector3s(x + other, y + other, z + other)
	operator fun minus(other: Short) = Vector3s(x - other, y - other, z - other)
	operator fun times(other: Short) = Vector3s(x * other, y * other, z * other)
	operator fun div(other: Short) = Vector3s(x / other, y / other, z / other)
	operator fun rem(other: Short) = Vector3s(x % other, y % other, z % other)

	operator fun plusAssign(other: Vector3s) = assign(x + other.x, y + other.y, z + other.z)
	operator fun minusAssign(other: Vector3s) = assign(x - other.x, y - other.y, z - other.z)
	operator fun timesAssign(other: Vector3s) = assign(x * other.x, y * other.y, z * other.z)
	operator fun divAssign(other: Vector3s) = assign(x / other.x, y / other.y, z / other.z)
	operator fun remAssign(other: Vector3s) = assign(x % other.x, y % other.y, z % other.z)

	operator fun plusAssign(other: Short) = assign(x + other, y + other, z + other)
	operator fun minusAssign(other: Short) = assign(x - other, y - other, z - other)
	operator fun timesAssign(other: Short) = assign(x * other, y * other, z * other)
	operator fun divAssign(other: Short) = assign(x / other, y / other, z / other)
	operator fun remAssign(other: Short) = assign(x % other, y % other, z % other)

	operator fun unaryPlus() = Vector3s(+x, +y, +z)
	operator fun unaryMinus() = Vector3s(-x, -y, -z)

	override operator fun get(index: Int) = when (index)
	{
		0 -> x
		1 -> y
		2 -> z
		else -> throw IndexOutOfBoundsException(index.toString())
	}

	override operator fun set(index: Int, value: Short) = when (index)
	{
		0 -> x = value
		1 -> y = value
		2 -> z = value
		else -> throw IndexOutOfBoundsException(index.toString())
	}

	override fun iterator(): Iterator<Short>
	{
		return sequenceOf(x, y, z).iterator()
	}

	override fun clone() = Vector3s(x, y, z)
}