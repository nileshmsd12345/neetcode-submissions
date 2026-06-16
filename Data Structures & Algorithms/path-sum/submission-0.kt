/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
    return hasMatch(root,targetSum,0)
    }

    fun hasMatch(p: TreeNode?,target: Int, cur: Int):Boolean{
        if(p == null) return false

        val newSum = cur +( p?.`val` ?:0)

        if(p?.left==null && p?.right==null) return newSum == target

        return hasMatch(p?.left,target,newSum) || hasMatch(p?.right,target,newSum)
    }
}
