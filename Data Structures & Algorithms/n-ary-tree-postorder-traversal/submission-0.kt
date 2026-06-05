/*
// Definition for a Node.
class Node(var `val`: Int) {
    var children: MutableList<Node> = mutableListOf()
}
*/

class Solution {
    fun postorder(root: Node?): List<Int> {

        val res = mutableListOf<Int>()

         helper(root,res)

         return res

    }

    fun helper(root: Node?,res: MutableList<Int>){
        if(root?.`val` == null) return
       
       val children = root?.children ?: listOf<Node>()

       for(child in children){
         helper(child,res)
       }

       root?.`val`?.let{
        res.add(it!!)
       }

    }
}
