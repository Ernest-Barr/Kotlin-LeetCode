package Done

fun twoSum(arr: IntArray, target: Int): IntArray {
    var nums: IntArray = arr.copyOf()
    nums.sort()

    var low: Int = 0
    var high: Int = nums.size - 1

    while (low < high) {
        if (nums[low] + nums[high] == target) {
            return intArrayOf(arr.indexOf(nums[low]), arr.lastIndexOf(nums[high]))
        } else if (nums[low] + nums[high] < target) {
            low++
        } else {
            high--
        }
    }
    return intArrayOf(-1)
//    if (nums.size == 2 && nums[0] + nums[1] == target) {
//        return intArrayOf(0, 1)
//    }
//    while (low <= high) {
//        var mid = (high + low) / 2
//
//
//        if (nums[mid] < target) {
//            low = mid + 1
//        } else {
//            high = mid - 1
//        }
//        var innerLow: Int = 0
//        var innerHigh: Int = nums.size - 1
//        while (innerLow <= innerHigh) {
//            var innerMid = (innerHigh + innerLow) / 2
//
//            if (nums[mid] + nums[innerMid] == target) {
//                if (nums.indexOf(nums[mid]) != nums.indexOf(nums[innerMid])) {
//                    return intArrayOf(arr.indexOf(nums[mid]), arr.indexOf(nums[innerMid]))
//                } else if (nums.indexOf(nums[mid]) != nums.lastIndexOf(nums[innerMid])){
//                    return intArrayOf(arr.indexOf(nums[mid]), arr.lastIndexOf(nums[mid]))
//                }
//            }
//
//
//
//            if (nums[mid] + nums[innerMid] < target) {
//                innerLow = innerMid + 1
//            } else {
//                innerHigh = innerMid - 1
//            }
//        }
//    }


//    return intArrayOf(-1)
}

fun main() {
    var out: IntArray = twoSum(intArrayOf(-10,7,19,15), 9)

    for (i in out) {
        println(i)
    }
}
