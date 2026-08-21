class Solution {
    //int grid[][];
    public void islandsAndTreasure(int[][] grid) {
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == 0){ 
                    grid = parse(grid, i, j, -1);
                }
            }
        }
    }

    public int[][] parse(int[][] grid, int i, int j, int far){
        if (i >= grid.length || j >= grid[0].length || grid[i][j] == -1 || far >= grid[i][j]) return grid;
        if (grid[i][j] == 0){
            grid = parse(grid, i, j + 1, far + 2);
            grid = parse(grid, i + 1, j, far + 2);
            if (i > 0) grid = parse(grid, i - 1, j, far + 2);
            if (j > 0) grid = parse(grid, i, j - 1, far + 2);
            return grid;
        }
        grid[i][j] = Math.min(grid[i][j], far);
        grid = parse(grid, i, j + 1, far + 1);
        grid = parse(grid, i + 1, j, far + 1);
        if (i > 0) grid = parse(grid, i - 1, j, far + 1);
        if (j > 0) grid = parse(grid, i, j - 1, far + 1);
        return grid;
    }
}
