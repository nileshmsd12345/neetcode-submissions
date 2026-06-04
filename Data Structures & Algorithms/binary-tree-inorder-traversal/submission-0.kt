/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun inorderTraversal(root: TreeNode?): List<Int> {

        val res = mutableListOf<Int>()

        
       inOrder(root,res)
        
   return res
    }

    fun inOrder(root: TreeNode?,list : MutableList<Int>){
       if(root?.`val`==null)return

       inOrder(root.left,list)
      root?.`val`?.let{
       list.add(it)
      }
       inOrder(root.right,list)
    }




}
