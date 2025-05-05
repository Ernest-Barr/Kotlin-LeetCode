private fun twoSum(numbers: IntArray, target: Int): IntArray {
    var l = 0
    var r = numbers.size - 1

    while (l < r) {
        if (numbers[l] + numbers[r] == target) {
            return intArrayOf(++l, ++r)
        } else if (numbers[l] + numbers[r] > target) {
            r--
        } else {
            l++
        }
    }
    return intArrayOf(-1)
}

fun main() {
    println(twoSum(intArrayOf(2, 7, 11, 15), 9).joinToString(", "))
    println(twoSum(intArrayOf(2, 3, 4), 6).joinToString(", "))
    println(twoSum(intArrayOf(-1, 0), -1).joinToString(", "))
}