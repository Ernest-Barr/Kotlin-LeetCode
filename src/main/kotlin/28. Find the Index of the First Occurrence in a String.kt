private fun strStr(haystack: String, needle: String): Int {
    if (needle == haystack) return 0
    if (needle.length > haystack.length) return -1

    val len = needle.length
    for (i in 0..haystack.length - len) {
        var substr = ""
        for (j in i until i + len) substr += haystack[j]
        if (needle == substr) return i
    }
    return -1
}
fun main() {
    println(strStr("asdfasdfasdfcatasdfasdf", "cat"))
    println(strStr("acaccacacacac", "ac"))
    println(strStr("a", "a"))
    println(strStr("a", "bababa"))
    println(strStr("bbb", "bbb"))
    println(strStr("bbb", ""))
}
