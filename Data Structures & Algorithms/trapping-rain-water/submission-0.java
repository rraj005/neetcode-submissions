class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) return 0;
        int l = 0, r = height.length - 1, res = 0;
        int lm = height[l], rm = height[r];
        while (l < r){
            if (lm < rm){
                l++;
                lm = Math.max(lm, height[l]);
                res += lm - height[l];
            }
            else{
                r--;
                rm = Math.max(rm, height[r]);
                res += rm - height[r];
            }
        }
        return res;
    }
}
