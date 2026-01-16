// Last updated: 1/16/2026, 10:13:31 PM
class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        if(s1.charAt(0)!=s2.charAt(0) || s2.charAt(0)!=s3.charAt(0)) return -1;
        int i=1;
        while(i<s1.length() && i<s2.length() && i<s3.length() && s1.charAt(i)==s2.charAt(i) && s2.charAt(i)==s3.charAt(i)){
            i++;
        }
        int ans=0;
        ans+=s2.length()-i;
        ans+=s1.length()-i;
        ans+=s3.length()-i;
        return ans;
    }
}