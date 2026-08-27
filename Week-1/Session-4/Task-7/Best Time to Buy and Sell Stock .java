// Program
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
           for (int i = 1; i < prices.length; i++) {
              minPrice = Math.min(minPrice, prices[i]);
            int profit = prices[i] - minPrice;
             maxProfit = Math.max(maxProfit, profit);
        }
      return maxProfit;
    }
}

Accepted
Runtime: 0 ms
Case 1
Case 2
Input
prices = [7,1,5,3,6,4]
Output : 5
Expected : 5
