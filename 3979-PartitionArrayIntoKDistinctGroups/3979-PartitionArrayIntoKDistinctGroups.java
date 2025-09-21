// Last updated: 9/21/2025, 7:54:57 PM
class Solution {
    public boolean partitionArray(int[] nums, int k) {
       int n=nums.length;
       if(n%k!=0) return false;
       Arrays.sort(nums);
        int join=n/k;
        int c=1;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                c++;
                if(c>join)return false;             
            }else{
                c=1;
            }
        }
        return true;
    }
    
}