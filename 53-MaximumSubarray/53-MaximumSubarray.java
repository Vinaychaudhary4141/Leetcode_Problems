// Last updated: 8/1/2025, 11:57:30 AM
class Solution {
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        
        int sum = 0;
        for(int j = 0; j<nums.length; j++){
            sum+=nums[j];
            ans = Math.max(sum, ans);
            if(sum<0){
                sum =0;
            }
        }
         
         return ans;
    }
}