class Solution {
    // go through the board
    // if the board doesn't start with the first letter, it can't be that
    // start at C: go to A.
    // from A: you can't go back to C. so add it to a visited map
    // is it true that if you've visited a letter before and it was the correct letter, but you can't get anytihng else, it can't ever be visited again?


    public boolean exist(char[][] board, String word) {
        //HashSet<String> visited = new HashSet<>();
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (exist(board, visited, word, 0, i, j))
                    return true;
            }
        }
        return false;
    }

    private boolean exist(char[][] board, boolean[][] visited, String word, int wordIndex, int row, int column) {
        if (wordIndex >= word.length() || row < 0 || row >= board.length || column < 0 || column >= board[0].length)
            return false;

        if (word.charAt(wordIndex) != board[row][column])
            return false;

        if (visited[row][column])
            return false;

        if (wordIndex == word.length() - 1)
            return true;

        visited[row][column] = true;
        boolean answer = exist(board, visited, word, wordIndex + 1, row + 1, column) || exist(board, visited, word, wordIndex + 1, row, column + 1) || exist(board, visited, word, wordIndex + 1, row - 1, column) || exist(board, visited, word, wordIndex + 1, row, column - 1);
        visited[row][column] = false;
        return answer;
    }
}
