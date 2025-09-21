// Last updated: 9/21/2025, 7:56:24 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<2){
            return true;
        }
        long start=2;
        long end=num/2;
        
        while(start<=end){
            long mid=start +(end-start)/2;
            if(mid*mid==num){
                return true;
            }else if(mid*mid<num){
                start=mid+1;
                
            }else{
                end=mid-1;
                 
            }
        }
        return false;
    }
}