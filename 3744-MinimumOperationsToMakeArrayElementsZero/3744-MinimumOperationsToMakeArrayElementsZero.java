// Last updated: 9/21/2025, 7:55:06 PM
class Solution {
    //gpt
    public long minOperations(int[][] queries) {
        long total = 0;
        for (int[] q : queries) {
            int l = q[0], r = q[1];
            long steps = getSteps(r) - getSteps(l - 1);
            total += (steps + 1) / 2;
        }
        return total;
    }

    private long getSteps(long x) {
        if (x <= 0) return 0;
        long steps = 0;
        long power = 1, k = 1;
        while (power <= x) {
            long next = power * 4 - 1;
            long high = Math.min(x, next);
            steps += (high - power + 1) * k;
            power *= 4;
            k++;
        }
        return steps;
    }
}
