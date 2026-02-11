// Last updated: 2/11/2026, 12:15:29 PM
import java.util.*;

class Solution {
    public int minimumPairRemoval(int[] nums) {
        int n = nums.length;
        List<Integer> arr = new ArrayList<>();
        for (int x : nums) arr.add(x);

        int ops = 0;

        while (!isNonDecreasing(arr)) {
            PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]
            );

            for (int i = 0; i < arr.size() - 1; i++) {
                pq.offer(new int[]{arr.get(i) + arr.get(i + 1), i});
            }

            int[] best = pq.poll();
            int idx = best[1];
            int sum = best[0];

            arr.remove(idx + 1);
            arr.set(idx, sum);

            ops++;
        }

        return ops;
    }

    private boolean isNonDecreasing(List<Integer> arr) {
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < arr.get(i - 1)) return false;
        }
        return true;
    }
}
