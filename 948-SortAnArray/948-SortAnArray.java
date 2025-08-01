// Last updated: 8/1/2025, 11:56:16 AM
class Solution {
    public int[] sortArray(int[] nums) {
        if (nums.length <= 1) {
            return nums;  // Base case: if the array has 1 or 0 elements, it's already sorted.
        }
        
        // Step 1: Divide the array into two halves
        int mid = nums.length / 2;
        int[] left = new int[mid];
        int[] right = new int[nums.length - mid];
        
        System.arraycopy(nums, 0, left, 0, mid);   // Copy the left half
        System.arraycopy(nums, mid, right, 0, nums.length - mid);  // Copy the right half
        
        // Step 2: Recursively sort both halves
        left = sortArray(left);
        right = sortArray(right);
        
        // Step 3: Merge the sorted halves
        return merge(left, right);
    }
    
    // Helper function to merge two sorted arrays
    private int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        
        // Merge the two arrays by comparing their elements
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        
        // Copy remaining elements, if any
        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }
        
        return result;
    }
}
