package InProgress

import java.util.concurrent.ConcurrentLinkedQueue

fun longestValidParentheses(s: String): Int {
    val queue = ConcurrentLinkedQueue<Char>()
    var openCount = 0
    var max = 0
    var count = 0
    var j = 0
    s.forEach { c -> queue.add(c) }

    queue.forEach { _ ->
        val current = queue.poll()

        when (current) {
            '(' -> {
                openCount++
                println("counted")
            }

            ')' -> {
                for (i in 0..<openCount + 1) {
                    if (queue.peek() == ')') {
                        count += 2
                        println("incremented")
                        queue.poll()
                    }
                }
                openCount = 0
            }

            //TODO Fix how the max is being handled
        }
        max = maxOf(max, count)
        println("OC" +  openCount)
        println("J" + j)
        j++

    }
    return max

//    s.forEach { c -> queue.push(c) }

//    for (i in 0..<s.length - 1) {
//        val current = s[i]
//        when (current) {
//            '(' -> {
//                openCount++
//            }
//
//            ')' -> {
//                for (j in i..<i + openCount) {
//                    if (s[j] == ')') {
//                        totalCount += 2
//                    }
//                }
//                openCount = 0
//            }
//
//            else -> {
//                totalCount = 0
//            }
//        }
//
//        if (totalCount > max) max = totalCount
//    }

}

fun main() {
    println("out" + longestValidParentheses(readln()))
}
//()(())
