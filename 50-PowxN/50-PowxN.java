// Last updated: 8/1/2025, 11:57:33 AM
class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        double result = 1.0;
        long absN = Math.abs((long)n);
        while (absN > 0) {
            if ((absN & 1) == 1) {
                result *= x;
            }
            x *= x;
            absN >>= 1;
        }
        return n < 0 ? 1.0 / result : result;
    }
}
