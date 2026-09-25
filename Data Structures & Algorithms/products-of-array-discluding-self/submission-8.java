class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res[] = new int[nums.length];
        int temp[] = nums;
        res[0] = 1;
        int a = 1;
        for (int i = 1; i < nums.length; i++) res[i] = res[i - 1] * nums[i - 1];
        for (int i = nums.length - 1; i >= 0; i--) {res[i] = res[i] * a;
        a = a * nums[i];
        }
        return res;
    }
}  
