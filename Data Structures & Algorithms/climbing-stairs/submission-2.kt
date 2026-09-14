class Solution {
    fun climbStairs(n: Int): Int {

        if(n<=1){
            return 1
        }

       val list = IntArray(n + 1)

       list[0] = 1
       list[1] = 1

      for(i in 2..n){
       list[i] = list[i-1]+ list[i-2]
       }
      return list[n]

    }
}
