class Solution {
     fun topKFrequent(nums: IntArray, k: Int): IntArray {

        if(nums.size <=k){
            return nums
        }

        nums.sort()

        val queue = PriorityQueue<Pair<Int,Int>>(compareBy{it.second})

        var a = nums[0]

        var count= 1

        for(i in 1..nums.size -1){

            if(nums[i]==a){
                count ++
            }else{

              queue.add(Pair(a,count))

            

        if(queue.size > k){
            queue.poll()
        }  

               a  = nums[i]
              count = 1
            }


        }

        queue.add(Pair(a,count))

        if(queue.size > k){
            queue.poll()
        }

      


        return queue.map { 
            it.first
        }.toIntArray()
    }
}
