// Last updated: 8/1/2025, 11:56:36 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Edge case: empty matrix
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length; // Number of rows
        int cols = matrix[0].length; // Number of columns

        // Start at the top-right corner
        int row = 0;
        int col = cols - 1;

        // Traverse the matrix
        while (row < rows && col >= 0) {
            if (matrix[row][col] == target) {
                return true; // Found the target
            } else if (matrix[row][col] > target) {
                col--; // Move left if current value is greater than target
            } else {
                row++; // Move down if current value is less than target
            }
        }

        // If the loop ends without finding the target
        return false;
    }
}