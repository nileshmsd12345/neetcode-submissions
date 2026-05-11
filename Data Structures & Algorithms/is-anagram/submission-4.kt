class Solution {
    fun isAnagram(s: String, t: String): Boolean {

        if(s.length != t.length ) return false

        var arr = IntArray(26)

        for(e in s.indices){

            arr[s[e]-'a'] +=1
            arr[t[e]-'a'] -=1
        }
        
       return arr.all{it==0}
    }
}
