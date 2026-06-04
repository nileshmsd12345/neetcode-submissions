/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun preorderTraversal(root: TreeNode?): List<Int> {

        val res = mutableListOf<Int>()

        preorder(root,res)


        return res
    }

    fun preorder(root: TreeNode?,list: MutableList<Int>){

        if(root == null)return

        root?.`val`?.let{
            list.add(it!!)
        }

        preorder(root?.left,list)
        preorder(root?.right,list)

    }
}
