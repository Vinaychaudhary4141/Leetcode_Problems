// Last updated: 9/21/2025, 7:58:42 PM
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        int carry = 0;
        ListNode ans = l1;
        ListNode prev=null;
        while(l1!=null && l2!=null){
            int n1 = l1.val;
            int n2 = l2.val;
            int sum = n1+n2+carry;
            l1.val = sum%10;
            carry = sum/10;
            prev=l1;
            l1 = l1.next;
            l2 = l2.next;
        }
        if(l2!=null) {
            prev.next=l2;
            l1 = l2;
        }
        while(l1!=null && carry!=0){
            prev = l1;
            int sum = l1.val+carry;
            l1.val = sum%10;
            carry = sum/10;
            l1 = l1.next;
        }

        if(carry==1) prev.next = new ListNode(1);
        
        return ans;
    }
}