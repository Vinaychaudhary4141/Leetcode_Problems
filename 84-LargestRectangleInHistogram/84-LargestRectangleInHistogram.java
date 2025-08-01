// Last updated: 8/1/2025, 11:57:10 AM
import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int index = 0;

        while (index < heights.length) {
            // If this bar is higher than the bar at stack top, push it to the stack
            if (stack.isEmpty() || heights[index] >= heights[stack.peek()]) {
                stack.push(index++);
            } else {
                // Pop the top
                int top = stack.pop();
                // Calculate the area with heights[top] as the smallest height
                int area = heights[top] * (stack.isEmpty() ? index : index - stack.peek() - 1);
                // Update max area, if needed
                maxArea = Math.max(maxArea, area);
            }
        }

        // Now pop the remaining bars from stack and calculate area
        while (!stack.isEmpty()) {
            int top = stack.pop();
            int area = heights[top] * (stack.isEmpty() ? index : index - stack.peek() - 1);
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] heights1 = {2, 1, 5, 6, 2, 3};
        System.out.println(solution.largestRectangleArea(heights1)); // Expected output: 10

        int[] heights2 = {2, 4};
        System.out.println(solution.largestRectangleArea(heights2)); // Expected output: 4
    }
}
