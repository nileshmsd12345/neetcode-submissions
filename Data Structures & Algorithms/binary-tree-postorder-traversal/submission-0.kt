/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */


class Solution {
    fun postorderTraversal(root: TreeNode?): List<Int> {

        val res = mutableListOf<Int>()

        postOrder(root,res)


        return res
    }

    fun postOrder(root: TreeNode?,list: MutableList<Int>){

        if(root == null)return

    
        postOrder(root?.left,list)
        postOrder(root?.right,list)

        root?.`val`?.let{
            list.add(it!!)
        }

    }
}

