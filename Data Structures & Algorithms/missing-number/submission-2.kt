class Solution {
    fun missingNumber(nums: IntArray): Int {

        val n = nums.size

        val expSum = (n*(n+1))/2

         val sum = nums.sum()


         return expSum - sum
    }
}
