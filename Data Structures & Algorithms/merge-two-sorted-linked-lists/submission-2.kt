/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {

        val list = mutableListOf<Int>()

        var cur = list1

        while(cur !=null){

            list.add(cur?.`val`!!)

            cur = cur.next
           
        }

          cur = list2

        while(cur !=null){
            list.add(cur?.`val`!!)
            cur = cur.next
           
        }

        list.sort()

        if (list.isEmpty()) return null

    
        val head = ListNode(list[0])

        cur = head

        for(i in 1 until list.size){
        
         cur?.next = ListNode(list[i])
         cur = cur?.next

        }

return head

    }
}
