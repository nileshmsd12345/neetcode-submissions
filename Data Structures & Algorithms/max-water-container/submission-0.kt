class Solution {
    fun maxArea(heights: IntArray): Int {

        var max = 0

        var cur = 0

        for(i in heights.indices){

          var k = i+1

         for(k in heights.indices){
          
          cur = (k-i)*minOf(heights[i],heights[k])

          if(cur >max){
            max = cur
          }
           

         }

        }
        
        return maxOf(max, cur)
    }


}
