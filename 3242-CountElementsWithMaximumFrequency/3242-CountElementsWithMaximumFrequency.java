// Last updated: 9/23/2025, 6:07:43 PM
import java.util.*;

public class Solution {
    public int maxFrequencyElements(int[] nums) {
        // Use a map to count frequencies
        Map<Integer, Integer> freq = new HashMap<>();
        int maxFreq = 0;

        // 1) Count frequencies and track the maximum
        for (int x : nums) {
            int c = freq.getOrDefault(x, 0) + 1;
            freq.put(x, c);
            if (c > maxFreq) {
                maxFreq = c;
            }
        }

        // 2) Sum the frequencies of all elements that have frequency == maxFreq
        int sum = 0;
        for (int count : freq.values()) {
            if (count == maxFreq) {
                sum += count;
            }
        }

        return sum;
    }
}
