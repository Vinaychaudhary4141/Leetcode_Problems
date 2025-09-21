// Last updated: 9/21/2025, 7:57:25 PM
class Solution {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid= (start + (end-start)/2);
            if(target==nums[mid]) {
                return true;
            }
            else if(target<nums[mid]) end=mid-1;
            else start=mid+1;
        }  
        return false;
    }
}