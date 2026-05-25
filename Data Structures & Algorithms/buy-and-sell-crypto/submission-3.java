class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int i = 0;

        for (int j = 1; j < prices.length; j++) {
            if (prices[i] < prices[j]) {
                int profit = prices[j] - prices[i];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                i = j;
            }
        }

        return maxProfit;
    }
}
