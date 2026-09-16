class Solution {
    fun isSubsequence(s: String, t: String): Boolean {

        if(s.isEmpty())return true

        var i : Int = 0
        var j : Int = 0


        while(j< t.length){

            if(s[i]==t[j]){
                i++
            }
              j++

              if(i==s.length){
                return true
              }
        }
        return i == s.length
    }
}
