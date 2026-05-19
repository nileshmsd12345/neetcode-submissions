/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {

        var dummy = ListNode(0)

        var l1 = list1

        var l2 = list2

        var cur = dummy

        while(l1 != null && l2 != null){
            if(l1?.`val`!! <= l2?.`val`!! ){

                cur?.next = ListNode(l1?.`val`!!)

                l1 = l1?.next

            }else{
                cur?.next = ListNode(l2?.`val`!!)

                l2 = l2?.next
            }

            cur = cur?.next!!

        }

        cur.next = l1 ?: l2

       return dummy?.next
    }
}
