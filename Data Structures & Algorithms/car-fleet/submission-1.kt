class Solution {
    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {

       val pairs = mutableListOf<Pair<Int,Int>>() 

       for(i in position.indices){

        pairs.add(Pair(position[i],speed[i]))

       }

       val sorted = pairs.sortedByDescending{it.first}
        
       val stack = ArrayDeque<Double>()

        for (car in sorted) {
            val time = (target - car.first).toDouble() / car.second
            
            // Only add to stack if it's slower than the current lead fleet
            if (stack.isEmpty() || time > stack.last()) {
                stack.addLast(time)
            }
        }
   return stack.size

    }
}
