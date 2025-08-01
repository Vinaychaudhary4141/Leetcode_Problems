// Last updated: 8/1/2025, 11:57:26 AM
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[][] merge(int[][] intervals) {
        // Step 1: Sort intervals based on the start value
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // List to hold the merged intervals
        ArrayList<int[]> merged = new ArrayList<>();

        // Step 2: Iterate through the intervals
        for (int i = 0; i < intervals.length; i++) {
            // If merged is empty or the current interval does not overlap with the last one
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < intervals[i][0]) {
                // Add the current interval to the merged list
                merged.add(intervals[i]);
            } else {
                // There is an overlap, so we merge the current interval with the last one
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], intervals[i][1]);
            }
        }

        // Step 3: Convert the ArrayList back to a 2D array
        return merged.toArray(new int[merged.size()][]);
    }
}
