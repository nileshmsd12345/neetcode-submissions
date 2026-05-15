class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {

        val list = mutableListOf<Int>()

        for(row in matrix){
            list.addAll(row.toList())
        }

        var left = 0

        var right = list.size -1

        while(left <= right){

            val mid = left + (right-left)/2

            val diff = target - list[mid]

            if(diff > 0){
             left = mid +1
            }else if(diff<0){
             right = mid -1
            }else{
             return true
            }
        }
return false
        }

    
}
