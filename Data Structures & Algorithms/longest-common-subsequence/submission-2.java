class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        Integer[][] memo = new Integer[text1.length()][text2.length()];
        return lcs(text1, text2, text1.length() - 1, text2.length() - 1, memo);
    }

    private int lcs(String text1, String text2, int i, int j, Integer[][] memo) {
        // Base case: agar koi bhi string khatam ho gayi
        if (i < 0 || j < 0) {
            return 0;
        }

        // Memo check: kya ye already solve ho chuka hai?
        if (memo[i][j] != null) {
            return memo[i][j];
        }

        int result;

        // Case 1: characters match karte hain
        if (text1.charAt(i) == text2.charAt(j)) {
            result = 1 + lcs(text1, text2, i - 1, j - 1, memo);
        } else {
            // Case 2: match nahi karte — dono options try karo
            int skipText1 = lcs(text1, text2, i - 1, j, memo);
            int skipText2 = lcs(text1, text2, i, j - 1, memo);
            result = Math.max(skipText1, skipText2);
        }

        memo[i][j] = result;
        return result;
    }
}