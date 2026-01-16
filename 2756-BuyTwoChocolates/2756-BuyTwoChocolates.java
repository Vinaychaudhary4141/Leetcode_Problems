// Last updated: 1/16/2026, 10:13:35 PM
class Solution {
    public int buyChoco(int[] prices, int money) {
       Arrays.sort(prices);
       int sum= prices[0]+prices[1];
       if(money-sum<0 && sum>money) return money;
       else return money-sum;
    }
}