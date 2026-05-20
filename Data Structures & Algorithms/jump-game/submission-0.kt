class Solution {
    fun canJump(nums: IntArray): Boolean {

        var farthest = 0

        for(i in nums.indices){
            if(i > farthest){
                return false
            }

            farthest = maxOf(farthest, i+ nums[i])

            if( nums.size-1 <= farthest){
                return true
            }
        }
     return true
    }
}
