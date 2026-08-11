class Solution {
    public int maxProduct(int[] nums) {
        int maxprod = nums[0], minprod = nums[0], prod = nums[0];
        for (int i = 1; i < nums.length; i++){
            int num = nums[i];
            int max = maxprod * num;
            int min = minprod * num;
            maxprod = Math.max(max, Math.max(min, num));
            minprod = Math.min(max, Math.min(min, num));
            prod = Math.max(prod, maxprod);
        }
        return prod;
    }
}
