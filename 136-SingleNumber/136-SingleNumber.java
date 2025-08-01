// Last updated: 8/1/2025, 11:56:57 AM
class Solution {
    public int singleNumber(int[] nums) {
        // XOR approach: XORing all elements will cancel out the ones that appear twice.
        int result = 0;
        
        // Loop through the array
        for (int num : nums) {
            result ^= num;  // XOR operation
        }
        
        return result;  // The single number will remain
    }
}
