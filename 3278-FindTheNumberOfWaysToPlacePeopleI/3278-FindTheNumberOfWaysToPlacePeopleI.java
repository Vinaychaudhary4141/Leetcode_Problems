// Last updated: 9/21/2025, 7:55:23 PM
public class Solution {
    public int numberOfPairs(int[][] points) {
        int n = points.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int[] A = points[i];
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                int[] B = points[j];

                if (A[0] <= B[0] && A[1] >= B[1]) {
                    boolean valid = true;

                    for (int k = 0; k < n; k++) {
                        if (k == i || k == j) continue;
                        int[] C = points[k];

                        if (C[0] >= A[0] && C[0] <= B[0] &&
                            C[1] <= A[1] && C[1] >= B[1]) {
                            valid = false;
                            break;
                        }
                    }

                    if (valid) count++;
                }
            }
        }
        return count;
    }
}
