// Last updated: 9/21/2025, 7:55:04 PM
import java.util.*;

class Solution {
    public static int[][] sortMatrix(int[][] grid) {
        int n = grid.length;

        
        for (int row = 0; row < n; row++) {
            List<Integer> diagonal = new ArrayList<>();
            int i = row, j = 0;
            while (i < n && j < n) {
                diagonal.add(grid[i][j]);
                i++;
                j++;
            }
            diagonal.sort(Collections.reverseOrder());

            i = row; j = 0;
            int idx = 0;
            while (i < n && j < n) {
                grid[i][j] = diagonal.get(idx++);
                i++;
                j++;
            }
        }

        for (int col = 1; col < n; col++) {
            List<Integer> diagonal = new ArrayList<>();
            int i = 0, j = col;
            while (i < n && j < n) {
                diagonal.add(grid[i][j]);
                i++;
                j++;
            }
            Collections.sort(diagonal);

            i = 0; j = col;
            int idx = 0;
            while (i < n && j < n) {
                grid[i][j] = diagonal.get(idx++);
                i++;
                j++;
            }
        }

        return grid;
    }
}
