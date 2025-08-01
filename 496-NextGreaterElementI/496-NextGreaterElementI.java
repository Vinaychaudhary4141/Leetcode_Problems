// Last updated: 8/1/2025, 11:56:25 AM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int val = nums1[i];
            int index = -1;

            
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == val) {
                    index = j;
                    break;
                }
            }

            
            int nextGreater = -1;
            for (int k = index + 1; k < nums2.length; k++) {
                if (nums2[k] > val) {
                    nextGreater = nums2[k];
                    break;
                }
            }

            
            ans[i] = nextGreater;
        }

        return ans;
    }
}
