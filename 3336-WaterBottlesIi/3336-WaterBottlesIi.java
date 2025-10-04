// Last updated: 10/4/2025, 2:18:39 PM
class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int ans = numBottles;
        int empty = numBottles;
        while (empty >= numExchange) {
            empty -= numExchange;
            ans++;
            empty++;       
            numExchange++;
        }
        return ans;
    }
}
