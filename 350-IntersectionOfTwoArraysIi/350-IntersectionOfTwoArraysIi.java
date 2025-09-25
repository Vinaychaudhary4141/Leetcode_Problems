// Last updated: 9/25/2025, 8:08:45 PM
import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums1) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();

        for (int num : nums2) {
            if (freq.containsKey(num) && freq.get(num) > 0) {
                result.add(num);           
                freq.put(num, freq.get(num) - 1); 
            }
        }
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) res[i] = result.get(i);

        return res;
    }
}
