// Last updated: 10/11/2025, 11:02:33 PM
import java.util.*;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = spells.length, m = potions.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            long need = (success + spells[i] - 1) / spells[i]; // ceil division
            int idx = lowerBound(potions, need);
            res[i] = m - idx;
        }
        return res;
    }

    private int lowerBound(int[] arr, long target) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr[mid] < target) l = mid + 1;
            else r = mid;
        }
        return l;
    }
}
