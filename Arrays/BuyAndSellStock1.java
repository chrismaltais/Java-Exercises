// Say you have an array for which the ith element is the price of a given stock on day i.
// If you were only permitted to complete at most one transaction 
// (i.e., buy one and sell one share of the stock),
// design an algorithm to find the maximum profit.
// Note that you cannot sell a stock before you buy one.

class Solution {
    public int maxProfit(int[] prices) {
        int currMaxProfit = 0;
        int globalMaxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            currMaxProfit = Math.max(0, currMaxProfit += prices[i] - prices[i-1]);
            globalMaxProfit = Math.max(currMaxProfit, globalMaxProfit);
        }
        return globalMaxProfit;
    }
}
