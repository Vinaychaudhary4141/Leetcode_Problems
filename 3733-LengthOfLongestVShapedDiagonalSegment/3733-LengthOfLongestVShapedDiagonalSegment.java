// Last updated: 9/21/2025, 7:55:08 PM
class Solution {
    int n, m;
    int[][] grid;
    int[][][] memo;
    int[][] dirs = {{1,1},{1,-1},{-1,-1},{-1,1}};
    int[] clockwise = {1,2,3,0}; 

    public int lenOfVDiagonal(int[][] grid) {
        this.grid = grid;
        n = grid.length;
        m = grid[0].length;
        memo = new int[n][m][8];
        int ans = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (grid[i][j] == 1) {
                    for (int d=0; d<4; d++) {
                        ans = Math.max(ans, 1 + dfs(i+dirs[d][0], j+dirs[d][1], d, 0, 2));
                    }
                }
            }
        }
        return ans;
    }

    private int dfs(int r, int c, int dir, int turned, int expect) {
        if (r<0 || r>=n || c<0 || c>=m) return 0;
        if (grid[r][c] != expect) return 0;
        int state = dir*2 + turned;
        if (memo[r][c][state] != 0) return memo[r][c][state];
        int nextExpect = (expect == 2 ? 0 : 2);
        int best = 1 + dfs(r+dirs[dir][0], c+dirs[dir][1], dir, turned, nextExpect);
        if (turned == 0) {
            int ndir = clockwise[dir];
            best = Math.max(best, 1 + dfs(r+dirs[ndir][0], c+dirs[ndir][1], ndir, 1, nextExpect));
        }
        return memo[r][c][state] = best;
    }
}
