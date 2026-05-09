class Solution {
    fun longestConsecutive(nums: IntArray): Int {

        if (nums.size <= 1) {
            return nums.size
        }

        val queue = PriorityQueue<Int>()

        for (n in nums) {
            queue.add(n)
        }

        var a = queue.poll()!!
        var longestSeq = 1
        var currentSeq = 1

        while(queue.isNotEmpty()){

           val cur = queue.poll()!!

            if(cur == a){
                continue
            }

            if(cur == a+1){
                currentSeq++
                a = cur
            }else{

                longestSeq = maxOf(longestSeq,currentSeq)
                a = cur

                currentSeq =1


            }


        }



         return maxOf(longestSeq, currentSeq)
    }
}