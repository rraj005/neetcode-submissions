class Solution {
    public int jump(int[] nums) {
        if (nums.length <= 1) return 0;
        int c = 0;
        int l = 0, r = 0;
        while (l <= r && r < nums.length){
            c++;
            r = l + nums[l];
            if (r >= nums.length - 1) break;
            int temp = 0;
            for (int i = l + 1; i <= r; i++){
                temp = temp + nums[temp] < (i + nums[i]) ? i : temp;
            }
            l = temp;
        }
        return c;
    }
}
