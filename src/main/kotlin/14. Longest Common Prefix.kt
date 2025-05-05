private fun longestCommonPrefix(strs: Array<String>): String {
    strs.sort()
    val left = strs[0]
    val right = strs[strs.size - 1]

    var prefixLen = 0

    if (left.isEmpty() || right.isEmpty()) return ""

    for (i in 0 until left.length) {
        if (left[i] == right[i]) {
            prefixLen++;
        } else {
            break;
        }
    }
    val prefix = left.substring(0, prefixLen)

    for (i in 1 until strs.size) {
        if (strs[i].substring(0, prefixLen) != prefix) {
            return ""
        }
    }

    return prefix
}

fun main() {
    println(longestCommonPrefix(arrayOf("cat" , "car", "cal", "calf")))
}