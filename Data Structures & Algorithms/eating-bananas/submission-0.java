class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 0, r = Arrays.stream(piles).max().getAsInt();
        int res = r;
        while (l <= r){
            int k = (l + r) / 2;
            long tt = 0;
            for (int p : piles) tt += Math.ceil((double) p / k);
            if (tt > h) l = k + 1;
            else{
                r = k - 1;
                res = k;
            }
        }
        return res;
    }
}
