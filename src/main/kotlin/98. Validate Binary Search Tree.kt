import DataStructure.TreeNode

private fun isValidBST(root: TreeNode?): Boolean {
    var prev: TreeNode? = null
    var res = true
    fun inOrder(root: TreeNode?) {
        if (root == null) return
        inOrder(root?.left)
        if (prev != null && prev!!.`val` >= root.`val`) {
            res = false
            return
        }
        prev = root
        inOrder(root?.right)

    }
    inOrder(root)
    return res
}

fun main() {
    val treeOne = TreeNode(2)
    treeOne.left = TreeNode(1)
    treeOne.right = TreeNode(3)

    println(isValidBST(treeOne))

    val treeTwo = TreeNode(5)
    treeTwo.left = TreeNode(1)
    treeTwo.right = TreeNode(4)
    treeTwo.right!!.left = TreeNode(3)
    treeTwo.right!!.right = TreeNode(6)
    println(isValidBST(treeTwo))
}