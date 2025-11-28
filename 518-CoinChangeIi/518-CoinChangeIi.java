// Last updated: 11/28/2025, 9:47:47 PM
class Solution {
    public int change(int amount, int[] coins) {
        int[][]dp=  new int[amount+1][coins.length];
        for(int[]a:dp){
            Arrays.fill(a,-1);
        }
        return ways(amount, coins,dp,0);

    }
    public static int ways(int amount,int[]coins, int[][]dp,int i){
        if(amount==0) return 1;
        if(i==coins.length) return 0;
        if(dp[amount][i]!=-1) return dp[amount][i];
        int inc=0,exc=0;
        if(coins[i]<=amount){
            inc=ways(amount-coins[i],coins,dp,i);
        }
        exc=ways(amount,coins,dp,i+1);
        return dp[amount][i]=inc+exc;
    }
}