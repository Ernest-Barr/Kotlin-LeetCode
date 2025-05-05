private fun permute(nums: IntArray): List<List<Int>> {
    val res: MutableList<List<Int>> = mutableListOf()
    fun backtrack(i: Int, set: MutableList<Int>) {
        if (i == nums.size) {
            res.add(set.toList())
            return
        }

        for (num in 0 until nums.size) {
            if (nums[num] in set) continue
            set.add(nums[num])
            backtrack(i + 1, set)
            set.removeLast()
        }
    }
    backtrack(0, mutableListOf())
    return res
}

fun main() {
    println(
        permute(intArrayOf(1, 2, 3)) == listOf(
            listOf(1, 2, 3),
            listOf(1, 3, 2),
            listOf(2, 1, 3),
            listOf(2, 3, 1),
            listOf(3, 1, 2),
            listOf(3, 2, 1)
        )
    )

    println(
        permute(intArrayOf(0, 1)) == listOf(listOf(0, 1), listOf(1, 0))
    )

    println(
        permute(intArrayOf(1)) == listOf(listOf(1))
    )
}