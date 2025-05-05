import DataStructure.TreeNode

private fun inorderTraversal(root: TreeNode?): List<Int> {
    val list: MutableList<Int> = mutableListOf()
    fun inOrder(local: TreeNode?) {
        if(local == null) return
        inOrder(local.left)
        list.add(local.`val`)
        inOrder(local.right)
    }
    inOrder(root)

    return list
}

fun main() {
    val treeOne = TreeNode(5)
    treeOne.left = TreeNode(2)
    treeOne.left!!.right = TreeNode(3)
    treeOne.left!!.left = TreeNode(1)
    treeOne.right = TreeNode(9)
    treeOne.right!!.left = TreeNode(7)
    treeOne.right!!.right = TreeNode(10)
    println(inorderTraversal(treeOne).joinToString(", "))
}

