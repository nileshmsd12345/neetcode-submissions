class Solution {
    fun hammingWeight(n: Int): Int {

        var count = 0

        var n = n

        while(n !=0){
            n = n and (n-1)
            count ++
        }

    return count
    }
}
