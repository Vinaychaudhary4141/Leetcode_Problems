// Last updated: 11/28/2025, 9:47:53 PM
class Solution {
    public int findContentChildren(int[] g, int[] s) {
       Arrays.sort(g); 
       Arrays.sort(s); 
       int child = 0, cookie = 0;
        while (child < g.length && cookie < s.length) {
            if (s[cookie] >= g[child]) child++;
            cookie++;
        }
       return child;
    }
}