class Solution {
    fun maxSubArray(nums: IntArray): Int {

        var lastSum = nums[0]

        var max = nums[0]

        for(i in 1 until nums.size){
         val newSum = lastSum + nums[i]

         if( newSum < nums[i]){
            lastSum = nums[i]
           continue
         }else{
        
          lastSum = newSum
         }

         max = maxOf(lastSum,max)
            
        }


return maxOf(lastSum,max)
    }
}
