// Last updated: 1/16/2026, 10:12:46 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
      for(int n:nums){
        sum+=n;
      }  
      return(sum%k);
    }
}