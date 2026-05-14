class Solution {
    fun lengthOfLongestSubstring(s: String): Int {

        var longestStr = ""
        
        var result = 0

        for(c in s){
            if(longestStr.contains(c)){

              longestStr = longestStr.split(c)[1] + c 

            }else{
            longestStr = longestStr + c
            }
            
            result = maxOf(result,longestStr.length)
            
           
        }

        return maxOf(result,longestStr.length)

    }
}


