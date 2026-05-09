class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {

        for (i in numbers.indices) {
         for(j in numbers.indices){
             if(j==i){
                 continue
             }else{
                 if(numbers[i]+numbers[j]==target){
                     return intArrayOf(i+1,j+1)
                 }
             }
         }
        }
        return intArrayOf()
    }
}