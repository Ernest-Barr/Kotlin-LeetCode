package InProgress

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    var listOne = l1
    var listTwo = l2
    var dummy = ListNode(0)

    var res = dummy
    var sum = (l1?.`val` ?: 0) + (l2?.`val` ?: 0)

    while (listOne != null || listTwo != null || sum != 0) {

    }

    return res.next
}


