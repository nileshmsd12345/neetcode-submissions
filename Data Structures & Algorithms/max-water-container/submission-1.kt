class Solution {
    fun maxArea(heights: IntArray): Int {

    var a = 0
    var b = heights.size -1

    var max = 0

     var cur = 0

    while(a <b){
       cur = (b-a)*minOf(heights[a],heights[b])
      max = maxOf(cur,max)

     val diff = heights[b]- heights[a]

      if(diff >0){
        a++
      }else if(diff <0){
        b--
      }else{
        a++
        b--
      }
    }
return maxOf(cur,max)
    }
}
