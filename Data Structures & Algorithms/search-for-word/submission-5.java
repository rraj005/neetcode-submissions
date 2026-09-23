class Solution {
    public boolean flag = false;
    public boolean exist(char[][] board, String word) {
        boolean visited[][] = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                if (board[i][j] == word.charAt(0)){
                    parse(board, word, 0, i, j, visited);
                    if (flag) return flag;
                }
            }
        }
        return flag;
    }

    public void parse(char[][] board, String word, int idx, int i, int j, boolean[][] visited){
        if (idx == word.length()){
            flag = true;
            return;
        }
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || visited[i][j] == true || board[i][j] != word.charAt(idx)) return;
        visited[i][j] = true;
        parse(board, word, idx + 1, i + 1, j, visited);
        if (flag) return;
        parse(board, word, idx + 1, i, j + 1, visited);
        if (flag) return;
        parse(board, word, idx + 1, i - 1, j, visited);
        if (flag) return;
        parse(board, word, idx + 1, i, j - 1, visited);
        if (flag) return;
        visited[i][j] = false;
    }
}
