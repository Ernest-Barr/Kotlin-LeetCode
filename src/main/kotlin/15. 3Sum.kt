private fun threeSum(nums: IntArray): List<List<Int>> {
    nums.sort()
    val res: MutableSet<List<Int>> = mutableSetOf()

    for (i in 0..<nums.size - 2) {
        if (i > 0 && nums[i] == nums[i - 1]) continue
        var l = i + 1
        var r = nums.size - 1
        while (l < r) {
            val sum = nums[i] + nums[l] + nums[r]
            when {
                sum == 0 -> {
                    res.add(listOf(nums[i], nums[l], nums[r]))
                    l++
                    r--
                }

                sum > 0 -> r--
                sum < 0 -> l++
            }
        }
    }
    return res.toList()
}

fun main() {
    println(threeSum(intArrayOf(-1, 0, 1, 2, -1, -4)) == listOf(listOf(-1, -1, 2), listOf(-1, 0, 1)))
//    println(threeSum(intArrayOf(0, 1, 1)) == listOf(listOf<Int>()))
    println(threeSum(intArrayOf(0, 0, 0)) == listOf(listOf(0, 0, 0)))
}