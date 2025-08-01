// Last updated: 8/1/2025, 11:56:08 AM
class Solution {
    public int missingInteger(int[] nums) {
        int count=nums[0];
        int index=0;
       for(int i =1;i<nums.length;i++){
        if(nums[i]==nums[i-1]+1){
            count+=nums[i];
            index=i;
        }else{
            break;
        }
       }
        Arrays.sort(nums);
        int next = count;
        while (true) {
            boolean found = false;
            for (int num : nums) {
                if (num == next) {
                    found = true;
                    break;
                }
            }
            if (!found) return next;
            next++;
        }
       
    }
}