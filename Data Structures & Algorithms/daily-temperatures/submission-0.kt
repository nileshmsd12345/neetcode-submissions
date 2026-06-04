class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {

        val res = IntArray(temperatures.size)

        val stack = ArrayDeque<Pair<Int,Int>>()


        for(i in temperatures.indices){

            val cur = temperatures[i]

            while (
                stack.isNotEmpty() &&
                cur > stack.last().second
            ) {

                val prev = stack.removeLast()

                res[prev.first] = i - prev.first
            }

            stack.addLast(i to cur)

        }
      return res


    }
}
