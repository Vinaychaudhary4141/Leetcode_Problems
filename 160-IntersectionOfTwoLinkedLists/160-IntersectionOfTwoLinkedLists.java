// Last updated: 8/1/2025, 11:56:49 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pcr=headA;
        ListNode vgf=headB;
        while(pcr!=vgf){
            if(pcr==null){
                pcr=headB;

            }
            else{
                pcr=pcr.next;
            }
            if(vgf==null){
                vgf=headA;

            }
            else{
                vgf=vgf.next;
            }
        }
        return pcr;
    }
}