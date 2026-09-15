class Solution {
    public int maxSubArray(int[] nums) {
        int res = Integer.MIN_VALUE, curr = 0;
        for (int i : nums){
            curr += i;
            res = Math.max(res, curr);
            if (curr < 0) curr = 0;
        }
        return res;
    }
}
