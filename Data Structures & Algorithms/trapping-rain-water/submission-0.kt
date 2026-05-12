class Solution {
   fun trap(height: IntArray): Int {

        val size = height.size

        var total = 0

        val leftMax = IntArray(size)
        val rightMax = IntArray(size)

        for (i in height.indices) {
            if (i == 0) {
                leftMax[i] = height[i]
            } else {
                if (height[i] > leftMax[i - 1]) {
                    leftMax[i] = height[i]
                }else{
                    leftMax[i] = leftMax[i-1]
                }
            }
            
        }



        val last = size - 1
        for (i in last downTo 0) {
            if (i == last) {
                rightMax[last] = height[last]
            } else {
                if (height[i] > rightMax[i + 1]) {
                    rightMax[i] = height[i]
                }else{
                    rightMax[i] = rightMax[i+1]
                }
            }

 
        }

        for (i in height.indices) {
            val cur = minOf(leftMax[i], rightMax[i]) - height[i]
            total += cur
        }


        return total
    }
}
