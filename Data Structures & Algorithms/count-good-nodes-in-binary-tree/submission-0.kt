/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun goodNodes(root: TreeNode?): Int {

        var count = 0

        fun cal(root: TreeNode?,max: Int){

            if(root == null)return

            val v = root!!.`val`

            if(v >=max){
                count ++
            }

           val newMax = maxOf(v,max)

            cal(root?.left,newMax)
             cal(root?.right,newMax)

        }

        cal(root,root!!.`val`)

return count
    }

    
}
