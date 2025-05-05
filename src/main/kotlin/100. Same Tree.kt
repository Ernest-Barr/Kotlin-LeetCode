import DataStructure.TreeNode

fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
    if (p == null && q == null) return true
    if (p == null || q == null || p.`val` != q.`val`) return false
    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
}

private fun main() {
    val treeOne = TreeNode(5)
    treeOne.left = TreeNode(2)
    treeOne.left!!.right = TreeNode(3)
    treeOne.left!!.left = TreeNode(1)
    treeOne.right = TreeNode(9)
    treeOne.right!!.left = TreeNode(7)
    treeOne.right!!.right = TreeNode(10)

    val treeTwo = TreeNode(5)
    treeTwo.left = TreeNode(2)
    treeTwo.left!!.right = TreeNode(3)
    treeTwo.left!!.left = TreeNode(1)
    treeTwo.right = TreeNode(9)
    treeTwo.right!!.left = TreeNode(7)
    treeTwo.right!!.right = TreeNode(10)

    val treeThree = TreeNode(5)
    treeThree.left = TreeNode(2)
    treeThree.left!!.right = TreeNode(3)
    treeThree.left!!.left = TreeNode(1)
    treeThree.right = TreeNode(9)
    treeThree.right!!.left = TreeNode(7)

    println(isSameTree(treeOne, treeTwo))
    println(isSameTree(treeTwo, treeThree))
}