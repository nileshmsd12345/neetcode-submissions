class Solution {
    fun maxSubArray(nums: IntArray): Int {

        var cur = nums[0]

        var max = nums[0]

        for(i in 1 until nums.size){
       
       cur = maxOf(cur + nums[i], nums[i])

       max = maxOf(cur,max)

        }

return maxOf(cur,max)
    }
}
