// Last updated: 9/21/2025, 7:54:50 PM
class Solution {
    public int findClosest(int x, int y, int z) {
        int disxz= Math.abs(x-z);
        int disyz=Math.abs(y-z);
        if(disxz<disyz) return 1;
        else if(disxz>disyz) return 2;
        else return 0;
        
    }
}