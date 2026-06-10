/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun maxDepth(root: TreeNode?): Int {

        val stack : ArrayDeque<Pair<TreeNode?,Int>> = ArrayDeque()

        var level = 0

        stack.addLast(Pair(root,1))


        while(stack.isNotEmpty()){
            val (node, d)  = stack.removeLast()

            if(node==null)continue

            level = maxOf(level,d)

            node?.left?.let{
                stack.addLast(Pair(it!!,d+1))
            }
             node?.right?.let{
                stack.addLast(Pair(it!!,d+1))
            }
        }

        
return level

    }
}
