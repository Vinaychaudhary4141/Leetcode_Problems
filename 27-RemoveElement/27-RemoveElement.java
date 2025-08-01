// Last updated: 8/1/2025, 11:57:53 AM
public class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Pointer for the position of the next non-val element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
