class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        /*
        Spiral cycle goes from
        top -> right -> bottom -> left, then repeats the same cycle again

        Each layer
        top + 1
        right - 1
        bottom - 1
        left + 1

        
        Spiral cycle keeps looping when top <= bottom or left <= right
        1st loop (top row) -> all columns from left to right, increase top by 1
        2nd loop (right row) -> all rows from top to bottom, decrease right by 1

        3rd loop (bottom row) -> Only runs when bottom >= top, all columns from right to left, decrease bottom by - 1
        4th loop (left row) -> Only runs when left <= right, all rows from bottom to top, increase left by 1

        matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]
        rows = cols = 3

        top = left = 0, bottom = right = 2

        1st layer: 
        1st loop (top row) -> [1,2,3], top = 1
        2nd loop (right row) -> add 6,9 (top = 1, bottom = 2); [1,2,3,6,9], right = 1
        3rd loop (bottom row) -> add 8,7 (right = 1, left = 0)...

        Time complexity: O(n * m)
        Space complexity: O(1)
        */
        final int rows = matrix.length, cols = matrix[0].length;
        int top = 0, left = 0, bottom = rows - 1, right = cols - 1;

        List<Integer> res = new ArrayList<>();
        while (top <= bottom && left <= right) {
            // First loop (top)
            for (int c = left; c <= right; c++) {
                res.add(matrix[top][c]);
            }
            ++top;
            
            // 2nd loop (right)
            for (int r = top; r <= bottom; r++) {
                res.add(matrix[r][right]);
            }
            --right;

            if (top > bottom || left > right) {
                break;
            }
            // 3rd loop (bottom)
            for (int c = right; c >= left; c--) {
                res.add(matrix[bottom][c]);
            }
            --bottom;

            // 4th loop (left)
            for (int r = bottom; r >= top; r--) {
                res.add(matrix[r][left]);
            }
            ++left;
        }
        return res;
    }
}
