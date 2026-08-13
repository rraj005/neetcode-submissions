class Solution {
    public String longestPalindrome(String s) {
        int n = s.length(), maxLen = 0;
        //if (n <= 2 ) return String.valueOf(s.charAt(0));
        String res = "";
        for (int i = 0; i < n; i++){
            int l = i, r = i;
            while (l >= 0 && r < n){
                if (s.charAt(l) != s.charAt(r)) break;
                l--; r++;
            }
            r--; l++;
            int temp = (r - l);
            if (temp >= maxLen){
                maxLen = temp;
                res = s.substring(l, ++r);
            }
            l = i; r = i + 1;
            while (l >= 0 && r < n){
                if (s.charAt(l) != s.charAt(r)) break;
                l--; r++;
            }
            l++; r--;
            temp = (r - l);
            if (temp > maxLen){
                maxLen = temp;
                res = s.substring(l, ++r);
            }
        }
        return res;
    }
}
