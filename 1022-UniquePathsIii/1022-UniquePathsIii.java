// Last updated: 11/28/2025, 9:47:20 PM
class Solution {
    int count = 0;
    int empty = 1;
    public int uniquePathsIII(int[][] grid) {
        int startX = 0, startY = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) empty++;
                else if (grid[i][j] == 1) {
                    startX = i;
                    startY = j;
                }
            }
        }
        solve(grid, startX, startY, empty);
        return count;
    }

    private void solve(int[][] grid, int i, int j, int remain) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == -1)
            return;
        if (grid[i][j] == 2) {
            if (remain == 0) count++;
            return;
        }
        int temp = grid[i][j];
        grid[i][j] = -1; 
        solve(grid, i + 1, j, remain - 1);
        solve(grid, i - 1, j, remain - 1);
        solve(grid, i, j + 1, remain - 1);
        solve(grid, i, j - 1, remain - 1);
        grid[i][j] = temp;
    }
}
