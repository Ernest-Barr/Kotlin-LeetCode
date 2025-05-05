import DataStructure.ListNode
import util.ListUtil.Companion.equalsList
import util.ListUtil.Companion.toLinkedList

private fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    // Kotlin params are immutable
    var res: ListNode? = l1 //Ideally swap the name of this variable with the name of l1Copy
    var l2Copy: ListNode? = l2
    // Pointer to beginning of linked list so we odnt lose it when returning the value
    val l1Copy: ListNode? = res

    // Iterate through list
    while (l2Copy != null && res != null) {
        if (res.next == null && l2Copy!!.next != null) {
            res.next = ListNode(0)
        }
        if (res.`val` + l2Copy.`val` < 10) {
            res.`val` += l2Copy.`val`
        } else {
            if (res.next == null) {
                res.next = ListNode(1)
            } else {
                res.next!!.`val`++
            }
            res.`val` = (res.`val` + l2Copy.`val`) % 10
        }

        res = res.next
        l2Copy = l2Copy.next
    }

    while (res != null) {
        if (res.`val` < 10) {
            res = res.next
        } else {
            if (res.next == null) {
                res.next = ListNode(1)
            } else {
                res.next!!.`val`++
            }
            res.`val` %= 10
            res = res.next
        }
    }

    return l1Copy
}

fun main() {
    println(addTwoNumbers(intArrayOf(2,4,3).toLinkedList(), intArrayOf(5,6,4).toLinkedList()).equalsList(intArrayOf(7,0,8).toLinkedList()))
    println(addTwoNumbers(intArrayOf(0).toLinkedList(), intArrayOf(0).toLinkedList()).equalsList(intArrayOf(0).toLinkedList()))
    println(addTwoNumbers(intArrayOf(9,9,9,9,9,9,9).toLinkedList(), intArrayOf(9,9,9,9).toLinkedList()).equalsList(intArrayOf(8,9,9,9,0,0,0,1).toLinkedList()))
}