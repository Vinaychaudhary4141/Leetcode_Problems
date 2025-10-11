// Last updated: 10/11/2025, 11:02:20 PM
class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length;
        int[] dp = new int[n];
        int max = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            dp[i] = energy[i];
            if (i + k < n) dp[i] += dp[i + k];
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
