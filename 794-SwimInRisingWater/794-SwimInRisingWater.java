// Last updated: 11/28/2025, 9:47:30 PM
import java.util.*;
class Solution {
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        int low = grid[0][0], high = n * n - 1;

        while (low < high) {
            int mid = (low + high) / 2;
            if (canReach(grid, mid)) high = mid;
            else low = mid + 1;
        }
        return low;
    }

    private boolean canReach(int[][] grid, int t) {
        int n = grid.length;
        if (grid[0][0] > t) return false;
        boolean[][] visited = new boolean[n][n];
        int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0});
        visited[0][0] = true;
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0], c = cur[1];
            if (r == n - 1 && c == n - 1) return true;
            for (int[] d : dirs) {
                int nr = r + d[0], nc = c + d[1];
                if (nr >= 0 && nr < n && nc >= 0 && nc < n && 
                    !visited[nr][nc] && grid[nr][nc] <= t) {
                    visited[nr][nc] = true;
                    q.offer(new int[]{nr, nc});
                }
            }
        }
        return false;
    }
}
