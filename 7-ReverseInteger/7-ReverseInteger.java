// Last updated: 9/21/2025, 7:58:37 PM
class Solution {
    public int reverse(int x) {
        long ans = 0; // use long to detect overflow
        int temp = Math.abs(x);

        while (temp > 0) {
            int digit = temp % 10;
            ans = ans * 10 + digit;
            temp /= 10;
        }

        if (x < 0) ans = -ans;

        // Check overflow
        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) ans;
    }
}
