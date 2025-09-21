// Last updated: 9/21/2025, 7:56:43 PM
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
class Solution {
    public boolean isPalindrome(ListNode head) {
        StringBuilder str = new StringBuilder();
        StringBuilder rev = new StringBuilder();
        hai(head, str, rev);

        if (str.toString().equals(rev.toString())) return true;
        else return false;


    }
    public static void hai(ListNode head, StringBuilder str, StringBuilder rev) {
        if (head == null) return;
        str.append(head.val);              
        hai(head.next, str, rev);
        rev.append(head.val);             
}

}