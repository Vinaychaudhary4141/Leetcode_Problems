// Last updated: 8/1/2025, 11:56:24 AM
import java.util.Stack;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            result[i] = -1;
        }

        for (int i = 0; i < 2 * n; i++) {
            int index = i % n;
            while (!stack.isEmpty() && nums[index] > nums[stack.peek()]) {
                int prevIndex = stack.pop();
                result[prevIndex] = nums[index];
            }
            if (i < n) {
                stack.push(index);
            }
        }

        return result;
    }
}
