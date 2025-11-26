// Last updated: 11/26/2025, 12:59:39 PM
class Solution {
    public int numSub(String s) {
        long mod = 1000000007;
        long ans = 0, count = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                count++; 
                ans = (ans + count) % mod;   
            } else {
                count = 0;                      
            }
        }
        return (int) ans;
    }
}
