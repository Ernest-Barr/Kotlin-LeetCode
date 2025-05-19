private fun twoSum(nums: IntArray, target: Int): IntArray {
    val map: MutableMap<Int, Int> = mutableMapOf()
    for (i in nums.indices) {
        val num = nums[i]
        if ((target - num) in map) return intArrayOf(map[target - num]!!, i)
        map[num] = i
    }
    return intArrayOf()
}

fun main() {
    println(twoSum(intArrayOf(2, 7, 11, 15), 9).contentEquals(intArrayOf(0, 1)))
    println(twoSum(intArrayOf(3, 2, 4), 6).contentEquals(intArrayOf(1, 2)))
    println(twoSum(intArrayOf(3, 3), 6).contentEquals(intArrayOf(0, 1)))
}