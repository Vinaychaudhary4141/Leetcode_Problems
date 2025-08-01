// Last updated: 8/1/2025, 11:57:59 AM
import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // Sort the array
        int closestSum = nums[0] + nums[1] + nums[2]; // Initialize the closest sum

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                // Update closest sum if the current sum is closer to the target
                if (Math.abs(target - currentSum) < Math.abs(target - closestSum)) {
                    closestSum = currentSum;
                }

                // Move pointers based on the comparison with the target
                if (currentSum < target) {
                    left++;
                } else if (currentSum > target) {
                    right--;
                } else {
                    // If currentSum is exactly the target, return immediately
                    return currentSum;
                }
            }
        }
        return closestSum;
    }
}
