class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                if (grid[i][j] == '1'){
                    count++;
                    grid = parse(grid, i, j);
                }
            }
        }
        return count;
    }

    public char[][] parse(char[][] grid, int i, int j){
        if (i >= grid.length || j >= grid[0].length || grid[i][j] == '0') return grid;
        grid[i][j] = '0';
        grid = parse(grid, i + 1, j);
        grid = parse(grid, i, j + 1);
        if (i > 0) grid = parse(grid, i - 1, j);
        if (j > 0) grid = parse(grid, i, j - 1);
        return grid;
    }
}
