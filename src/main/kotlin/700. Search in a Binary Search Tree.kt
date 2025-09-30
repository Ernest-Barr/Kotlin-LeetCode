import DataStructure.TreeNode

private fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
    var res: TreeNode? = null
    fun search(localRoot: TreeNode?) {
        if (localRoot == null) return
        search(localRoot.left)
        if (localRoot.`val` == `val`) {
            res = localRoot
            return
        }
        search(localRoot.right)
    }
    search(root)
    return res
}