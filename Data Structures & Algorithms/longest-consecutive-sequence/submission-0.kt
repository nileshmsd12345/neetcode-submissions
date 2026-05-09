class Solution {
    fun longestConsecutive(nums: IntArray): Int {

        if (nums.size <= 1) {
            return nums.size
        }

        val set = mutableSetOf<Int>()

        for (n in nums) {
            set.add(n)
        }

        var longestSeq = 1;

        for (n in set) {
            if (set.contains(n - 1)) {
                continue
            } else {
                var currentNum = n
                var currentSeq = 1;
                while (set.contains(currentNum + 1)) {
                    currentSeq++
                    currentNum += 1

                }
                longestSeq = maxOf(longestSeq, currentSeq)
            }
        }

        return longestSeq
    }
}