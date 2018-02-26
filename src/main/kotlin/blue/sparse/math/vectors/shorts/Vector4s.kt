package blue.sparse.math.vectors.shorts

data class Vector4s(var x: Short, var y: Short, var z: Short, var w: Short) : ShortVector
{
	constructor(all: Short) : this(all, all, all, all)
	constructor(xy: Vector2s, z: Short, w: Short) : this(xy.x, xy.y, z, w)
	constructor(x: Short, y: Short, zw: Vector2s) : this(x, y, zw.x, zw.y)
	constructor(xy: Vector2s, zw: Vector2s) : this(xy.x, xy.y, zw.x, zw.y)
	constructor(x: Short, yz: Vector2s, w: Short) : this(x, yz.x, yz.y, w)
	constructor(xyz: Vector3s, w: Short) : this(xyz.x, xyz.y, xyz.z, w)
	constructor(x: Short, yzw: Vector3s) : this(x, yzw.x, yzw.y, yzw.z)
	constructor(xyzw: Vector4s) : this(xyzw.x, xyzw.y, xyzw.z, xyzw.w)

	constructor(x: Int, y: Int, z: Int, w: Int): this(x.toShort(), y.toShort(), z.toShort(), w.toShort())

	fun assign(x: Short, y: Short, z: Short, w: Short)
	{
		this.x = x
		this.y = y
		this.z = z
		this.w = w
	}

	fun assign(x: Int, y: Int, z: Int, w: Int)
	{
		assign(x.toShort(), y.toShort(), z.toShort(), w.toShort())
	}

	operator fun plus(other: Vector4s) = Vector4s(x + other.x, y + other.y, z + other.z, w + other.w)
	operator fun minus(other: Vector4s) = Vector4s(x - other.x, y - other.y, z - other.z, w - other.w)
	operator fun times(other: Vector4s) = Vector4s(x * other.x, y * other.y, z * other.z, w * other.w)
	operator fun div(other: Vector4s) = Vector4s(x / other.x, y / other.y, z / other.z, w / other.w)
	operator fun rem(other: Vector4s) = Vector4s(x % other.x, y % other.y, z % other.z, w % other.w)

	operator fun plus(other: Short) = Vector4s(x + other, y + other, z + other, w + other)
	operator fun minus(other: Short) = Vector4s(x - other, y - other, z - other, w - other)
	operator fun times(other: Short) = Vector4s(x * other, y * other, z * other, w * other)
	operator fun div(other: Short) = Vector4s(x / other, y / other, z / other, w / other)
	operator fun rem(other: Short) = Vector4s(x % other, y % other, z % other, w % other)

	operator fun plusAssign(other: Vector4s) = assign(x + other.x, y + other.y, z + other.z, w + other.w)
	operator fun minusAssign(other: Vector4s) = assign(x - other.x, y - other.y, z - other.z, w - other.w)
	operator fun timesAssign(other: Vector4s) = assign(x * other.x, y * other.y, z * other.z, w * other.w)
	operator fun divAssign(other: Vector4s) = assign(x / other.x, y / other.y, z / other.z, w / other.w)
	operator fun remAssign(other: Vector4s) = assign(x % other.x, y % other.y, z % other.z, w % other.w)

	operator fun plusAssign(other: Short) = assign(x + other, y + other, z + other, w + other)
	operator fun minusAssign(other: Short) = assign(x - other, y - other, z - other, w - other)
	operator fun timesAssign(other: Short) = assign(x * other, y * other, z * other, w * other)
	operator fun divAssign(other: Short) = assign(x / other, y / other, z / other, w / other)
	operator fun remAssign(other: Short) = assign(x % other, y % other, z % other, w % other)

	operator fun unaryPlus() = Vector4s(+x, +y, +z, +w)
	operator fun unaryMinus() = Vector4s(-x, -y, -z, -w)

	override operator fun get(index: Int) = when (index)
	{
		0 -> x
		1 -> y
		2 -> z
		3 -> w
		else -> throw IndexOutOfBoundsException(index.toString())
	}

	override operator fun set(index: Int, value: Short) = when (index)
	{
		0 -> x = value
		1 -> y = value
		2 -> z = value
		3 -> w = value
		else -> throw IndexOutOfBoundsException(index.toString())
	}

	override fun iterator(): Iterator<Short>
	{
		return sequenceOf(x, y, z, w).iterator()
	}

	override fun clone() = Vector4s(x, y, z, w)
}