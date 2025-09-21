// Last updated: 9/21/2025, 7:56:55 PM
class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return Robber(nums, 0, dp);
    }

    public static int Robber(int[] nums, int i, int[] dp) {
        if (i >= nums.length) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        int rob = nums[i] + Robber(nums, i + 2, dp);
        int dontRob = Robber(nums, i + 1, dp);
        return dp[i] = Math.max(rob, dontRob);
    }
}