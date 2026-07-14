class Solution {
    fun getSum(a: Int, b: Int): Int {
        var currentA = a
        var currentB = b

        while (currentB != 0) {
            val carry = (currentA and currentB) shl 1
            currentA = currentA xor currentB
            currentB = carry
        }
        return currentA
    }
}

