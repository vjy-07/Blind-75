class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int i=1;i<n;i++){
            int currentProfit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, currentProfit);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return maxProfit;
    }
}