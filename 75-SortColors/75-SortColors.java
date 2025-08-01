// Last updated: 8/1/2025, 11:57:16 AM
public class Solution {
    public void sortColors(int[] nums) {
        int zeroIndex = 0, oneIndex = 0, twoIndex = nums.length - 1;

        while (oneIndex <= twoIndex) {
            if (nums[oneIndex] == 0) {
                swap(nums, zeroIndex++, oneIndex++);
            } else if (nums[oneIndex] == 1) {
                oneIndex++;
            } else {
                swap(nums, oneIndex, twoIndex--);
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
