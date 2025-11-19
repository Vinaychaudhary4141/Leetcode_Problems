// Last updated: 11/19/2025, 3:36:05 PM
class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
       Arrays.sort(nums);
        int c= nums[0];
        int a=nums[nums.length-2];
        int b=nums[nums.length-1];
        return((a+b)-c);
    }
}