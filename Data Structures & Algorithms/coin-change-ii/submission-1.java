class Solution {
    public int change(int amount, int[] coins) {
        int c = 0, len = coins.length;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, 0);
        dp[0] = 1;
        for (int i : coins){
            for (int j = i; j <= amount; j++) dp[j] += dp[j - i];
        }
        return dp[amount];
    }
}
