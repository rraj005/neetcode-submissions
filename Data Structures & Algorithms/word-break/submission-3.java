class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        // Bottom up approach, as we build answers from smaller prefixes to larger prefixes
        //dp[i] = If s[0, i-1] can be formed by using the words in the dictonary
        // If we can find an index j < i such that dp[j] is true and s[j, i] is present in the dict
        // dp[i] = dp[j] AND s[j..i-1] is in dictionary

        HashSet<String> set = new HashSet<>(wordDict);
        // Find maximum word length in dictionary
        int maxLen = 0;
        for (String w : set) {
            maxLen = Math.max(maxLen, w.length());
        }

        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        //Base case: empty string is always present in the dictionary
        dp[0] = true;

        // Try to build answer for every word length from 1 to n
        for (int i = 1; i <= n; i++) {
            
            // Check every possible word before i
            for (int j =  Math.max(0, i - maxLen); j < i; j++) {

                // 1. Prefix s[0...j-1] is already valid
                // 2. Current substring s[j...i-1] exists in dictionary
                if (dp[j] && set.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        // Can whole string s[0...n-1] be segmented?
        return dp[n];
    }
}
