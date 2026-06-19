class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {

        var left = 1
        var right = piles.maxOrNull() ?:1

        var result = right

        while(left <=right){

            var mid = left + (right-left)/2

            var curTotal = 0
            for(i in piles.indices){

                val a = piles[i]

                if(a%mid==0){
                 curTotal += a/mid
                }else{
                   curTotal += a/mid +1  
                }    

            }

            if(curTotal <= h){
                result = mid
                right = mid -1
            }else{
                left = mid +1
            }

            

        }

return result
    }
}
