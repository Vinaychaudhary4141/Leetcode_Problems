// Last updated: 8/1/2025, 11:56:33 AM
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        
        // Expected sum of numbers from 0 to n
        int expectedSum = n * (n + 1) / 2;
        
        // Actual sum of numbers in the array
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        
        // Missing number is the difference between the expected and actual sum
        return expectedSum - actualSum;
    }
}
