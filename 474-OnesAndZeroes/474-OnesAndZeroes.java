// Last updated: 11/28/2025, 9:47:52 PM
class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for (String s : strs) {
            int temp0 = 0;
            int temp1 = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') temp0++;
                else temp1++;
            }
            for (int i = m; i >= temp0; i--) {
                for (int j = n; j >= temp1; j--) {
                    dp[i][j] = Math.max(dp[i][j], 1 + dp[i-temp0][j-temp1]);
                }
            }
        }
        return dp[m][n];
    }
}
