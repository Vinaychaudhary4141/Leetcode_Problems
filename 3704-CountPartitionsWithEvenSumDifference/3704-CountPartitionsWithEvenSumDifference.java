// Last updated: 1/16/2026, 10:13:01 PM
class Solution {
    public int countPartitions(int[] nums) {
        int sum=0;
        for(int n:nums){
            sum+=n;
        }
        int right_sum=0;
        int left_sum=sum;
        int ans=0;
        for(int i=0;i<=nums.length-2;i++){
            int diff;
            right_sum+=nums[i];
            left_sum-=nums[i];
            diff=Math.abs(right_sum-left_sum);
            if(diff%2==0) ans++;
        }
        return ans;
    }
}