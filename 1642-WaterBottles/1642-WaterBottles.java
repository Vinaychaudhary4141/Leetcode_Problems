// Last updated: 10/1/2025, 3:17:59 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int temp=numBottles;
        int ans=numBottles;
        int reused=0;
        int rem=0;
        while(temp>=numExchange){
            rem=temp%numExchange;
            reused=temp/numExchange;
            ans+=reused;
            temp=rem+reused;
        }
        return ans;        
    }
}