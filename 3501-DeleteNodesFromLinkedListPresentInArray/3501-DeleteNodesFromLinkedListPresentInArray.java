// Last updated: 11/12/2025, 11:35:26 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.*;

class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        ListNode curr = new ListNode(0);
        ListNode temp = curr;
        while (head != null) {
            if (!set.contains(head.val)) {
                temp.next = new ListNode(head.val);
                temp = temp.next;
            }
            head = head.next;
        }
        return curr.next;
    }
}
