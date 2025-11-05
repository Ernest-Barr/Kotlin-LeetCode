private fun reverseVowels(s: String): String {
    val str = StringBuilder(s)
    val vowels = setOf('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u')
    var l = 0
    var r = str.length - 1


    while (l < r) {
        if (str[l] in vowels && str[r] in vowels) {
            val temp = str[r]
            str[r] = str[l]
            str[l] = temp

            l++
            r--
        }

        if (str[l] !in vowels) l++
        if (str[r] !in vowels) r--
    }


    return str.toString()
}