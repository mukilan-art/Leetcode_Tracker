// Last updated: 9/1/2026, 4:18:03 PM
class Solution {
    public int maxProfit(int[] prices, int fee) {
        int buy=Integer.MIN_VALUE;
        int sell=0;

        for (int price : prices) {
            buy = Math.max(buy,sell-price);
            sell = Math.max(sell,buy+price-fee);
        }

        return sell;
    }
}