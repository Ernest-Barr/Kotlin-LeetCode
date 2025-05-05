import DataStructure.TreeNode

private fun binaryTreePaths(root: TreeNode?): List<String> {
    val list: MutableList<String> = mutableListOf()

    fun preOrder(local: TreeNode?, str: String) {
        if (local == null) return
        val res = if (str == "") "" + local.`val` else str + "->" + local.`val`
        if (local.left == null && local.right == null) {
            list.add(res)
        }

        preOrder(local.left, res)
        preOrder(local.right, res)
    }

    preOrder(root, "")
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
    println(binaryTreePaths(treeOne).joinToString(", "))

    //TODO more cases
}