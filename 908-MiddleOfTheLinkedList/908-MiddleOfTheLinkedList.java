// Last updated: 8/1/2025, 11:56:17 AM
class Solution {
    public ListNode middleNode(ListNode head) {
       ListNode slow=head;
       ListNode fast=head;
       while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
       } 
       return slow;
    }
}