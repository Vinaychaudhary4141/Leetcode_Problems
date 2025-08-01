// Last updated: 8/1/2025, 11:56:37 AM
import java.util.*;

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) return new int[0];
        
        int n = nums.length;
        int[] result = new int[n - k + 1];  // Result array
        Deque<Integer> deque = new ArrayDeque<>();  // Store indices of useful elements in current window
        
        for (int i = 0; i < n; i++) {
            // Remove indices that are out of the current window
            if (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }
            
            // Remove indices from the deque where the corresponding elements are less than nums[i]
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            
            // Add current element's index to the deque
            deque.offer(i);
            
            // The first index in the deque is the index of the maximum element in the current window
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peek()];
            }
        }
        
        return result;
    }

    // Test the solution
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println(Arrays.toString(solution.maxSlidingWindow(nums, k)));  // Output: [3, 3, 5, 5, 6, 7]
    }
}
