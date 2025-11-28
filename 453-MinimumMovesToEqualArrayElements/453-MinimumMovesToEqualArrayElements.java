// Last updated: 11/28/2025, 9:47:55 PM
class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int num : nums){
            min = Math.min(min, num);
            sum += num;
        }
        return sum - min * nums.length;
    }
}
