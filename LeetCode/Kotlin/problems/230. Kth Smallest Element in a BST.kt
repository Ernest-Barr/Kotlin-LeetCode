import DataStructure.TreeNode

private fun kthSmallest(root: TreeNode?, k: Int): Int {
    // LNR traversal
    var c: Int = 0
    var res = 0
    fun inOrder(node: TreeNode?) {
        if (node == null) return
        inOrder(node.left)
        c++
        if (c == k) {
            res = node.`val`
            return
        }
        inOrder(node.right)
    }
    inOrder(root)
    return res
}

fun main() {

    val treeOne = TreeNode(5)
    treeOne.left = TreeNode(3)
    treeOne.right = TreeNode(6)
    treeOne.left!!.right = TreeNode(4)
    treeOne.left!!.left = TreeNode(2)
    treeOne.left!!.left!!.left = TreeNode(1)

    println(kthSmallest(treeOne, 3) == 3)

    val treeTwo = TreeNode(3)
    treeTwo.left = TreeNode(1)
    treeTwo.left!!.right = TreeNode(2)
    treeTwo.right = TreeNode(4)

    println(kthSmallest(treeTwo, 1) == 1)
}