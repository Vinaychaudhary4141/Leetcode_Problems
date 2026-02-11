// Last updated: 2/11/2026, 12:15:46 PM
class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int x = nums.get(i);

            if ((x & 1) == 0) {
                ans[i] = -1;
                continue;
            }

            int cnt = 0;
            int t = x;
            while ((t & 1) == 1) {
                cnt++;
                t >>= 1;
            }

            ans[i] = x - (1 << (cnt - 1));
        }

        return ans;
    }
}
