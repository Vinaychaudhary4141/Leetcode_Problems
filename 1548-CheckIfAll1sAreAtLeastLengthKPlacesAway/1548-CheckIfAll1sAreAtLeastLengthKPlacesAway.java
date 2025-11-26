// Last updated: 11/26/2025, 12:59:41 PM
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                if(ans>=0 && (Math.abs(i-ans-1))<k){
                    return false;
                }
                ans=i;
            }
        }
        return true;
    }
}