// Last updated: 8/1/2025, 11:57:01 AM
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int len=1;
        int curr=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]==nums[i-1]+1){
                curr++;
            }else{
                curr=1;
            }
            len=Math.max(len,curr);
        }
        return len;
    }
}