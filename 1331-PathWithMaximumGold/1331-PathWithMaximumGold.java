// Last updated: 11/26/2025, 12:59:50 PM
class Solution {
    int maxGold = 0;
    public int getMaximumGold(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] > 0) {
                    dfs(grid, i, j, 0);
                }
            }
        }
        return maxGold;
    }
    private void dfs(int[][] grid, int i, int j, int current) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) return;    
        int gold = grid[i][j];
        current += gold;
        maxGold = Math.max(maxGold, current);   
        grid[i][j] = 0; // mark as visited    
        dfs(grid, i+1, j, current);
        dfs(grid, i-1, j, current);
        dfs(grid, i, j+1, current);
        dfs(grid, i, j-1, current);    
        grid[i][j] = gold; // backtrack
    }
}
