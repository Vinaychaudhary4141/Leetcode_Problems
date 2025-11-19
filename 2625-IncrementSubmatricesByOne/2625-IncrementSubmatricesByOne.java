// Last updated: 11/19/2025, 3:36:43 PM
class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][]mat= new int[n][n];
        for(int[]q:queries){
            for(int i=q[0];i<=q[2];i++){
                for(int j=q[1];j<=q[3];j++){
                    mat[i][j]+=1;
                }
            }
        }
        return mat;
    }
}