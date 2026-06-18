/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val res = mutableListOf<List<Int>>()

        if(root ==null) return res 

        val queue = ArrayDeque<TreeNode?>() 

        queue.addLast(root)

        while(queue.isNotEmpty()){
           
           val levelSize = queue.size

           val curLeveleList = mutableListOf<Int>()

           for(i in 0 until levelSize){
            val n = queue.removeFirst()
           n?.let{
             curLeveleList.addLast(it!!.`val`)
           }
             n?.left?.let{
            queue.addLast(it!!)
           }
            n?.right?.let{
            queue.addLast(it!!)
            }
           }
           res.add(curLeveleList)

        }
    return res
    }

   
}
