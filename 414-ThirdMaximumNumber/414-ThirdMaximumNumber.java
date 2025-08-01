// Last updated: 8/1/2025, 11:56:26 AM
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int temp=nums[nums.length-1];
        int count=1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<temp){
                temp=nums[i];
                count++;
            }
            if(count==3){
                return temp;
            }
           
        }
         return(nums[nums.length-1]);
    }
}