// Last updated: 10/1/2025, 3:18:19 PM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int max=sum;
        int j=0;
        for(int i=k;i<nums.length;i++){
            sum-=nums[j];
            sum+=nums[i];
            max=Math.max(sum,max);
            j++;
        }
        return (double) max/k;
    }
}