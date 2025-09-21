// Last updated: 9/21/2025, 7:55:24 PM
public class Solution {
    //chatgpt
    public int numberOfPairs(int[][] points) {
        int n = points.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int ax = points[i][0], ay = points[i][1];
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                int bx = points[j][0], by = points[j][1];

                if (ax > bx || ay < by) continue;

                boolean valid = true;
                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) continue;
                    int x = points[k][0], y = points[k][1];
                    if (x >= ax && x <= bx && y <= ay && y >= by) {
                        valid = false;
                        break;
                    }
                }
                if (valid) count++;
            }
        }

        return count;
    }
}