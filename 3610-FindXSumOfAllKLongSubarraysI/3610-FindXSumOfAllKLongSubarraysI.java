// Last updated: 11/12/2025, 11:35:23 AM
import java.util.*;

class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int len = nums.length - k + 1;
        int[] arr = new int[len];
        int j = 0;

        for (int start = 0; start <= nums.length - k; start++) {
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = start; i < start + k; i++) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }

            List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
            list.sort((a, b) -> {
                if (!a.getValue().equals(b.getValue()))
                    return b.getValue() - a.getValue();
                return b.getKey() - a.getKey();
            });

            HashSet<Integer> keep = new HashSet<>();
            for (int i = 0; i < Math.min(x, list.size()); i++) {
                keep.add(list.get(i).getKey());
            }

            int c = 0;
            for (int i = start; i < start + k; i++) {
                if (keep.contains(nums[i])) {
                    c += nums[i];
                }
            }

            arr[j] = c;
            j++;
        }

        return arr;
    }
}
