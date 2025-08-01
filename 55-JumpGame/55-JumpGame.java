// Last updated: 8/1/2025, 11:57:27 AM
public class Solution {
    public boolean canJump(int[] nums) {
        int farthest = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (i > farthest) {
                return false; // Can't reach this index
            }
            farthest = Math.max(farthest, i + nums[i]);
            if (farthest >= nums.length - 1) {
                return true; // Can reach the last index
            }
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums1 = {2, 3, 1, 1, 4};
        System.out.println(solution.canJump(nums1)); // Output: true

        int[] nums2 = {3, 2, 1, 0, 4};
        System.out.println(solution.canJump(nums2)); // Output: false
    }
}
