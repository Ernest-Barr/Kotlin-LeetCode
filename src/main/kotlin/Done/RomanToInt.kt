package Done

fun romanToInt(s: String): Int {
    // IV, IX, XL, XC, CD, CM exclusions
    val I = 'I' to 1
    val V = 'V' to 5
    val X = 'X' to 10
    val L = 'L' to 50
    val C = 'C' to 100
    val D = 'D' to 500
    val M = 'M' to 1000
    val nums: Map<Char, Int> = mapOf(I,V,X,L,C,D,M)

    var str:String = s
    str = str.replace("IV", "IIII")
    str = str.replace("IX", "VIIII")
    str = str.replace("XL", "XXXX")
    str = str.replace("XC", "LXXXX")
    str = str.replace("CD", "CCCC")
    str = str.replace("CM", "DCCCC")
    var num: Int = 0

    for(ch in str) {
        num += nums.getValue(ch)
    }
    return num
}

fun main() {
    println(romanToInt("MCMXCIV"))
    // Returns 1994
}