// Last updated: 10/11/2025, 11:02:29 PM
class Solution {
    public long minCost(int[] nums, int[] cost) {
        int n = nums.length;
        long[][] arr = new long[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = cost[i];
        }
        Arrays.sort(arr, (a, b) -> Long.compare(a[0], b[0]));
        long totalCostWeight = 0;
        for (int i = 0; i < n; i++) totalCostWeight += arr[i][1];

        long prefix = 0;
        long median = 0;
        for (int i = 0; i < n; i++) {
            prefix += arr[i][1];
            if (prefix * 2 >= totalCostWeight) {
                median = arr[i][0];
                break;
            }
        }
        long result = 0;
        for (int i = 0; i < n; i++) {
            result += Math.abs(arr[i][0] - median) * arr[i][1];
        }

        return result;
    }
}
