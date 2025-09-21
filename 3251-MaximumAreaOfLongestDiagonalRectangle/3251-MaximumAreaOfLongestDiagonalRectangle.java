// Last updated: 9/21/2025, 7:55:26 PM
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double diagonal=0;
        int index=0;
        for(int i=0;i<dimensions.length;i++){
            double result = Math.sqrt( (dimensions[i][0]* dimensions[i][0])+dimensions[i][1]*dimensions[i][1]);
            if(diagonal==result){
               if(dimensions[index][0]*dimensions[index][1]<dimensions[i][0]*dimensions[i][1]) index=i;

            }
            else{
                diagonal=Math.max(diagonal,result);
                if(diagonal==result){
                index=i;
                }
            }
        }
        return (dimensions[index][0]*dimensions[index][1]);
    }
}