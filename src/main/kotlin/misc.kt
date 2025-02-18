fun fibonacci(n: Int): Int {
    return when (n) {
        0  -> 1
        1 -> 1
        else -> fibonacci(n-1) + fibonacci(n-2)
    }
}

fun main() {
    var arr = arrayOf(33,45,20,19,44,78,6,89,50)
    println(fibonacci(50))
}