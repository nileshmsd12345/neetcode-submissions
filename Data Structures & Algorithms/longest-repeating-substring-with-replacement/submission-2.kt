class Solution {
    fun characterReplacement(s: String, k: Int): Int {

        var result = 0

        var maxFreq = 0

        var l = 0

        var r = 0

        val arr = IntArray(26)

        while(r < s.length){

            val index = s[r]-'A'

            arr[index]++

            maxFreq = maxOf(maxFreq,arr[index] )

            val length = r-l +1

            if(length- maxFreq > k){
                 arr[s[l]-'A']--
                 l ++
               
            }

            result = maxOf(r-l +1,result)
            r ++
        }
return result
    }
}
