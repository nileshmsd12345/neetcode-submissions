/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        if(root==null)return null
        val rVal = root!!.`val`
        val pVal = p!!.`val`
        val qVal = q!!.`val`
      if(rVal==pVal|| rVal==qVal)
      return root
      if(rVal> pVal && rVal <qVal || rVal> qVal && rVal <pVal)
      return root
       if(rVal > pVal && rVal > qVal){
        return lowestCommonAncestor(root?.left,p,q)
       }else{
         return lowestCommonAncestor(root?.right,p,q)
       }  
    }


}
