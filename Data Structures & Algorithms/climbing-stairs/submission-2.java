public class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;
        int o = 1, t = 1;
        for (int i = 0; i < n - 1; i++){
            int temp = o;
            o = o + t;
            t = temp;
        }
        return o;
    }
}