/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reverseList(head: ListNode?): ListNode? {

        if(head== null){
            return head
        }


     val list = mutableListOf<Int>()

        var cur = head

        while(cur !=null){

            list.add(cur.`val`)
            cur = cur.next

        }

       val  newHead = ListNode(list.last())

         cur = newHead

        for(i in list.size -2 downTo 0){

        cur?.next = ListNode(list[i])

        cur =  cur?.next

        }


      return newHead
    }
}
