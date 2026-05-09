class Solution {

    fun twoSum(numbers: IntArray, target: Int): IntArray {

        for (i in numbers.indices) {

            val complement = target - numbers[i]

            val res = binarySearch(numbers, complement, i + 1)

            if (res != -1) {
                return intArrayOf(i + 1, res + 1)
            }
        }

        return intArrayOf()
    }

    private fun binarySearch(numbers: IntArray, target: Int, start: Int): Int {
        var left = start
        var right = numbers.size - 1

        while (left <= right) {
            val mid = left + (right - left) / 2

            when {
                numbers[mid] == target -> return mid
                numbers[mid] < target -> left = mid + 1
                else -> right = mid - 1
            }
        }

        return -1
    }
}