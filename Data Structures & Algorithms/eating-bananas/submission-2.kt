class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        // The minimum possible speed is 1 banana per hour
        var left = 1
        // The maximum useful speed is the size of the largest pile
        var right = piles.maxOrNull() ?: 1
        var result = right

        while (left <= right) {
            val mid = left + (right - left) / 2
            var curTotal: Long = 0 // Use Long to prevent integer overflow errors

            for (pile in piles) {
                // Efficient integer ceiling division formula: (pile + mid - 1) / mid
                curTotal += (pile.toLong() + mid - 1) / mid
            }

            // If Koko can finish within h hours, record the speed and try to find a smaller one
            if (curTotal <= h) {
                result = mid
                right = mid - 1 // Look left for a slower, cheaper speed
            } else {
                left = mid + 1  // Too slow! Look right for a faster speed
            }
        }

        return result
    }
}

