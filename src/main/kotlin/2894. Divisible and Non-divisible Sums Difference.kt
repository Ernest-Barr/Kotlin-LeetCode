private fun differenceOfSums(n: Int, m: Int): Int {
    var num1 = 0
    var num2 = 0

    for (i in 0..n) if (i % m != 0) num1 += i else num2 += i

    return num1 - num2
}

fun main() {
    //TODO: Test cases
}