// Last updated: 8/1/2025, 11:56:42 AM
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
    public ListNode reverseList(ListNode head) {
       ListNode curr=head;
       ListNode prev =null;
       while(curr!=null){
        ListNode ahead=curr.next;
        curr.next=prev;
        prev=curr;
        curr=ahead;
       }
       return prev;
    }
}