// Last updated: 9/21/2025, 7:55:48 PM
import java.util.*;

class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        int m = languages.length;
        Set<Integer>[] known = new HashSet[m + 1];
        for (int i = 0; i < m; i++) {
            known[i + 1] = new HashSet<>();
            for (int lang : languages[i]) {
                known[i + 1].add(lang);
            }
        }
        Set<Integer> candidates = new HashSet<>();
        for (int[] f : friendships) {
            int u = f[0], v = f[1];
            boolean canCommunicate = false;
            for (int lang : known[u]) {
                if (known[v].contains(lang)) {
                    canCommunicate = true;
                    break;
                }
            }
            if (!canCommunicate) {
                candidates.add(u);
                candidates.add(v);
            }
        }
        if (candidates.isEmpty()) return 0;

        int answer = Integer.MAX_VALUE;
        for (int lang = 1; lang <= n; lang++) {
            int count = 0;
            for (int user : candidates) {
                if (known[user].contains(lang)) {
                    count++;
                }
            }
            answer = Math.min(answer, candidates.size() - count);
        }

        return answer;
    }
}
