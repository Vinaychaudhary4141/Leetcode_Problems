// Last updated: 10/1/2025, 3:18:43 PM
class Solution {
    public int findKthLargest(int[] nums, int k) {
       int n=nums.length;
       Arrays.sort(nums);
       return(nums[n-k]); 
    }
}