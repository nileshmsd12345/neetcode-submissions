class Solution {
    fun lengthOfLongestSubstring(s: String): Int {

        if(s.length <=1){
        return s.length
        }

        val map = mutableMapOf<Char,Int>()

        var result =  0

        var left = 0

        var right = 0

        for(i in s.indices){

            val c = s[i]

            if(map.containsKey(c)){
                val start = left
                val end = map[c]!!
                 left = end +1
              for(i in start..end){
              map.remove(s[i])
              }
               
            } else {

            }
              right = i
              map[c] = i

          result = maxOf(right-left+1,result)  

         println(map.keys.joinToString(", "))
        }

          result = maxOf(right-left+1,result)  

return result
    }
}
