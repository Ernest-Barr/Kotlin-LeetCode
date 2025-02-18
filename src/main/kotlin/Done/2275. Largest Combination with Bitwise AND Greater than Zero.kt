package Done

fun largestCombination(candidates: IntArray): Int {
    var max = 0
    for (i in 0..24) {
        var count: Int = 0
        for (j in candidates) {
            if (j and (1 shl i) != 0) {
                count++
            }
        }
        max = maxOf(max, count)
    }
    return max
}

fun main() {
    println("Out: " + largestCombination(intArrayOf(16, 17, 71, 62, 12, 24, 14)))
}