class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy = 0;
        for (int sell = 1; sell < prices.length; sell++) {
            if (prices[buy] < prices[sell]) {
                int profit = prices[sell] - prices[buy];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buy = sell;
            }
        }

        return maxProfit;
    }
}
