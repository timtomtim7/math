package blue.sparse.math.vectors.floats

import blue.sparse.math.vectors.ints.Vector3i
import blue.sparse.math.vectors.ints.Vector4i

data class Vector4f(var x: Float, var y: Float, var z: Float, var w: Float) : FloatVector
{
	constructor(all: Float) : this(all, all, all, all)
	constructor(xy: Vector2f, z: Float, w: Float) : this(xy.x, xy.y, z, w)
	constructor(x: Float, y: Float, zw: Vector2f) : this(x, y, zw.x, zw.y)
	constructor(xy: Vector2f, zw: Vector2f) : this(xy.x, xy.y, zw.x, zw.y)
	constructor(x: Float, yz: Vector2f, w: Float) : this(x, yz.x, yz.y, w)
	constructor(xyz: Vector3f, w: Float) : this(xyz.x, xyz.y, xyz.z, w)
	constructor(x: Float, yzw: Vector3f) : this(x, yzw.x, yzw.y, yzw.z)
	constructor(xyzw: Vector4f) : this(xyzw.x, xyzw.y, xyzw.z, xyzw.w)

	fun assign(x: Float, y: Float, z: Float, w: Float)
	{
		this.x = x
		this.y = y
		this.z = z
		this.w = w
	}

	operator fun plus(other: Vector4f) = Vector4f(x + other.x, y + other.y, z + other.z, w + other.w)
	operator fun minus(other: Vector4f) = Vector4f(x - other.x, y - other.y, z - other.z, w - other.w)
	operator fun times(other: Vector4f) = Vector4f(x * other.x, y * other.y, z * other.z, w * other.w)
	operator fun div(other: Vector4f) = Vector4f(x / other.x, y / other.y, z / other.z, w / other.w)
	operator fun rem(other: Vector4f) = Vector4f(x % other.x, y % other.y, z % other.z, w % other.w)

	operator fun plus(other: Float) = Vector4f(x + other, y + other, z + other, w + other)
	operator fun minus(other: Float) = Vector4f(x - other, y - other, z - other, w - other)
	operator fun times(other: Float) = Vector4f(x * other, y * other, z * other, w * other)
	operator fun div(other: Float) = Vector4f(x / other, y / other, z / other, w / other)
	operator fun rem(other: Float) = Vector4f(x % other, y % other, z % other, w % other)

	operator fun plusAssign(other: Vector4f) = assign(x + other.x, y + other.y, z + other.z, w + other.w)
	operator fun minusAssign(other: Vector4f) = assign(x - other.x, y - other.y, z - other.z, w - other.w)
	operator fun timesAssign(other: Vector4f) = assign(x * other.x, y * other.y, z * other.z, w * other.w)
	operator fun divAssign(other: Vector4f) = assign(x / other.x, y / other.y, z / other.z, w / other.w)
	operator fun remAssign(other: Vector4f) = assign(x % other.x, y % other.y, z % other.z, w % other.w)

	operator fun plusAssign(other: Float) = assign(x + other, y + other, z + other, w + other)
	operator fun minusAssign(other: Float) = assign(x - other, y - other, z - other, w - other)
	operator fun timesAssign(other: Float) = assign(x * other, y * other, z * other, w * other)
	operator fun divAssign(other: Float) = assign(x / other, y / other, z / other, w / other)
	operator fun remAssign(other: Float) = assign(x % other, y % other, z % other, w % other)

	operator fun unaryPlus() = Vector4f(+x, +y, +z, +w)
	operator fun unaryMinus() = Vector4f(-x, -y, -z, -w)

	override operator fun get(index: Int) = when (index)
	{
		0 -> x
		1 -> y
		2 -> z
		3 -> w
		else -> throw IndexOutOfBoundsException(index.toString())
	}

	override operator fun set(index: Int, value: Float) = when (index)
	{
		0 -> x = value
		1 -> y = value
		2 -> z = value
		3 -> w = value
		else -> throw IndexOutOfBoundsException(index.toString())
	}

	override fun iterator(): Iterator<Float>
	{
		return sequenceOf(x, y, z, w).iterator()
	}

	override fun toIntVector() = Vector4i(x.toInt(), y.toInt(), z.toInt(), w.toInt())

	override fun clone() = Vector4f(x, y, z, w)
}