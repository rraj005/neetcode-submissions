class Solution {
    public void islandsAndTreasure(int[][] grid) {
        if (grid == null || grid.length == 0) return;
        
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        
        // Step 1: Find all treasure chests and add them to the queue
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                }
            }
        }
        
        // Define the 4 directions (down, up, right, left)
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        
        // Step 2: BFS radiating outward from all chests simultaneously
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];
            
            // Check all 4 adjacent cells
            for (int[] dir : directions) {
                int r = row + dir[0];
                int c = col + dir[1];
                
                // If out of bounds, or not an empty land cell (INF), skip it.
                // We only process cells that currently hold Integer.MAX_VALUE
                if (r < 0 || r >= m || c < 0 || c >= n || grid[r][c] != 2147483647) {
                    continue;
                }
                
                // The distance is the distance of the current cell + 1
                grid[r][c] = grid[row][col] + 1;
                
                // Add the newly updated cell to the queue to explore its neighbors later
                queue.offer(new int[]{r, c});
            }
        }
    }
}