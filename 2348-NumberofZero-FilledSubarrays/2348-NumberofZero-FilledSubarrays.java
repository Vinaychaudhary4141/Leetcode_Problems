// Last updated: 8/19/2025, 8:38:02 PM
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0; //ye output m show krenge.
        long streak = 0;//ye streak check krega , kitne 0's ki streak bn gyi.
        
        for (int num : nums) {
            if (num == 0) {
                streak++;
                count += streak; 
            } else {
                streak = 0; 
            }
        }
        
        return count;
    }
}
