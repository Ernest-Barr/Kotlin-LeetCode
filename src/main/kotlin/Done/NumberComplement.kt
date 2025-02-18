package Done

fun findComplement(num: Int): Int {
    var digits:CharArray = num.toString(2).toCharArray()

    for(i in digits.indices) {
        if(digits[i] == '1') {
            digits[i] = '0'
        } else {
            digits[i] = '1'
        }
    }
    return String(digits).toInt(2)
}

fun main() {
    println(findComplement(Integer.parseInt(readln())))
}
