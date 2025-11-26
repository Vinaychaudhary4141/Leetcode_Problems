// Last updated: 11/26/2025, 12:59:10 PM
class Solution {
    static final int MOD = 1000000007;

    public int numberOfPaths(int[][] grid, int k) {
        int n = grid.length, m = grid[0].length;
        Integer[][][] dp = new Integer[n][m][k];
        return solve(0, 0, 0, grid, k, dp);
    }

    private int solve(int i, int j, int rem, int[][] grid, int k, Integer[][][] dp) {
        int n = grid.length, m = grid[0].length;

        if (i >= n || j >= m) return 0;

        rem = (rem + grid[i][j]) % k;

        if (i == n - 1 && j == m - 1)
            return rem == 0 ? 1 : 0;

        if (dp[i][j][rem] != null) return dp[i][j][rem];

        long right = solve(i, j + 1, rem, grid, k, dp);
        long down = solve(i + 1, j, rem, grid, k, dp);

        return dp[i][j][rem] = (int)((right + down) % MOD);
    }
}
