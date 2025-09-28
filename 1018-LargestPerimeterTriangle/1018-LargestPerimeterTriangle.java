// Last updated: 9/28/2025, 11:04:23 AM
class Solution {
    public int largestPerimeter(int[] nums) {
       Arrays.sort(nums);
       int n=nums.length;
       int peri=0;
       for(int k=n-1;k>=2;k--){
          int i=0;
           int j=k-1;
            while(i<j){
                 if(nums[i]+nums[j]>nums[k]){
                      peri=Math.max(peri,nums[i]+nums[j]+nums[k]);
                      i++;
                 }else{
                    i++;
                }
            }
       }
       return (peri==0)?0:peri;
    }
}