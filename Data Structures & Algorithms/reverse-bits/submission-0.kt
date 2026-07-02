class Solution {
    fun reverseBits(n: Int): Int {

        var n = n

        var result = 0

        for(i in 0..31){

            result = (result shl 1) or (n and 1)

            n = n shr 1

        }

      return result 
    }
}
