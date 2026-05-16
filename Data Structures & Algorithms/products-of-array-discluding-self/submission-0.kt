class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {

        val result = IntArray(nums.size)

        result[0] =1

        for(i in 1..nums.size-1){
       
           result[i] = nums[i-1]*result[i-1]
        
        }

        var right = 1
        
        for(i in nums.size-2 downTo 0){ 
            
           
           result[i] = (nums[i+1]* right)*result[i]
            
            right = nums[i+1]* right
            
        }
        
 return result
    }
   
}
