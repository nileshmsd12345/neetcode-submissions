class Solution {
    fun missingNumber(nums: IntArray): Int {

        var res = nums.size
        for(i in 0 until nums.size){
            res = res xor i xor nums[i]
        }

return res
    }
    
}
