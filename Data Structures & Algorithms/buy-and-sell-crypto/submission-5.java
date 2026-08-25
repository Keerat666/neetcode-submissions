class Solution {
    public int maxProfit(int[] prices) {

        int start =0;
        int end = 0;
        int ans=0;

        while(end < prices.length)
        {
            int profit = prices[end]-prices[start];
            ans = Math.max(ans,profit);

            if(prices[end]<prices[start])
            {
                start = end;
            }
            else
                end++;
        }

        return ans;
        
    }
}