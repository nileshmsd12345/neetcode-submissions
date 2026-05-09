class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {

        val result = mutableListOf<List<Int>>()

        nums.sort()

        val unique = mutableSetOf<List<Int>>()

        for (i in nums.indices) {

            val remainder = 0 - nums[i]

            val set = mutableSetOf<Int>()

            for (k in i + 1 until nums.size) {

                val a = nums[k]
                val target = remainder - a

                if (set.contains(target)) {

                    val triplet = listOf(nums[i], target, a).sorted()

                    if (unique.add(triplet)) {
                        result.add(triplet)
                    }
                }

                set.add(a)
            }
        }

        return result
    }
}