class Solution {
    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {

       val sortedCars = position.mapIndexed { i, pos -> Pair(pos, speed[i]) }
            .sortedByDescending { it.first }
        
       val stack = ArrayDeque<Double>()

        for (car in sortedCars) {
            val time = (target - car.first).toDouble() / car.second
            
            // Only add to stack if it's slower than the current lead fleet
            if (stack.isEmpty() || time > stack.last()) {
                stack.addLast(time)
            }
        }
   return stack.size

    }
}
