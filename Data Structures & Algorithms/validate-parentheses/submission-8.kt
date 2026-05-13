class Solution {
fun isValid(s: String): Boolean {

        val map = mapOf(
            "(" to ")", "{" to "}", "[" to "]"
        )

        val stack = ArrayDeque<String>()

        for (a in s) {
            val c = a.toString()
            if (map.containsKey(c)) {
                stack.addLast(c)
            } else {
                if (stack.isEmpty() || map[stack.removeLast()] != c) {
                    return false
                }


            }
        }
        return stack.isEmpty()
    }
}
