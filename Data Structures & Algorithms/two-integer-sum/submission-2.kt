class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        val map = mutableMapOf<Int,Int>()

        for(i in nums.indices){
            map[nums[i]] = i
        }

         for(i in nums.indices){
            if(map.contains(target- nums[i]) && i != map[target- nums[i]]!!){
                return intArrayOf(i,map[target- nums[i]]!!)
            }
        }
return IntArray(2)
    }
}
