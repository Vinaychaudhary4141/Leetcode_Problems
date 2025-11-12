// Last updated: 11/12/2025, 11:35:42 AM
class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            int rem = ((num % value) + value) % value; // handle negatives
            freq.put(rem, freq.getOrDefault(rem, 0) + 1);
        }
        int mex = 0;
        while (true) {
            int rem = mex % value;
            if (freq.getOrDefault(rem, 0) == 0) break;
            freq.put(rem, freq.get(rem) - 1);
            mex++;
        }
        return mex;
    }
}
