class Solution {
    fun climbStairs(n: Int): Int {

   val memo: MutableMap<Int, Int> = mutableMapOf()

        fun climbWays(step: Int): Int{

           if(step == 0 || step ==1){
            return 1
           }
           if(memo[step] !=null){
            return memo[step]!!
           }
           memo[step] = climbWays(step-1)+ climbWays(step-2)

           return memo[step]!!

        }


return climbWays(n)
    }
}
