// Last updated: 8/1/2025, 11:57:42 AM
public class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        
        // Step 1: Mark numbers outside the range [1, n] by setting them to n + 1
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = n + 1;
            }
        }

        // Step 2: Mark presence of numbers in the range [1, n]
        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            if (num <= n) {
                nums[num - 1] = -Math.abs(nums[num - 1]);
            }
        }

        // Step 3: Find the first index with a positive number
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }

        // If all positions from 1 to n are filled, the missing number is n + 1
        return n + 1;
    }
}
