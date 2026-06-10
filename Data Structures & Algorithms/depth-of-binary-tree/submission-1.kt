/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun maxDepth(root: TreeNode?): Int {

        if(root == null)return 0

        val queue : ArrayDeque<TreeNode?> = ArrayDeque()

        var level = 0

        queue.addLast(root)

        while(queue.isNotEmpty()){

            val levelSize = queue.size

            for(i in 0 until levelSize){
           val node = queue.removeFirst()

            node?.left?.let{
                queue.addLast(it!!) 
            }
              node?.right?.let{
                queue.addLast(it!!) 
            }
            }
           
            level ++
        }


return level
    }
}
