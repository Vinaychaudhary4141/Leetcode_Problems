// Last updated: 8/1/2025, 11:56:14 AM
import java.util.*;

class Solution {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> list = new ArrayList<>();
        
        // Convert Linked List to ArrayList
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int[] answer = new int[list.size()];
        Stack<Integer> stack = new Stack<>();

        // Monotonic decreasing stack to find next greater element
        for (int i = 0; i < list.size(); i++) {
            while (!stack.isEmpty() && list.get(stack.peek()) < list.get(i)) {
                answer[stack.pop()] = list.get(i);
            }
            stack.push(i);
        }

        return answer;
    }
}
