private fun removeElement(nums: IntArray, `val`: Int): Int {

    var k = 0
    for (i in 0 until nums.size) {
        if (nums[i] != `val`) {
            val temp = nums[k]
            nums[k] = nums[i]
            nums[i] = temp
            k++
        }
    }
    return k
}

fun main() {
    // Returns the size of the new array with the values removed
    println(removeElement(intArrayOf(1,1,1,1,3,4,5,6,7,8,9,10,2), 1))
    println(removeElement(intArrayOf(1,1,1,1,1), 1))
    println(removeElement(intArrayOf(1,1,1,1,1), 2))
}

