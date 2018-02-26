package blue.sparse.math.vectors.bytes

data class Vector3b(var x: Byte, var y: Byte, var z: Byte) : ByteVector
{
	constructor(all: Byte) : this(all, all, all)
	constructor(xy: Vector2b, z: Byte) : this(xy.x, xy.y, z)
	constructor(x: Byte, yz: Vector2b) : this(x, yz.x, yz.y)
	constructor(xyz: Vector3b) : this(xyz.x, xyz.y, xyz.z)

	constructor(x: Int, y: Int, z: Int): this(x.toByte(), y.toByte(), z.toByte())

	fun assign(x: Byte, y: Byte, z: Byte)
	{
		this.x = x
		this.y = y
		this.z = z
	}

	fun assign(x: Int, y: Int, z: Int)
	{
		assign(x.toByte(), y.toByte(), z.toByte())
	}

	operator fun plus(other: Vector3b) = Vector3b(x + other.x, y + other.y, z + other.z)
	operator fun minus(other: Vector3b) = Vector3b(x - other.x, y - other.y, z - other.z)
	operator fun times(other: Vector3b) = Vector3b(x * other.x, y * other.y, z * other.z)
	operator fun div(other: Vector3b) = Vector3b(x / other.x, y / other.y, z / other.z)
	operator fun rem(other: Vector3b) = Vector3b(x % other.x, y % other.y, z % other.z)

	operator fun plus(other: Byte) = Vector3b(x + other, y + other, z + other)
	operator fun minus(other: Byte) = Vector3b(x - other, y - other, z - other)
	operator fun times(other: Byte) = Vector3b(x * other, y * other, z * other)
	operator fun div(other: Byte) = Vector3b(x / other, y / other, z / other)
	operator fun rem(other: Byte) = Vector3b(x % other, y % other, z % other)

	operator fun plusAssign(other: Vector3b) = assign(x + other.x, y + other.y, z + other.z)
	operator fun minusAssign(other: Vector3b) = assign(x - other.x, y - other.y, z - other.z)
	operator fun timesAssign(other: Vector3b) = assign(x * other.x, y * other.y, z * other.z)
	operator fun divAssign(other: Vector3b) = assign(x / other.x, y / other.y, z / other.z)
	operator fun remAssign(other: Vector3b) = assign(x % other.x, y % other.y, z % other.z)

	operator fun plusAssign(other: Byte) = assign(x + other, y + other, z + other)
	operator fun minusAssign(other: Byte) = assign(x - other, y - other, z - other)
	operator fun timesAssign(other: Byte) = assign(x * other, y * other, z * other)
	operator fun divAssign(other: Byte) = assign(x / other, y / other, z / other)
	operator fun remAssign(other: Byte) = assign(x % other, y % other, z % other)

	operator fun unaryPlus() = Vector3b(+x, +y, +z)
	operator fun unaryMinus() = Vector3b(-x, -y, -z)

	override operator fun get(index: Int) = when (index)
	{
		0 -> x
		1 -> y
		2 -> z
		else -> throw IndexOutOfBoundsException(index.toString())
	}

	override operator fun set(index: Int, value: Byte) = when (index)
	{
		0 -> x = value
		1 -> y = value
		2 -> z = value
		else -> throw IndexOutOfBoundsException(index.toString())
	}

	override fun iterator(): Iterator<Byte>
	{
		return sequenceOf(x, y, z).iterator()
	}

	override fun clone() = Vector3b(x, y, z)
}