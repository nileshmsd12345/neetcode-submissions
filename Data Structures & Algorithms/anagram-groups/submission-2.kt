class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {

        val map = mutableMapOf<String, MutableList<String>>()

        for (s in strs) {

            val count = IntArray(26)

            for (c in s) {
                val index = c - 'a'
                count[index]++
            }

            val key = count.joinToString("#")

            if (!map.containsKey(key)) {
                map[key] = mutableListOf()
            }

            map[key]?.add(s)
        }

        return map.values.toList()
    }
}