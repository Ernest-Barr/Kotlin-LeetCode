private fun isPalindrome(s: String): Boolean {
    var start = 0
    var end = s.length - 1
    val str = s.toLowerCase()
    while (start <= end) {
        if (!str[start].isLetterOrDigit()) {
            start++
        } else if (!str[end].isLetterOrDigit()) {
            end--
        } else if (str[start] != str[end]) {
            return false
        } else {
            start++
            end--
        }
    }
    return true
}


fun main() {
    println(isPalindrome("Racecar"))
    println(isPalindrome("Radar"))
    println(isPalindrome("Madam"))
    println(isPalindrome("Level"))
    println(isPalindrome("Rotor"))
    println(isPalindrome("Civic"))
    println(isPalindrome("Refer"))
    println(isPalindrome("Test"))
    println(isPalindrome("Hello"))
}

