import DataStructure.ListNode

private fun removeElements(head: ListNode?, `val`: Int): ListNode? {
    val res: ListNode? = ListNode(0)
    res?.next = head
    var current = res

    while (current != null) {
        while (current?.next?.`val` == `val`) {
            current?.next = current?.next?.next
        }
        current = current?.next
    }

    return res?.next
}

fun main() {

    val list = ListNode(1)
    list.next = ListNode(2)
    list.next!!.next = ListNode(4)
    list.next!!.next!!.next = ListNode(4)
    list.next!!.next!!.next!!.next = ListNode(4)
    list.next!!.next!!.next!!.next!!.next = ListNode(5)
    var listRes = removeElements(list, 4)

    while (listRes != null) {
        println(listRes)
        listRes = listRes.next

    }

}