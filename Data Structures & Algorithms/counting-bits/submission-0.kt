class Solution {
    fun countBits(n: Int): IntArray {

        val res = IntArray(n+1)

        for(i in 0 until n+1){

            res[i] = hammingWeight(i)

        }
return res
    }

    fun hammingWeight(n:Int):Int{

        var n :Int = n

        var count = 0

        while(n != 0){
            n = n and (n-1)

            count ++

        }
      return count
    }
}
