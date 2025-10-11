// Last updated: 10/11/2025, 11:02:36 PM
class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
       int n=rocks.length;
       int [] diff= new int[n];
       for(int i=0;i<n;i++){
        diff[i]=capacity[i]-rocks[i];
       }
       Arrays.sort(diff);
       int c=0;
       for(int i=0;i<n;i++){
        if(additionalRocks<diff[i]) return c;
        if(diff[i]==0) c++;
        else{
            additionalRocks-=diff[i];
            c++;
        }
       }
       return c;
    }
}