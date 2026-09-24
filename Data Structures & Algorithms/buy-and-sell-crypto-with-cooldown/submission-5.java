class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;
        int prev_hold = Integer.MIN_VALUE, prev_sold = 0, prev_rest = 0;
        for (int i : prices){
            int hold = Math.max(prev_hold, prev_rest - i);
            int sold = prev_hold + i;
            int rest = Math.max(prev_sold, prev_rest);
            prev_hold = hold;
            prev_sold = sold;
            prev_rest = rest;
        }
        return Math.max(prev_sold, prev_rest);
    }
}
