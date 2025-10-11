// Last updated: 10/11/2025, 11:02:41 PM
class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long low = 1, high = (long) getMin(time) * totalTrips, ans = high;
        while (low <= high) {
            long mid = low + (high - low) / 2, trips = 0;
            for (int t : time) trips += mid / t;
            if (trips >= totalTrips) {
                ans = mid;
                high = mid - 1;
            } else low = mid + 1;
        }
        return ans;
    }
    private int getMin(int[] time) {
        int min = time[0];
        for (int t : time) if (t < min) min = t;
        return min;
    }
}
