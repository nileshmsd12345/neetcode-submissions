/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun rightSideView(root: TreeNode?): List<Int> {
    
        val res = mutableListOf<Int>()

        if(root ==null)return res

        val queue = ArrayDeque<TreeNode?>()

        queue.addLast(root)

        while(!queue.isEmpty()){
              
        val size = queue.size

        var node : TreeNode? = null

        for(i in 0 until size){

            node = queue.removeFirst()

            node?.left?.let{
                queue.addLast(it!!)
            }
             node?.right?.let{
                queue.addLast(it!!)
            }

        }
        node?.`val`?.let{
         res.add(it!!)
        }
       
        }
return res
    }
}
