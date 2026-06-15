class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pro = 1, nz  = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0){
                nz++;
                continue;
            }
            pro *= nums[i];
        }
        if (nz > 1) return new int[nums.length];
        int res[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            if (nz > 0) res[i] = (nums[i] == 0) ? pro : 0;
            else res[i] = (pro / nums[i]);
        }
        return res;
    }
}  
