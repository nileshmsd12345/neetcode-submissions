class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {

        val s1Count = IntArray(26)

        val s2Count = IntArray(26)

        for(c in s1){
         s1Count[c-'a'] +=1
        }
        var left = 0
        
        val s1Size = s1.length

        for(right in s2.indices){

           if(right-left+1 <= s1Size){
             s2Count[s2[right]-'a'] +=1
           }else{
            s2Count[s2[right]-'a'] +=1

            s2Count[s2[left]-'a'] -=1
           left ++

           }

           if(s1Count.contentEquals(s2Count)){
            return true
           }
        }

    return false

    }
}
