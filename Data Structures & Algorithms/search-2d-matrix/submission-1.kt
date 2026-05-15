class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        val rows = matrix.size
        val cols = matrix[0].size

        var left = 0
        var right = (rows * cols )-1

        while(left<=right){
            val mid = left + (right-left)/2

            var midValue = matrix[mid/cols][mid%cols]

            val diff = target - midValue

            if(diff>0){
                left = mid+1
            } else if(diff <0){
                right = mid-1
            } else {
                return true
            }
        }

        return false

    }
}