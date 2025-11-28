// Last updated: 11/28/2025, 9:47:19 PM
class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] indegree = new int[n + 1];
        int[] outdegree = new int[n + 1];

        for (int[] t : trust) {
            outdegree[t[0]]++; // person i kitno ko trust krta h
            indegree[t[1]]++; //person i ko trust karne wale log
        }
        for (int i = 1; i <= n; i++) {
            if (indegree[i] == n - 1 && outdegree[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}
