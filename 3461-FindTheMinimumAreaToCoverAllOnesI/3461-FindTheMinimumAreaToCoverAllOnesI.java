// Last updated: 9/21/2025, 7:55:18 PM
class Solution {
    public int minimumArea(int[][] grid) {
       int row_l=grid.length;
       int col_l=grid[0].length ;
       int min_row=row_l;
       int max_row=-1;
       int min_col=col_l;
       int max_col=-1;
       for(int i=0;i<row_l;i++){
        for(int j=0;j<col_l;j++){
            if(grid[i][j]==1){
                min_row=Math.min(min_row,i);
                max_row=Math.max(max_row,i);
                min_col=Math.min(min_col,j);
                max_col=Math.max(max_col,j);
            }
        }
       }
        int l=max_row - min_row +1;
        int b=max_col - min_col +1;
      return l*b; 
    }
}