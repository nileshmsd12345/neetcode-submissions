class Solution {
    fun characterReplacement(s: String, k: Int): Int {

        var result = 0

        val size = s.length

        for(i in 0 until size){

        val count = IntArray(26)

        for(j in i until size){

        val index = s[j]-'A'

          count[index] ++

        var maxFreq = 0


        for(f in count){

            maxFreq = maxOf(f,maxFreq)

        }

        val subStringLength = j-i+1

        val change =   subStringLength - maxFreq

        if(change <= k)   {
            result = maxOf(result,subStringLength)
        }   

        }

     }

return result
    }

 
}
