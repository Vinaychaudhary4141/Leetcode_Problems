// Last updated: 9/27/2025, 5:32:25 PM
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n= nums.length-1;
        int ans1=(nums[0]*nums[1])*nums[n];
        int ans2= (nums[n]*nums[n-1])*nums[n-2];
        return Math.max(ans1, ans2);
    }
}