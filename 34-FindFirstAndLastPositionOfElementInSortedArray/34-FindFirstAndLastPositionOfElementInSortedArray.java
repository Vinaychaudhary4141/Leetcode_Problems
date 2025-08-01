// Last updated: 8/1/2025, 11:57:51 AM
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        
        // Find the first occurrence of target
        result[0] = findBound(nums, target, true);
        
        // If target is not found, no need to search for the last occurrence
        if (result[0] == -1) {
            return result;
        }
        
        // Find the last occurrence of target
        result[1] = findBound(nums, target, false);
        
        return result;
    }
    
    private int findBound(int[] nums, int target, boolean isFirst) {
        int left = 0, right = nums.length - 1;
        int bound = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                bound = mid;
                // Search left half for the first occurrence
                if (isFirst) {
                    right = mid - 1;
                } else {
                    // Search right half for the last occurrence
                    left = mid + 1;
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return bound;
    }
}
