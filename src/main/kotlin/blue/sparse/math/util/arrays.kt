package blue.sparse.math.util

import blue.sparse.math.wrap

inline fun <reified T> array2D(sizeX: Int, sizeY: Int, initializer: (Int, Int) -> T): Array<Array<T>>
{
	return Array(sizeX) { x -> Array(sizeY) { y -> initializer(x, y) } }
}

inline fun <reified T> array3D(sizeX: Int, sizeY: Int, sizeZ: Int, initializer: (Int, Int, Int) -> T): Array<Array<Array<T>>>
{
	return array2D(sizeX, sizeY) { x, y -> Array(sizeZ) { z -> initializer(x, y, z) } }
}

inline fun <reified T> array4D(sizeX: Int, sizeY: Int, sizeZ: Int, sizeW: Int, initializer: (Int, Int, Int, Int) -> T): Array<Array<Array<Array<T>>>>
{
	return array3D(sizeX, sizeY, sizeZ) { x, y, z -> Array(sizeW) { w -> initializer(x, y, z, w) } }
}

inline fun <reified T> wrappingArray2D(sizeX: Int, sizeY: Int, initializer: (Int, Int) -> T): WrappingArray<WrappingArray<T>>
{
	return Array(sizeX) { x -> Array(sizeY) { y -> initializer(x, y)}.wrapping }.wrapping
}

inline fun <reified T> wrappingArray3D(sizeX: Int, sizeY: Int, sizeZ: Int, initializer: (Int, Int, Int) -> T): WrappingArray<WrappingArray<WrappingArray<T>>>
{
	return wrappingArray2D(sizeX, sizeY) { x, y -> Array(sizeZ) { z -> initializer(x, y, z) }.wrapping }
}

inline fun <reified T> wrappingArray4D(sizeX: Int, sizeY: Int, sizeZ: Int, sizeW: Int, initializer: (Int, Int, Int, Int) -> T): WrappingArray<WrappingArray<WrappingArray<WrappingArray<T>>>>
{
	return wrappingArray3D(sizeX, sizeY, sizeZ) { x, y, z -> Array(sizeW) { w -> initializer(x, y, z, w) }.wrapping }
}

val <T> Array<T>.wrapping get() = WrappingArray(this)

class WrappingArray<T>(val array: Array<T>): Iterable<T> by array.asIterable()
{
	operator fun get(index: Int): T
	{
		return array[wrap(index, 0, array.size-1)]
	}

	operator fun set(index: Int, value: T)
	{
		array[wrap(index, 0, array.size-1)] = value
	}
}
