class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        int i = 0, j = 0;
        int res = 1;
        Set<Character> set = new HashSet<>();

        while (i <= j && j < s.length()){
            while (set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            res = Math.max(res, (j - i + 1));
            j++;
        }
        return res;
    }
}
