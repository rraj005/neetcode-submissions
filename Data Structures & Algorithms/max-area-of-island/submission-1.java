class Solution {
    int pot = 0;
    public int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == 1){
                    grid = parse(grid, i, j);
                    res = Math.max(res, pot);
                    pot = 0;
                }
            }
        }
        return res;
    }

    public int[][] parse(int[][] grid, int i, int j){
        if (i >= grid.length || j >= grid[0].length || grid[i][j] == 0) return grid;
        grid[i][j] = 0;
        pot++;
        grid = parse(grid, i + 1, j);
        grid = parse(grid, i, j + 1);
        if (i > 0) grid = parse(grid, i - 1, j);
        if (j > 0) grid = parse(grid, i, j - 1);
        return grid;
    }
}
