// Last updated: 1/16/2026, 10:13:36 PM
class Solution {
    public long maxStrength(int[] nums) {
        int n = nums.length;
        long ans = Long.MIN_VALUE;
        for (int mask = 1; mask < (1 << n); mask++) {
            long prod = 1;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    prod *= nums[i];
                }
            }
            ans = Math.max(ans, prod);
        }
        return ans;
    }
}
