// Last updated: 10/1/2025, 3:18:00 PM
class Solution {
    public int countNegatives(int[][] grid) {
      int m=grid.length;
      int n =grid[0].length;
      int sum=0;
      for(int i=m-1;i>=0;i--){
      int j=0;
        while(j<n){
            if(grid[i][j]<0){
                 sum+=n-j;
                 break;
            }else{
                 j++;
             }
        }  
      }
      return sum;
    }
}