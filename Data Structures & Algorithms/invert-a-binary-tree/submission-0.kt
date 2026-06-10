/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun invertTree(root: TreeNode?): TreeNode? {

     invert(root)

     return root

    }

    fun invert(root: TreeNode?){

        if(root ==null)return

        val temp = root?.left
         root?.left = root?.right
         root?.right = temp

         invert(root?.left)
         invert(root?.right)

    }
}
