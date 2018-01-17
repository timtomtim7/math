package blue.sparse.math.vectors.ints

import blue.sparse.math.vectors.floats.Vector2f
import blue.sparse.math.vectors.floats.Vector4f

data class Vector4i(var x: Int, var y: Int, var z: Int, var w: Int) : IntVector
{
	constructor(all: Int) : this(all, all, all, all)
	constructor(xy: Vector2i, z: Int, w: Int) : this(xy.x, xy.y, z, w)
	constructor(x: Int, y: Int, zw: Vector2i) : this(x, y, zw.x, zw.y)
	constructor(xy: Vector2i, zw: Vector2i) : this(xy.x, xy.y, zw.x, zw.y)
	constructor(x: Int, yz: Vector2i, w: Int) : this(x, yz.x, yz.y, w)
	constructor(xyz: Vector3i, w: Int) : this(xyz.x, xyz.y, xyz.z, w)
	constructor(x: Int, yzw: Vector3i) : this(x, yzw.x, yzw.y, yzw.z)
	constructor(xyzw: Vector4i) : this(xyzw.x, xyzw.y, xyzw.z, xyzw.w)

	fun assign(x: Int, y: Int, z: Int, w: Int)
	{
		this.x = x
		this.y = y
		this.z = z
		this.w = w
	}

	operator fun plus(other: Vector4i) = Vector4i(x + other.x, y + other.y, z + other.z, w + other.w)
	operator fun minus(other: Vector4i) = Vector4i(x - other.x, y - other.y, z - other.z, w - other.w)
	operator fun times(other: Vector4i) = Vector4i(x * other.x, y * other.y, z * other.z, w * other.w)
	operator fun div(other: Vector4i) = Vector4i(x / other.x, y / other.y, z / other.z, w / other.w)
	operator fun rem(other: Vector4i) = Vector4i(x % other.x, y % other.y, z % other.z, w % other.w)

	operator fun plus(other: Int) = Vector4i(x + other, y + other, z + other, w + other)
	operator fun minus(other: Int) = Vector4i(x - other, y - other, z - other, w - other)
	operator fun times(other: Int) = Vector4i(x * other, y * other, z * other, w * other)
	operator fun div(other: Int) = Vector4i(x / other, y / other, z / other, w / other)
	operator fun rem(other: Int) = Vector4i(x % other, y % other, z % other, w % other)

	operator fun plusAssign(other: Vector4i) = assign(x + other.x, y + other.y, z + other.z, w + other.w)
	operator fun minusAssign(other: Vector4i) = assign(x - other.x, y - other.y, z - other.z, w - other.w)
	operator fun timesAssign(other: Vector4i) = assign(x * other.x, y * other.y, z * other.z, w * other.w)
	operator fun divAssign(other: Vector4i) = assign(x / other.x, y / other.y, z / other.z, w / other.w)
	operator fun remAssign(other: Vector4i) = assign(x % other.x, y % other.y, z % other.z, w % other.w)

	operator fun plusAssign(other: Int) = assign(x + other, y + other, z + other, w + other)
	operator fun minusAssign(other: Int) = assign(x - other, y - other, z - other, w - other)
	operator fun timesAssign(other: Int) = assign(x * other, y * other, z * other, w * other)
	operator fun divAssign(other: Int) = assign(x / other, y / other, z / other, w / other)
	operator fun remAssign(other: Int) = assign(x % other, y % other, z % other, w % other)

	operator fun unaryPlus() = Vector4i(+x, +y, +z, +w)
	operator fun unaryMinus() = Vector4i(-x, -y, -z, -w)

	override operator fun get(index: Int) = when (index)
	{
		0 -> x
		1 -> y
		2 -> z
		3 -> w
		else -> throw IndexOutOfBoundsException(index.toString())
	}

	override operator fun set(index: Int, value: Int) = when (index)
	{
		0 -> x = value
		1 -> y = value
		2 -> z = value
		3 -> w = value
		else -> throw IndexOutOfBoundsException(index.toString())
	}

	override fun iterator(): Iterator<Int>
	{
		return sequenceOf(x, y, z, w).iterator()
	}

	override fun toFloatVector() = Vector4f(x.toFloat(), y.toFloat(), z.toFloat(), w.toFloat())

	override fun clone() = Vector4i(x, y, z, w)
}