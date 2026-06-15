class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top = 0, bottom = matrix.length;
        while (top < bottom){
            int mid_col = top + (bottom - top) / 2;
            if (matrix[mid_col][matrix[bottom - 1].length - 1] < target) top = mid_col + 1;
            else bottom = mid_col;
        }
        int l = 0, r = matrix[0].length;
        if (top >= matrix.length) return false;
        while (l < r){
            int m = l + (r - l) / 2;
            if (matrix[top][m] < target) l = m + 1;
            else r = m;
        }

        return (matrix[top][l] == target);
    }
}
