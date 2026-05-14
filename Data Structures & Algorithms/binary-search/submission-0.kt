class Solution {
    fun search(nums: IntArray, target: Int): Int {

        var left = 0

        var right = nums.size -1

        while (left <=right){
         val mid = left + (right -left)/2

         val diff = target - nums[mid]

         if(diff >0){
            left = mid+1

         }else if(diff<0){
           right = mid -1
         }else{
          return mid
         }

        }
return -1
    }
}
