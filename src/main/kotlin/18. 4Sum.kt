private fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
    val res: MutableSet<List<Int>> = mutableSetOf()
    val t = target.toLong()
    nums.sort()

    for (i in 0 until nums.size - 3) {
        if (i > 0 && nums[i] == nums[i - 1]) continue
        for (j in i + 1 until nums.size - 2) {
            var l = j + 1
            var r = nums.size - 1
            while (l < r) {
                val sum: Long = nums[i].toLong() + nums[j].toLong() + nums[l].toLong() + nums[r].toLong()
                when {
                    sum == t -> {
                        res.add(listOf(nums[i], nums[j], nums[l], nums[r]))
                        l++
                        r--
                    }

                    sum < t -> l++
                    sum > t -> r--
                }
            }
        }
    }
    return res.toList()
}

fun main() {
    println(
        fourSum(intArrayOf(1, 0, -1, 0, -2, 2), 0) == listOf(
            listOf(-2, -1, 1, 2),
            listOf(-2, 0, 0, 2),
            listOf(-1, 0, 0, 1)
        )
    )

    println(fourSum(intArrayOf(2, 2, 2, 2, 2), 8) == listOf(listOf(2, 2, 2, 2)))
}