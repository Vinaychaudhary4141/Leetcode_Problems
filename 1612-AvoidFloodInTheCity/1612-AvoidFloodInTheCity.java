// Last updated: 10/11/2025, 11:02:53 PM
import java.util.*;

class Solution {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] ans = new int[n];
        Map<Integer, Integer> full = new HashMap<>();
        TreeSet<Integer> dryDays = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            if (rains[i] == 0) {
                dryDays.add(i);
                ans[i] = 1; 
            } else {
                ans[i] = -1;
                if (full.containsKey(rains[i])) {
                    Integer dryDay = dryDays.higher(full.get(rains[i]));
                    if (dryDay == null) return new int[0];
                    ans[dryDay] = rains[i];
                    dryDays.remove(dryDay);
                }
                full.put(rains[i], i);
            }
        }
        return ans;
    }
}
