class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++){
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < board.length; j++){
                if (board[i][j] == '.') continue;
                if (set.contains(board[i][j])) return false;
                set.add(board[i][j]);
            }
        }

        for (int i = 0; i < board.length; i++){
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < board.length; j++){
                if (board[j][i] == '.') continue;
                if (set.contains(board[j][i])) return false;
                set.add(board[j][i]);
            }
        }

        for (int i = 0; i < board.length; i++){
            Set<Character> set = new HashSet<>();
            for (int x = 0; x < 3; x++){
                for (int y = 0; y < 3; y++){
                    int row = (i / 3) * 3 + x;
                    int col = (i % 3) * 3 + y;
                    if (board[row][col] == '.') continue;
                    if (set.contains(board[row][col])) return false;
                    set.add(board[row][col]);
                }
            }
        }
        return true;
    }
}
