// Last updated: 7/19/2026, 6:53:38 PM
class Solution {
    public long sumAndMultiply(int n) {
        int x = 0;
        int sum = 0;
        String s = String.valueOf(n);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0')
                continue;
            int digit = s.charAt(i) - '0';
            x = x * 10 + digit;
            sum += digit;
        }
        return (long) sum * x;
    }
}