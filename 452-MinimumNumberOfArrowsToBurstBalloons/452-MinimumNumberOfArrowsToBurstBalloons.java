// Last updated: 9/28/2025, 11:04:39 AM
import java.util.*;
class Solution {
    public int findMinArrowShots(int[][] points) {
        int row = points.length;
        int c = row;
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        for (int i = 0; i < row; i++) {
            int temp = i;
            int end = points[i][1];  
            boolean var = true;
            while (var) {
                if (temp + 1 < row && points[temp+1][0] <= end) {
                    end = Math.min(end, points[temp+1][1]);
                    c--;
                    temp++;
                } else {
                    i = temp;  
                    var = false;
                }
            }
        }

        return c;
    }
}
