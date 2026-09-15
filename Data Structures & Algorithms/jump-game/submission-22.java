class Solution {
    public boolean canJump(int[] nums) {
        
        int target = 0;
        for (int i=0; i < nums.length - 1; i++) {
            if (i > target) return false;
            target = Math.max(target, i + nums[i]);

        }
        return target >= nums.length - 1;
    }
}
