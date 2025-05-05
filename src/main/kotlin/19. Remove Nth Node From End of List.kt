import DataStructure.ListNode
import util.ListUtil.Companion.equalsList
import util.ListUtil.Companion.toLinkedList

private fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    val res = ListNode(0)
    res.next = head
    var current: ListNode? = res
    var delayed: ListNode? = res

    for (i in 0 until n + 1) {
        current = current?.next
    }

    while (current != null) {
        delayed = delayed?.next
        current = current?.next
    }

    delayed?.next = delayed?.next?.next
    return res.next
}

fun main() {
    println(
        removeNthFromEnd(intArrayOf(1, 2, 3, 4, 5).toLinkedList(), 2).equalsList(
            intArrayOf(1, 2, 3, 5).toLinkedList()
        )
    )

    println(removeNthFromEnd(intArrayOf(1, 2).toLinkedList(), 1).equalsList(intArrayOf(1, 2).toLinkedList()))
}