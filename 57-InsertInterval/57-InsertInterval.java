// Last updated: 8/1/2025, 11:57:24 AM
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int i = 0;
        
        // Step 1: Add all intervals before newInterval
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }
        
        // Step 2: Merge all overlapping intervals with newInterval
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        result.add(newInterval);  // Add the merged interval
        
        // Step 3: Add all remaining intervals after newInterval
        while (i < intervals.length) {
            result.add(intervals[i]);
            i++;
        }
        
        // Convert the result list to a 2D array
        return result.toArray(new int[result.size()][]);
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[][] intervals1 = {{1, 3}, {6, 9}};
        int[] newInterval1 = {2, 5};
        int[][] result1 = solution.insert(intervals1, newInterval1);
        printResult(result1);  // Output: [[1,5],[6,9]]
        
        int[][] intervals2 = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval2 = {4, 8};
        int[][] result2 = solution.insert(intervals2, newInterval2);
        printResult(result2);  // Output: [[1,2],[3,10],[12,16]]
    }
    
    private static void printResult(int[][] result) {
        for (int[] interval : result) {
            System.out.print("[" + interval[0] + "," + interval[1] + "] ");
        }
        System.out.println();
    }
}
