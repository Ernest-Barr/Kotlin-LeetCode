package DataStructure

class Node(var `val`: Int) {
    var neighbors: ArrayList<Node?> = ArrayList<Node?>()

    override fun toString(): String {
        return `val`.toString()
    }
}