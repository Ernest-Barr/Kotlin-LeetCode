import kotlin.math.*
private fun sqrt(num: Int): Int {
    val epsilon: Double = 0.000001
    var x: Long = num.toLong()
    var y: Long = 1

    while (x - y > epsilon) {
        x = (x + y) / 2
        y = num / x
    }

    return x.toInt()
}

fun main() {
    println(sqrt(65) == sqrt(65.0).toInt())
    println(sqrt(64))
    println(sqrt(36))
    println(sqrt(130))
    println(sqrt(Int.MAX_VALUE))
}