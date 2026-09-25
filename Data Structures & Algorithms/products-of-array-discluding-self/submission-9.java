class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        
        // Step 1: Left-to-Right Pass (Calculate Prefix Products)
        // ans[i] will store the product of all elements to the left of i
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            ans[i] = leftProduct;
            leftProduct *= nums[i]; 
        }
        
        // Step 2: Right-to-Left Pass (Calculate Suffix Products)
        // Multiply the existing prefix product with the suffix product
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        
        return ans;
    }
}
