class Solution {
    fun maxProfit(prices: IntArray): Int {

        var maxProfit = 0

        for(i in 0..prices.size-2){
            val buy = prices[i]
            for(k in i+1..prices.size-1){

                val sell = prices[k]

                if(buy>sell){
                    continue
                }

                maxProfit = maxOf(maxProfit,sell-buy)

            }
        }
return maxProfit
    }
}
