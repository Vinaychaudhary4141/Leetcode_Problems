// Last updated: 8/1/2025, 11:56:50 AM
class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // If mid element is greater than right element, minimum is in the right half
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } 
            // Otherwise, minimum is in the left half including mid
            else {
                right = mid;
            }
        }
        
        // When left == right, we have the smallest element
        return nums[left];
    }
}
