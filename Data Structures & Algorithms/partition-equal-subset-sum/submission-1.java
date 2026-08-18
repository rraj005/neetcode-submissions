class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i : nums) sum += i;
        if (sum % 2 != 0) return false;
        int t = sum / 2;
        int n = nums.length;
        boolean dp[] = new boolean[t + 1];
        dp[0] = true;

        for (int num : nums){
            for (int j = t; j >= num; j--){
                dp[j] = dp[j] || dp[j - num];
            }
        }
        return dp[t];
    }
}
