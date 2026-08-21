class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int fresh = 0;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (grid[i][j] == 2) queue.offer(new int[]{i, j});
                else if (grid[i][j] == 1) fresh++;
            }
        }
        int count = 0;
        int[][] dirs = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        while (!queue.isEmpty() && fresh > 0){
            int size = queue.size();
            for (int k = 0; k < size; k++){
                int[] curr = queue.poll();
                int i = curr[0];
                int j = curr[1];
                for (int[] dir : dirs){
                    int r = dir[0] + i;
                    int c = dir[1] + j;
                    if (r < 0 || r >= m || c < 0 || c >= n || grid[r][c] != 1) continue;
                    grid[r][c] = 2;
                    queue.offer(new int[]{r, c});
                    fresh--;
            }}
            count++;
        }
        if(fresh > 0) return -1;
        return count;
    }
}
