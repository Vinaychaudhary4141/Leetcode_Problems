// Last updated: 8/1/2025, 11:56:58 AM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0, balance = 0, start = 0;

        for (int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];
            total += diff;
            balance += diff;
            if (balance < 0) {
                start = i + 1;
                balance = 0;
            }
        }

        return (total >= 0) ? start : -1;
    }
}
