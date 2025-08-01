// Last updated: 8/1/2025, 11:56:21 AM
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;

        // Loop over each possible starting point of the subarray
        for (int start = 0; start < nums.length; start++) {
            int sum = 0;

            // Add elements to the subarray, starting from 'start'
            for (int end = start; end < nums.length; end++) {
                sum += nums[end];  // Calculate the sum of the subarray [start...end]
                
                // If the sum equals k, increment the count
                if (sum == k) {
                    count++;
                }
            }
        }

        return count;  // Return the total count of subarrays whose sum equals k
    }
}
