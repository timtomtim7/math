package blue.sparse.math.vectors.doubles

import blue.sparse.math.vectors.floats.*
import blue.sparse.math.vectors.ints.Vector3i
import blue.sparse.math.vectors.ints.Vector4i

data class Vector4d(var x: Double, var y: Double, var z: Double, var w: Double) : DoubleVector
{
	constructor(all: Double) : this(all, all, all, all)
	constructor(xy: Vector2d, z: Double, w: Double) : this(xy.x, xy.y, z, w)
	constructor(x: Double, y: Double, zw: Vector2d) : this(x, y, zw.x, zw.y)
	constructor(xy: Vector2d, zw: Vector2d) : this(xy.x, xy.y, zw.x, zw.y)
	constructor(x: Double, yz: Vector2d, w: Double) : this(x, yz.x, yz.y, w)
	constructor(xyz: Vector3d, w: Double) : this(xyz.x, xyz.y, xyz.z, w)
	constructor(x: Double, yzw: Vector3d) : this(x, yzw.x, yzw.y, yzw.z)
	constructor(xyzw: Vector4d) : this(xyzw.x, xyzw.y, xyzw.z, xyzw.w)

	fun assign(x: Double, y: Double, z: Double, w: Double)
	{
		this.x = x
		this.y = y
		this.z = z
		this.w = w
	}

	operator fun plus(other: Vector4d) = Vector4d(x + other.x, y + other.y, z + other.z, w + other.w)
	operator fun minus(other: Vector4d) = Vector4d(x - other.x, y - other.y, z - other.z, w - other.w)
	operator fun times(other: Vector4d) = Vector4d(x * other.x, y * other.y, z * other.z, w * other.w)
	operator fun div(other: Vector4d) = Vector4d(x / other.x, y / other.y, z / other.z, w / other.w)
	operator fun rem(other: Vector4d) = Vector4d(x % other.x, y % other.y, z % other.z, w % other.w)

	operator fun plus(other: Double) = Vector4d(x + other, y + other, z + other, w + other)
	operator fun minus(other: Double) = Vector4d(x - other, y - other, z - other, w - other)
	operator fun times(other: Double) = Vector4d(x * other, y * other, z * other, w * other)
	operator fun div(other: Double) = Vector4d(x / other, y / other, z / other, w / other)
	operator fun rem(other: Double) = Vector4d(x % other, y % other, z % other, w % other)

	operator fun plusAssign(other: Vector4d) = assign(x + other.x, y + other.y, z + other.z, w + other.w)
	operator fun minusAssign(other: Vector4d) = assign(x - other.x, y - other.y, z - other.z, w - other.w)
	operator fun timesAssign(other: Vector4d) = assign(x * other.x, y * other.y, z * other.z, w * other.w)
	operator fun divAssign(other: Vector4d) = assign(x / other.x, y / other.y, z / other.z, w / other.w)
	operator fun remAssign(other: Vector4d) = assign(x % other.x, y % other.y, z % other.z, w % other.w)

	operator fun plusAssign(other: Double) = assign(x + other, y + other, z + other, w + other)
	operator fun minusAssign(other: Double) = assign(x - other, y - other, z - other, w - other)
	operator fun timesAssign(other: Double) = assign(x * other, y * other, z * other, w * other)
	operator fun divAssign(other: Double) = assign(x / other, y / other, z / other, w / other)
	operator fun remAssign(other: Double) = assign(x % other, y % other, z % other, w % other)

	operator fun unaryPlus() = Vector4d(+x, +y, +z, +w)
	operator fun unaryMinus() = Vector4d(-x, -y, -z, -w)

	override operator fun get(index: Int) = when (index)
	{
		0 -> x
		1 -> y
		2 -> z
		3 -> w
		else -> throw IndexOutOfBoundsException(index.toString())
	}

	override operator fun set(index: Int, value: Double) = when (index)
	{
		0 -> x = value
		1 -> y = value
		2 -> z = value
		3 -> w = value
		else -> throw IndexOutOfBoundsException(index.toString())
	}

	override fun iterator(): Iterator<Double>
	{
		return sequenceOf(x, y, z, w).iterator()
	}

	override fun toIntVector() = Vector4i(x.toInt(), y.toInt(), z.toInt(), w.toInt())
	override fun toFloatVector() = Vector4f(x.toFloat(), y.toFloat(), z.toFloat(), w.toFloat())

	override fun clone() = Vector4d(x, y, z, w)
}