// Last updated: 11/12/2025, 11:35:18 AM
class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 0, prev = (int)-1e9;

        for (int x : nums) {
            int l = Math.max(x - k, prev + 1);
            if (l <= x + k) {
                prev = l;
                ans++;
            }
        }
        return ans;
    }
}