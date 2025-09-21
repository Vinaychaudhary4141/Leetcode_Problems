// Last updated: 9/21/2025, 7:56:19 PM
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) return new int[0];
        
        int m = mat.length, n = mat[0].length;
        int[] result = new int[m * n];
        int row = 0, col = 0;
        int dir = 1; // 1 means moving up-right, -1 means moving down-left
        int idx = 0;
        
        while (idx < m * n) {
            result[idx++] = mat[row][col];
            
            // Moving up-right
            if (dir == 1) {
                if (col == n - 1) { // hit last column
                    row++;
                    dir = -1;
                } else if (row == 0) { // hit first row
                    col++;
                    dir = -1;
                } else {
                    row--;
                    col++;
                }
            }
            // Moving down-left
            else {
                if (row == m - 1) { // hit last row
                    col++;
                    dir = 1;
                } else if (col == 0) { // hit first column
                    row++;
                    dir = 1;
                } else {
                    row++;
                    col--;
                }
            }
        }
        
        return result;
    }
}
