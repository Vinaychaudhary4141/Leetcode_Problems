// Last updated: 10/11/2025, 11:02:35 PM
class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int subsequences = 0;
        int i = 0;
        int n = nums.length;
        while (i < n) {
            int start = nums[i];
            subsequences++;
            while (i < n && nums[i] - start <= k) {
                i++;
            }
        }
        return subsequences;
    }
}
