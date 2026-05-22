class Solution {
    fun firstUniqChar(s: String): Int {

        val list = IntArray(26)

        for(c in s){
            list[c - 'a'] ++
        }
       for(i in s.indices){
           if(list[s[i] - 'a']==1){
            return i
         }
       }

       return -1

    }
}
