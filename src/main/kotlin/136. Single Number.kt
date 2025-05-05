private fun singleNumber(nums: IntArray): Int {
    var res = 0
    for (num in nums) {
        res = res xor num
    }

    return res
}

fun main() {
    println(singleNumber(intArrayOf(4,1,2,1,2)))
    println(singleNumber(intArrayOf(2,2,1)))
    println(singleNumber(intArrayOf(1)))
}