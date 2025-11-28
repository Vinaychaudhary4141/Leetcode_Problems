// Last updated: 11/28/2025, 9:47:35 PM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0; 
        int pro = 1;
        int c = 0;
        int j = 0; 
        for (int i = 0; i < nums.length; i++) {
            pro *= nums[i];
            while (pro >= k ) {
                pro /= nums[j];
                j++;
            }
            c += i - j + 1;
        }
        return c;
    }
}
