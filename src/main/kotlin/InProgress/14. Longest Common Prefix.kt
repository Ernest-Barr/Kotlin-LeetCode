fun longestCommonPrefix(strs: Array<String>): String {
    strs.sort()
    var left = strs[0]
    var right = strs[strs.size - 1]

    var prefixLen = 0

    if(left.isEmpty() || right.isEmpty()) return ""

    for(i in 0 until left.length) {
        if(left[i] == right[i]) {
            prefixLen++
        } else {
            break
        }
    }
    var prefix = left.substring(0,prefixLen)

    for(i in 1 until strs.size) {
        if(strs[i].substring(0,prefixLen) != prefix) {
            return ""
        }
    }

    return prefix
}