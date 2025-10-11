// Last updated: 10/11/2025, 11:02:38 PM
import java.util.*;

class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int n = flowers.length, m = people.length;
        int[] start = new int[n];
        int[] end = new int[n];
        
        for (int i = 0; i < n; i++) {
            start[i] = flowers[i][0];
            end[i] = flowers[i][1];
        }
        
        Arrays.sort(start);
        Arrays.sort(end);
        
        int[] answer = new int[m];
        for (int i = 0; i < m; i++) {
            int p = people[i];
            int blooms = upperBound(start, p) - upperBound(end, p - 1);
            answer[i] = blooms;
        }
        return answer;
    }
        private int upperBound(int[] arr, int target) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= target) low = mid + 1;
            else high = mid;
        }
        return low;
    }
}
