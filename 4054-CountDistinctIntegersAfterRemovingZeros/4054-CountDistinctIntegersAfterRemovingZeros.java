// Last updated: 11/19/2025, 3:36:03 PM
class Solution {
    public long countDistinct(long n) {
        String s=Long.toString(n);
        int len=s.length();
        long[] pow= new long[len+1];
        pow[0]=1L;
        for(int i=1;i<=len;i++){
            pow[i]=pow[i-1]*9L;
        }
        long res=0L;
        for(int j=1;j<len;j++){
            res+=pow[j];
        }
        for(int i=0;i<len;i++){
            int d=s.charAt(i)-'0';
            if(d==0){
                return res;
            }
            res+=(long)(d-1)*pow[len-i-1];
        }
        return res+1L;
    }
}