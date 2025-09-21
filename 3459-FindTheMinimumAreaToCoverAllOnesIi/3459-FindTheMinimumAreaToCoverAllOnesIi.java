// Last updated: 9/21/2025, 7:55:19 PM
class Solution {
    public int minimumSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = m * n; // upper bound

        // helper function: compute area of bounding rectangle of all 1s in subgrid
        java.util.function.Function<int[], Integer> area = range -> {
            int si = range[0], ei = range[1], sj = range[2], ej = range[3];
            int x1 = Integer.MAX_VALUE, y1 = Integer.MAX_VALUE;
            int x2 = -1, y2 = -1;
            for (int i = si; i <= ei; i++) {
                for (int j = sj; j <= ej; j++) {
                    if (grid[i][j] == 1) {
                        x1 = Math.min(x1, i);
                        y1 = Math.min(y1, j);
                        x2 = Math.max(x2, i);
                        y2 = Math.max(y2, j);
                    }
                }
            }
            if (x2 < 0) return 0; // no 1s in this region
            return (x2 - x1 + 1) * (y2 - y1 + 1);
        };

        // Horizontal + bottom split
        for (int i = 0; i < m; i++) {
            int top = area.apply(new int[]{0, i, 0, n - 1});
            for (int j = 0; j < n; j++) {
                ans = Math.min(ans,
                    top +
                    area.apply(new int[]{i + 1, m - 1, 0, j}) +
                    area.apply(new int[]{i + 1, m - 1, j + 1, n - 1})
                );
            }
        }

        // Bottom + top split
        for (int i = 0; i < m; i++) {
            int bottom = area.apply(new int[]{i, m - 1, 0, n - 1});
            for (int j = 0; j < n; j++) {
                ans = Math.min(ans,
                    bottom +
                    area.apply(new int[]{0, i - 1, 0, j}) +
                    area.apply(new int[]{0, i - 1, j + 1, n - 1})
                );
            }
        }

        // Vertical + right split
        for (int j = 0; j < n; j++) {
            int left = area.apply(new int[]{0, m - 1, 0, j});
            for (int i = 0; i < m; i++) {
                ans = Math.min(ans,
                    left +
                    area.apply(new int[]{0, i, j + 1, n - 1}) +
                    area.apply(new int[]{i + 1, m - 1, j + 1, n - 1})
                );
            }
        }

        // Right + left split
        for (int j = 0; j < n; j++) {
            int right = area.apply(new int[]{0, m - 1, j, n - 1});
            for (int i = 0; i < m; i++) {
                ans = Math.min(ans,
                    right +
                    area.apply(new int[]{0, i, 0, j - 1}) +
                    area.apply(new int[]{i + 1, m - 1, 0, j - 1})
                );
            }
        }

        // Three horizontal strips
        for (int i1 = 0; i1 < m; i1++) {
            for (int i2 = i1 + 1; i2 < m; i2++) {
                ans = Math.min(ans,
                    area.apply(new int[]{0, i1, 0, n - 1}) +
                    area.apply(new int[]{i1 + 1, i2, 0, n - 1}) +
                    area.apply(new int[]{i2 + 1, m - 1, 0, n - 1})
                );
            }
        }

        // Three vertical strips
        for (int j1 = 0; j1 < n; j1++) {
            for (int j2 = j1 + 1; j2 < n; j2++) {
                ans = Math.min(ans,
                    area.apply(new int[]{0, m - 1, 0, j1}) +
                    area.apply(new int[]{0, m - 1, j1 + 1, j2}) +
                    area.apply(new int[]{0, m - 1, j2 + 1, n - 1})
                );
            }
        }

        return ans;
    }
}
