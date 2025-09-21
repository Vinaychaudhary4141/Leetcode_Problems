// Last updated: 9/21/2025, 7:56:34 PM
class Solution {
    public boolean isUgly(int n) {
        if(n<=0) return false;
        if(n==1) return true;
        while(n%2==0) n=n/2;
        while(n%3==0) n=n/3;
        while(n%5==0) n/=5;
        return n==1;
    }
}