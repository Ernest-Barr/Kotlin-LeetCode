package Done

fun hammingWeight(n: Int): Int {
//    var digits = n.toString(2)
//    var count = 0
//    for (c in digits) {
//        if (c == '1') count++
//    }
    var count = 0
    for(i in 0..31) {
        if(n and (1 shl i) != 0) {
            count++
        }
    }
    return count
}


fun main() {
    println(hammingWeight(Integer.parseInt(readln())))
}