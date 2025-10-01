// Last updated: 10/1/2025, 3:17:57 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int sum=0;
        int j=n-1;
        for(int i=0;i<n;i++){
            sum+=mat[i][j];
            sum+=mat[i][i];
            j--;
        }
        if(n%2==0){
            return sum;
        }
        else{
            int k=n/2;
            sum=sum-mat[k][k];
        }
        return sum;
    }
}