// Last updated: 10/11/2025, 11:02:48 PM
class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] arr= new int[code.length];
        if(k==0){
            for(int i=0;i<code.length;i++){
                code[i]=0;
            }
            return code;
        }
        if(k<0){
            for(int i=0;i<code.length;i++){
                int temp=-k;
                int sum=0;
                int var=1;
                while(temp>0){
                    sum+=code[(Math.abs(code.length+i-var))%code.length];
                    var++;
                    temp--;
                }
                arr[i]=sum;
            }
        }
        if(k>0){
            for(int i=0;i<code.length;i++){
                int temp=k;
                int sum=0;
                int var=i+1;
                while(temp>0){
                    sum+=code[var%code.length];
                    var++;
                    temp--;
                }
                arr[i]=sum;
            }
        }
        return arr;
    }
}