class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int i : nums) sum += i;
        if (sum < Math.abs(target) || (sum + target) % 2 != 0) return 0;
        int p = (sum + target) / 2;
        int dp[] = new int[p + 1];
        dp[0] = 1;
        for (int i : nums){
            for (int j = p; j >= i; j--){
                dp[j] += dp[j - i];
            }
        }
        return dp[p];
    }
}
