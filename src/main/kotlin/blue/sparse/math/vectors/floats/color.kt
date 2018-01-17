package blue.sparse.math.vectors.floats

fun Int.vectorFromIntRGB(): Vector3f
{
	val r = (this shr 16) and 0xFF
	val g = (this shr 8) and 0xFF
	val b = this and 0xFF

	return Vector3f(r.toFloat(), g.toFloat(), b.toFloat()) / 255.0f
}

fun Int.vectorFromIntARGB(): Vector4f
{
	val a = (this shr 24) and 0xFF
	val r = (this shr 16) and 0xFF
	val g = (this shr 8) and 0xFF
	val b = this and 0xFF

	return Vector4f(r.toFloat(), g.toFloat(), b.toFloat(), a.toFloat()) / 255.0f
}

fun Vector3f.toIntRGB(): Int
{
	val vectorRGB = round(clamp(this, 0f, 1f) * 255f)
	return (vectorRGB.x.toInt() shl 16) or (vectorRGB.y.toInt() shl 8) or vectorRGB.z.toInt()
}

fun Vector4f.toIntARGB(): Int
{
	val vectorRGB = round(clamp(this, 0f, 1f) * 255f)
	return (vectorRGB.w.toInt() shl 24) or (vectorRGB.x.toInt() shl 16) or (vectorRGB.y.toInt() shl 8) or vectorRGB.z.toInt()
}

//fun Vector3f.withAlpha(number: Number) = Vector4f(this, number)

//fun colorNormalize(other: Vector3f): Vector3f
//{
//	//TODO: Isn't green brighter or something weird like that?
//	return normalize(other)
//}

fun Vector3f.RGBtoHexString() = toIntRGB().toString(16).toUpperCase().padStart(6, '0')

fun Vector3f.RGBtoIntString() = joinToString { Math.round(it * 255.0f).toString() }

fun Vector3f.HSBtoString() = String.format("%.1f, %.1f, %.1f", x * 360.0f, y * 100.0f, z * 100.0f)

fun Vector3f.RGBtoHSB(): Vector3f
{
	val max = max(this)
	val min = min(this)
	val delta = max - min

	var h = 0.0f
	val s = if(max == 0f) 0f else delta / max
	val b = max

	if(delta != 0.0f)
	{
		when
		{
			x == max -> h = (y - z) / delta
			y == max -> h = 2 + (z - x) / delta
			z == max -> h = 4 + (x - y) / delta
		}
		h /= 6.0f
		if(h > 1.0f) h -= 1.0f
		if(h < 0.0f) h += 1.0f
	}

	return Vector3f(h, s, b)
}

fun Vector3f.HSBtoRGB(): Vector3f
{
	if(y == 0.0f) return Vector3f(z)

	val h = x * 6
	val i = h.toInt()
	val f = h - i
	val p = z * (1 - y)
	val q = z * (1 - y * f)
	val t = z * (1 - y * (1 - f))

	return when(i)
	{
		0 -> Vector3f(z, t, p)
		1 -> Vector3f(q, z, p)
		2 -> Vector3f(p, z, t)
		3 -> Vector3f(p, q, z)
		4 -> Vector3f(t, p, z)
		else -> Vector3f(z, p, q)
	}
}


var Vector3f.r: Float
	inline get() = x
	inline set(value) { x = value }
var Vector3f.g: Float
	inline get() = y
	inline set(value) { y = value }
var Vector3f.b: Float
	inline get() = z
	inline set(value) { z = value }

var Vector4f.r: Float
	inline get() = x
	inline set(value) { x = value }
var Vector4f.g: Float
	inline get() = y
	inline set(value) { y = value }
var Vector4f.b: Float
	inline get() = z
	inline set(value) { z = value }
var Vector4f.a: Float
	inline get() = w
	inline set(value) { w = value }