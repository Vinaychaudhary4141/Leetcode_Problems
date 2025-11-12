// Last updated: 11/12/2025, 11:35:14 AM
class Solution {
    public int smallestNumber(int n) {
        boolean con= true;
        while(con){
            boolean allSet = (n & (n + 1)) == 0;
            if(allSet) return n;
            n=n+1;
        }
    return n;
    }
}