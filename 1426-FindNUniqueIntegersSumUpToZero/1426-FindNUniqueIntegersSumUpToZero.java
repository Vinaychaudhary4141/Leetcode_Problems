// Last updated: 9/21/2025, 7:55:54 PM
class Solution {
    public int[] sumZero(int n) {
        int[] ans= new int[n];
        if(n%2!=0){
            ans[0]=0;
            int i=1;
            while(i<n-1){
                int j=i;
                ans[j]=(-i);
                ans[j+1]=i;
                i+=2;
            }
        } 
        if(n%2==0){
            int i=1;
            while(i<n){
                int j=i;
                ans[j-1]=i;
                ans[j]=(-i);
                i+=2;
            }
        }
        return ans;
    }
}