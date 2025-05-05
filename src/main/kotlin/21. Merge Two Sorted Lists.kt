import DataStructure.ListNode

private fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    // Mutable List
    var l1 = list1
    var l2 = list2

    var res: ListNode? = ListNode(0) // Result List
    val copy = res // Pointer to head of result list

    // Iterate until one list is empty
    while (l1 != null && l2 != null) {
        // Perform insertions
        if (l1.`val` > l2.`val`) {
            res?.next = l2
            l2 = l2.next
            res = res?.next
        } else {
            res?.next = l1
            l1 = l1.next
            res = res?.next
        }
    }

    // Remainder of list gets added to end of res
    if (l1 != null) {
        res?.next = l1
    } else {
        res?.next = l2
    }

    return copy?.next
}

fun main() {
    // Lists must be sorted
    val listOne = ListNode(1)
    listOne.next = ListNode(5)
    listOne.next!!.next = ListNode(10)

    val listTwo = ListNode(2)
    listTwo.next = ListNode(3)
    listTwo.next!!.next = ListNode(4)
    listTwo.next!!.next!!.next = ListNode(7)

    var merged = mergeTwoLists(listOne, listTwo)

    while (merged != null) {
        println(merged.`val`)
        merged = merged.next
    }
}