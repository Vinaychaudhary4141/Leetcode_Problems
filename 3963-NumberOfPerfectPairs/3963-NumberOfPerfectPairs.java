// Last updated: 1/16/2026, 10:12:30 PM
class Solution {
    public long perfectPairs(int[] nums) {
        int n = nums.length;
        long count = 0;

        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Math.abs((long) nums[i]);
        }

        Arrays.sort(arr);
        int l = 0;
        for (int r = 0; r < n; r++) {
            while (l < r && arr[l] * 2 < arr[r]) {
                l++;
            }
            count += (r - l);
        }
        return count;
    }
}
