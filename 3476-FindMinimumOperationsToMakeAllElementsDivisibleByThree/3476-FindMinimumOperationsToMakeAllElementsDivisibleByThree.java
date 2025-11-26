// Last updated: 11/26/2025, 12:58:30 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int ans=0;
        for(int a:nums){
            if(a%3!=0) ans++;
        }
        return ans;
    }
}