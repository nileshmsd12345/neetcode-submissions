/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun kthSmallest(root: TreeNode?, k: Int): Int {


       val pq = PriorityQueue<Int>()



        fun travserse(root: TreeNode?){
            if(root== null)return

            pq.add(root?.`val`)
          travserse(root?.left)
          travserse(root?.right)
        }

        travserse(root)

        var res = 0

        for(i in 0 until k){
            val v = pq.poll()
            if(i == k-1){
             res = v
            }
        }


return res
    }
}
