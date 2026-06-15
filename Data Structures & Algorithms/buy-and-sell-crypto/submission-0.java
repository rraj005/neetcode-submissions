class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, r = 1, p = 0;
        while (r < prices.length){
            if (prices[l] < prices[r]){
                int profit = prices[r] - prices[l];
                p = Math.max(p, profit);
            }
            else l = r;
            r++;
        }
        return p;
    }
}
