package InProgress

fun toHex(num: Int): String {

    var quotient = num
    var remainder = 1
    var str: String = ""

    while (quotient != 0) {
        remainder = quotient % 16
        quotient /= 16
//        println("Quotient: " + quotient)
//        println("Remainder: " + remainder)
        if (remainder < 10) {
            str += remainder.toString()
        } else if (remainder >= 10) {
            val x = remainder % 10
            str += (x + 97).toChar()
        }
    }

    return str.reversed()
}

fun main() {
    println(toHex(Integer.parseInt(readln())))
}