class Solution {
    public int lengthOfLIS(int[] nums) {
        int sub[] = new int[nums.length];
        int size = 0;
        for (int num : nums){
            int l = 0, r = size - 1;
            while (l <= r){
                int m = l + (r - l) / 2;
                if (num <= sub[m]) r = m - 1;
                else l = m + 1;
            }
            sub[l] = num;
            if (l == size) size++;
        }
        return size;
    }
}
