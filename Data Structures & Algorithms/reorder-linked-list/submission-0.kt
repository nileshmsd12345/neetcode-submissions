/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {

    fun reorderList(head: ListNode?): Unit {

        if (head?.next == null) return

        // STEP 1: Find middle
        var slow = head
        var fast = head

        while (fast?.next != null && fast.next?.next != null) {

            slow = slow?.next
            fast = fast.next?.next
        }

        // STEP 2: Reverse second half
        var second = slow?.next
        slow?.next = null

        var prev: ListNode? = null

        while (second != null) {

            val next = second.next

            second.next = prev

            prev = second

            second = next
        }

        // prev is reversed second half head
        var first = head
        second = prev

        // STEP 3: Merge both halves
        while (second != null) {

            val temp1 = first?.next
            val temp2 = second.next

            first?.next = second
            second.next = temp1

            first = temp1
            second = temp2
        }
    }
}