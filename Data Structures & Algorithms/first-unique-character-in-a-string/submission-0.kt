class Solution {
    fun firstUniqChar(s: String): Int {

        val list = IntArray(26)

        for(c in s){
            val index = c - 'a'

            list[index] ++

        }
       for(i in 0..s.length-1){
         val index = s[i] - 'a'

         if(list[index]==1){
            return i
         }
       }

       return -1

    }
}
