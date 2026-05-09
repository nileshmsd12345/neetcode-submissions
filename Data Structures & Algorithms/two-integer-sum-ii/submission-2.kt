class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {

        if (numbers.size == 2) {
            return intArrayOf(1,2)
        }

        var low = 0
        var high = numbers.size - 1

        while (low < high) {

            val sum = numbers[low] + numbers[high]

            if (sum > target) {
                
             high--
            } else if (sum < target) {
                low ++
            } else {
                return intArrayOf(low+1,high+1)
            }

        }

        return intArrayOf()
    }


}