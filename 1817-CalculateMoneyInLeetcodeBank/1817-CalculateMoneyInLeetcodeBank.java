// Last updated: 11/26/2025, 12:59:31 PM
class Solution {
    public int totalMoney(int n) {
        int ans = 0;
        int monday = 1;
        
        while (n > 0) {
            for (int day = 0; day < Math.min(n, 7); day++) {
                ans += monday + day;
            }
            
            n -= 7;
            monday++;
        }
        
        return ans;
    }
}