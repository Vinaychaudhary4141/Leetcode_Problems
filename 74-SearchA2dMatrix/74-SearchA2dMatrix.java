// Last updated: 8/1/2025, 11:57:17 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Iterate over each row in the matrix
        for (int i = 0; i < matrix.length; i++) {
            // Iterate over each element in the current row
            for (int j = 0; j < matrix[0].length; j++) {
                // If the current element matches the target
                if (matrix[i][j] == target) {
                    return true; // Target found, return true
                }
            }
        }
        return false; // Target not found in the matrix, return false
    }
}
