class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int grid[][] = new int[text1.length() + 1][text2.length() + 1];
        Arrays.fill(grid[0], 0);
        for (int i = 0; i <= text1.length(); i++) grid[i][0] = 0;

        for (int i = 1; i <= text1.length(); i++){
            char ch = text1.charAt(i - 1);
            for (int j = 1; j <= text2.length(); j++){
                if (ch == text2.charAt(j - 1)) grid[i][j] = grid[i - 1][j - 1] + 1;
                else grid[i][j] = Math.max(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[text1.length()  ][text2.length()];
    }
}
