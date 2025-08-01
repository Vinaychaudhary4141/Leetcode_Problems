// Last updated: 8/1/2025, 11:58:06 AM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j }; // Found the solution, return indices
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution"); // Throw exception if no solution is found
    }
}
