package blue.sparse.math.vectors.doubles

import blue.sparse.math.vectors.floats.FloatVector
import blue.sparse.math.vectors.ints.IntVector

interface DoubleVector : Iterable<Double>, Cloneable
{
	operator fun get(index: Int): Double
	operator fun set(index: Int, value: Double)

	fun toIntVector(): IntVector
	fun toFloatVector(): FloatVector

	public override fun clone(): DoubleVector
}