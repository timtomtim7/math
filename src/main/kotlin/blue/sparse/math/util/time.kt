package blue.sparse.math.util

private val timeUnitsPerSecond = 1_000_000_000L
private fun time() = System.nanoTime()

class FrequencyTimer(frequencySeconds: Double) : Comparable<Number>
{
	private var start = time()
	private var frequency = (frequencySeconds * timeUnitsPerSecond).toLong()

	private val timeSinceStart: Long
		get() = time() - start

	val count: Double
		get() = timeSinceStart.toDouble() / frequency.toDouble()

	private fun decrement()
	{
		start += frequency
	}

	fun use(): Boolean
	{
		if(count >= 1)
		{
			decrement()
			return true
		}
		return false
	}

	inline fun whileReady(body: () -> Unit)
	{
		while(use()) body()
	}

	fun reset()
	{
		start = time()
	}

	override operator fun compareTo(other: Number) = count.compareTo(other.toDouble())
}

class DeltaTimer
{
	private var start = time()

	fun getDeltaMillis(): Double
	{
		val result = (time() - start).toDouble() / (timeUnitsPerSecond.toDouble() / 1000.0)
		start = time()
		return result
	}

	fun delta(): Double
	{
		val result = (time() - start).toDouble() / timeUnitsPerSecond.toDouble()
		start = time()
		return result
	}

	fun deltaFloat(): Float
	{
		val result = (time() - start).toFloat() / timeUnitsPerSecond.toFloat()
		start = time()
		return result
	}
}