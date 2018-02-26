package blue.sparse.math

//operator fun Byte.plus(other: Number) = this + other.toByte()
//operator fun Byte.minus(other: Number) = this - other.toByte()
//operator fun Byte.times(other: Number) = this * other.toByte()
//operator fun Byte.div(other: Number) = this / other.toByte()
//operator fun Byte.rem(other: Number) = this % other.toByte()
//
//operator fun Short.plus(other: Number) = this + other.toShort()
//operator fun Short.minus(other: Number) = this - other.toShort()
//operator fun Short.times(other: Number) = this * other.toShort()
//operator fun Short.div(other: Number) = this / other.toShort()
//operator fun Short.rem(other: Number) = this % other.toShort()
//
//operator fun Int.plus(other: Number) = this + other.toInt()
//operator fun Int.minus(other: Number) = this - other.toInt()
//operator fun Int.times(other: Number) = this * other.toInt()
//operator fun Int.div(other: Number) = this / other.toInt()
//operator fun Int.rem(other: Number) = this % other.toInt()
//
//operator fun Long.plus(other: Number) = this + other.toLong()
//operator fun Long.minus(other: Number) = this - other.toLong()
//operator fun Long.times(other: Number) = this * other.toLong()
//operator fun Long.div(other: Number) = this / other.toLong()
//operator fun Long.rem(other: Number) = this % other.toLong()
//
//operator fun Float.plus(other: Number) = this + other.toFloat()
//operator fun Float.minus(other: Number) = this - other.toFloat()
//operator fun Float.times(other: Number) = this * other.toFloat()
//operator fun Float.div(other: Number) = this / other.toFloat()
//operator fun Float.rem(other: Number) = this % other.toFloat()
//
//operator fun Double.plus(other: Number) = this + other.toDouble()
//operator fun Double.minus(other: Number) = this - other.toDouble()
//operator fun Double.times(other: Number) = this * other.toDouble()
//operator fun Double.div(other: Number) = this / other.toDouble()
//operator fun Double.rem(other: Number) = this % other.toDouble()

fun abs(number: Byte) = if(number < 0) (-number).toByte() else number
fun abs(number: Short) = if(number < 0) (-number).toShort() else number
fun abs(number: Int) = if(number < 0) -number else number
fun abs(number: Long) = if(number < 0) -number else number
fun abs(number: Float) = if(number < 0) -number else number
fun abs(number: Double) = if(number < 0) -number else number

fun floor(number: Float) = Math.floor(number.toDouble()).toFloat()
fun floor(number: Double) = Math.floor(number)

fun ceil(number: Float) = Math.ceil(number.toDouble()).toFloat()
fun ceil(number: Double) = Math.ceil(number)

fun round(number: Float) = Math.round(number)
fun round(number: Double) = Math.round(number)

fun clamp(number: Float, min: Float, max: Float) = Math.min(Math.max(number, min), max)
fun clamp(number: Double, min: Double, max: Double) = Math.min(Math.max(number, min), max)
fun clamp(number: Int, min: Int, max: Int) = Math.min(Math.max(number, min), max)
fun clamp(number: Short, min: Short, max: Short) = Math.min(Math.max(number.toInt(), min.toInt()), max.toInt()).toShort()
fun clamp(number: Byte, min: Byte, max: Byte) = Math.min(Math.max(number.toInt(), min.toInt()), max.toInt()).toByte()

fun sqrt(number: Float) = Math.sqrt(number.toDouble()).toFloat()
fun sqrt(number: Double) = Math.sqrt(number)

fun sin(number: Float) = Math.sin(number.toDouble()).toFloat()
fun sin(number: Double) = Math.sin(number)

fun cos(number: Float) = Math.cos(number.toDouble()).toFloat()
fun cos(number: Double) = Math.cos(number)

fun atan(number: Float) = Math.atan(number.toDouble()).toFloat()
fun atan(number: Double) = Math.atan(number)

fun atan2(x: Float, y: Float) = Math.atan2(x.toDouble(), y.toDouble()).toFloat()
fun atan2(x: Double, y: Double) = Math.atan2(x, y)

fun acos(number: Float) = Math.acos(number.toDouble()).toFloat()
fun acos(number: Double) = Math.acos(number)

fun wrap(number: Int, min: Int, max: Int): Int
{
	var n = number
	val range = max - min + 1
	if(n < min) n += range * ((min - n) / range + 1)
	return min + (n - min) % range
}

fun wrap(number: Double, min: Double, max: Double): Double
{
	var n = number
	val range = max - min + 1
	if(n < min) n += range * ((min - n) / range + 1)
	return min + (n - min) % range
}

fun wrap(number: Float, min: Float, max: Float): Float
{
	var n = number
	val range = max - min + 1
	if(n < min) n += range * ((min - n) / range + 1)
	return min + (n - min) % range
}

//fun wrap(number: Number, min: Number, max: Number) = wrap(number.toDouble(), min.toDouble(), max.toDouble())