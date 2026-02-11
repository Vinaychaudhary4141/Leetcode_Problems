// Last updated: 2/11/2026, 12:15:40 PM
class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int[] result= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int j=i;
            if(nums[i]>0){
                j+=nums[i];
                j=j%nums.length;
                result[i]=nums[j];
            }
            else if (nums[i] < 0) {
                j = (j - Math.abs(nums[i]) % nums.length + nums.length) % nums.length;
                result[i] = nums[j];
            }
            else{
                result[i]=0;
            }
        }
        return result;
    }
}