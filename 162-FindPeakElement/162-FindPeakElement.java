// Last updated: 8/1/2025, 11:56:47 AM
class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is smaller than the next element, move to the right half
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } 
            // Otherwise, move to the left half
            else {
                right = mid;
            }
        }

        // Left will point to the peak element
        return left;
    }
}
