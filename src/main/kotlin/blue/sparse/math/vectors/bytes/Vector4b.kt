package blue.sparse.math.vectors.bytes

data class Vector4b(var x: Byte, var y: Byte, var z: Byte, var w: Byte) : ByteVector
{
	constructor(all: Byte) : this(all, all, all, all)
	constructor(xy: Vector2b, z: Byte, w: Byte) : this(xy.x, xy.y, z, w)
	constructor(x: Byte, y: Byte, zw: Vector2b) : this(x, y, zw.x, zw.y)
	constructor(xy: Vector2b, zw: Vector2b) : this(xy.x, xy.y, zw.x, zw.y)
	constructor(x: Byte, yz: Vector2b, w: Byte) : this(x, yz.x, yz.y, w)
	constructor(xyz: Vector3b, w: Byte) : this(xyz.x, xyz.y, xyz.z, w)
	constructor(x: Byte, yzw: Vector3b) : this(x, yzw.x, yzw.y, yzw.z)
	constructor(xyzw: Vector4b) : this(xyzw.x, xyzw.y, xyzw.z, xyzw.w)

	constructor(x: Int, y: Int, z: Int, w: Int): this(x.toByte(), y.toByte(), z.toByte(), w.toByte())

	fun assign(x: Byte, y: Byte, z: Byte, w: Byte)
	{
		this.x = x
		this.y = y
		this.z = z
		this.w = w
	}

	fun assign(x: Int, y: Int, z: Int, w: Int)
	{
		assign(x.toByte(), y.toByte(), z.toByte(), w.toByte())
	}

	operator fun plus(other: Vector4b) = Vector4b(x + other.x, y + other.y, z + other.z, w + other.w)
	operator fun minus(other: Vector4b) = Vector4b(x - other.x, y - other.y, z - other.z, w - other.w)
	operator fun times(other: Vector4b) = Vector4b(x * other.x, y * other.y, z * other.z, w * other.w)
	operator fun div(other: Vector4b) = Vector4b(x / other.x, y / other.y, z / other.z, w / other.w)
	operator fun rem(other: Vector4b) = Vector4b(x % other.x, y % other.y, z % other.z, w % other.w)

	operator fun plus(other: Byte) = Vector4b(x + other, y + other, z + other, w + other)
	operator fun minus(other: Byte) = Vector4b(x - other, y - other, z - other, w - other)
	operator fun times(other: Byte) = Vector4b(x * other, y * other, z * other, w * other)
	operator fun div(other: Byte) = Vector4b(x / other, y / other, z / other, w / other)
	operator fun rem(other: Byte) = Vector4b(x % other, y % other, z % other, w % other)

	operator fun plusAssign(other: Vector4b) = assign(x + other.x, y + other.y, z + other.z, w + other.w)
	operator fun minusAssign(other: Vector4b) = assign(x - other.x, y - other.y, z - other.z, w - other.w)
	operator fun timesAssign(other: Vector4b) = assign(x * other.x, y * other.y, z * other.z, w * other.w)
	operator fun divAssign(other: Vector4b) = assign(x / other.x, y / other.y, z / other.z, w / other.w)
	operator fun remAssign(other: Vector4b) = assign(x % other.x, y % other.y, z % other.z, w % other.w)

	operator fun plusAssign(other: Byte) = assign(x + other, y + other, z + other, w + other)
	operator fun minusAssign(other: Byte) = assign(x - other, y - other, z - other, w - other)
	operator fun timesAssign(other: Byte) = assign(x * other, y * other, z * other, w * other)
	operator fun divAssign(other: Byte) = assign(x / other, y / other, z / other, w / other)
	operator fun remAssign(other: Byte) = assign(x % other, y % other, z % other, w % other)

	operator fun unaryPlus() = Vector4b(+x, +y, +z, +w)
	operator fun unaryMinus() = Vector4b(-x, -y, -z, -w)

	override operator fun get(index: Int) = when (index)
	{
		0 -> x
		1 -> y
		2 -> z
		3 -> w
		else -> throw IndexOutOfBoundsException(index.toString())
	}

	override operator fun set(index: Int, value: Byte) = when (index)
	{
		0 -> x = value
		1 -> y = value
		2 -> z = value
		3 -> w = value
		else -> throw IndexOutOfBoundsException(index.toString())
	}

	override fun iterator(): Iterator<Byte>
	{
		return sequenceOf(x, y, z, w).iterator()
	}

	override fun clone() = Vector4b(x, y, z, w)
}