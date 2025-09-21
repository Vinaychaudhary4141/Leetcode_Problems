// Last updated: 9/21/2025, 7:57:05 PM
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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        Stack<ListNode> st= new Stack<>();
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            st.push(temp);
            temp=temp.next;
            count++;
        }
        temp=head;
        for(int i=0;i<count/2;i++){
            ListNode endnode=st.pop();
            endnode.next=temp.next;
            temp.next=endnode;
            temp=endnode.next;
         }
         temp.next=null;    
    }
}