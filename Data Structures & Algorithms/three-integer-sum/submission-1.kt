class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {

        nums.sort()

        val result = mutableListOf<List<Int>>()

        for (i in 0 until nums.size - 2) {

            if (i > 0 && nums[i] == nums[i - 1]) continue

            val remainder = 0 - nums[i]

            var left = i + 1
            var right = nums.size - 1

            while (left < right) {

                val sum = nums[left] + nums[right]

                if (sum > remainder) {

                    right--
                } else if (sum < remainder) {
                    left++
                } else {
                    result.add(listOf(nums[i], nums[left], nums[right]))

                    while (left < right && nums[left] == nums[left + 1]) {
                        left++
                    }

                    while (left < right && nums[right] == nums[right - 1]) {
                        right--
                    }


                    left++
                    right--
                }

            }


        }

        return result
    }


}