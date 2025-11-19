// Last updated: 11/19/2025, 3:36:06 PM
class Solution {
    public int minLengthAfterRemovals(String s) {
        int  a=0,b=0;
        for(char c:s.toCharArray()){
            if(c=='a')a++;
            else b++;
        }
        return Math.abs(a-b);
    }
}