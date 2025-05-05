private fun searchInsert(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.size - 1

    while (left <= right) {
        val mid = left + (right - left) / 2
        when {
            nums[mid] < target -> left = mid + 1
            nums[mid] > target -> right = mid - 1
            else -> return mid
        }
    }
    return left
}

fun main() {
    println(searchInsert(intArrayOf(1, 2, 3, 5, 6), 4))
    println(searchInsert(intArrayOf(1, 2, 3, 4), -1))
    println(searchInsert(intArrayOf(-1, -2, 3, 4, 5, 6, 7), -3))
    println(searchInsert(intArrayOf(1,2,3,4,5), Int.MAX_VALUE))
}