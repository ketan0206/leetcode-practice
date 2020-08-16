// https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/551/week-3-august-15th-august-21st/3426/

class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length < 1) return 0;
        int buy1 = -prices[0], sell1 = 0, buy2 = -prices[0], sell2 = 0;
        for(int i = 1; i < prices.length; i++) {
            buy1 = Math.max(buy1, -prices[i]);
            sell1 = Math.max(sell1, buy1 + prices[i]);
            buy2 = Math.max(buy2, sell1 - prices[i]);
            sell2 = Math.max(sell2, buy2 + prices[i]);
        }
        return sell2;
    }
}