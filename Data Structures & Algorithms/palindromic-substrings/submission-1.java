class Solution {
    public int countSubstrings(String s) {
        int n = s.length(), res = 0;
        for (int i = 0; i < n; i++){
            int l = i, r = i;
            while (l >= 0 && r < n){
                if (s.charAt(l) != s.charAt(r)) break;
                res++;
                l--; r++;
            }
            l = i; r = i + 1;
            while (l >= 0 && r < n){
                if (s.charAt(l) != s.charAt(r)) break;
                res++;
                l--; r++;
            }
        }
        return res;
    }
}
