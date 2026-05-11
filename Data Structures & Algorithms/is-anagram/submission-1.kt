class Solution {
     fun isAnagram(s: String, t: String): Boolean {

        if(s.length != t.length ) return false

        val map = mutableMapOf<Char,Int>()


        for(i in s.indices){
            map[s[i]]= ( map[s[i]] ?: 0)+1
            map[t[i]]= ( map[t[i]] ?: 0)-1
        }
        
        for(e in map.entries){
           if( e.value >0){
               return false
           }
        }
        
       return true
    }
}