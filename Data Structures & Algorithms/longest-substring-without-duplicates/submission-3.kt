class Solution {
    fun lengthOfLongestSubstring(s: String): Int {

        val map = mutableMapOf<Char, Int>()

        var result = 0
        var left = 0

        for (right in s.indices) {

            val c = s[right]

            if (map.containsKey(c) && map[c]!! >= left) {

                val duplicateIndex = map[c]!!

                // Remove old window chars
                for (i in left until duplicateIndex) {
                    map.remove(s[i])
                }

                left = duplicateIndex + 1
            }

            map[c] = right

            result = maxOf(result, right - left + 1)

            println(map.keys.joinToString(", "))
        }

        return result
    }
}
