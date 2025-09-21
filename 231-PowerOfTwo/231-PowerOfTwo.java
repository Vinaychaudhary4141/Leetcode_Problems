// Last updated: 9/21/2025, 7:56:44 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
     if(n==1) return true;
     if(n==0) return false;
     if(n%2!=0) return false;
     return isPowerOfTwo(n/2);
    }
}