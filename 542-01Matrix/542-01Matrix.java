// Last updated: 11/28/2025, 9:47:43 PM
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[][] dp = new int[m][n];
        int INF = 100000;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    dp[i][j] = 0;
                } else {
                    int up = i > 0 ? dp[i - 1][j] : INF;
                    int left = j > 0 ? dp[i][j - 1] : INF;
                    dp[i][j] = Math.min(up, left) + 1;
                }
            }
        }
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int down = i < m - 1 ? dp[i + 1][j] : INF;
                int right = j < n - 1 ? dp[i][j + 1] : INF;
                dp[i][j] = Math.min(dp[i][j], Math.min(down, right) + 1);
            }
        }

        return dp;
    }
}
