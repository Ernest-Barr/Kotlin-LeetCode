package Done

fun reverse(x: Int): Int {
    var reversed: String = ""
    var num = 0

    try {
        var str = x.toString()
        if (x < 0) {
            reversed += "-"
            str = str.substring(1)
        }
        reversed += str.reversed()
        num = Integer.parseInt(reversed)
    } catch (e: ArithmeticException) {
        return 0
    }
    return num

//    var num: Int = abs(x)
//    var result: Int = 0
//
//    while (num > 0) {
//        result *= 10
//        result += num % 10
//        num /= 10
//        if (result > Int.MAX_VALUE || result < Int.MIN_VALUE) {
//            return 0
//        }
//    }
//
//
//
//    return if (x < 0) -result else result
}

fun main() {
    println(reverse(Integer.parseInt(readln())))
}