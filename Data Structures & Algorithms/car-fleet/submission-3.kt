class Solution {
    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
        val sortedCars = position.mapIndexed { i, pos -> Pair(pos, speed[i]) }
            .sortedByDescending { it.first }

        var fleetCount = 0
        var maxTime = 0.0 // Tracks the bottleneck time of the fleet ahead

        for (car in sortedCars) {
            val time = (target - car.first).toDouble() / car.second
            
            // If this car takes longer than the fleet ahead, it starts a new fleet
            if (time > maxTime) {
                fleetCount++
                maxTime = time // This car is now the new, slower bottleneck leader
            }
        }
        
        return fleetCount
    }
}
