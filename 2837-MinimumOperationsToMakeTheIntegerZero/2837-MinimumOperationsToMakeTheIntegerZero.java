// Last updated: 9/21/2025, 7:55:30 PM
class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        for (int k = 1; k <= 60; k++) {
            long s = (long) num1 - (long) k * num2;
            if (s < 0) break; 
            
            int bits = Long.bitCount(s);
            if (bits <= k && k <= s) {
                return k;
            }
        }
        return -1;
    }
}
