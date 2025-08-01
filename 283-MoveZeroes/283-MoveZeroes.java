// Last updated: 8/1/2025, 11:56:31 AM
class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZeroIndex = 0; // Pointer for the last non-zero element
        
        // Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroIndex] = nums[i];
                lastNonZeroIndex++;
            }
        }
        
        // Fill the rest with zeros
        for (int i = lastNonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
