//Leetcode Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/1884521556/


class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrise = Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++) {
            minPrise = Math.min(minPrise, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrise);
        }

        return maxProfit;
        
    }
}