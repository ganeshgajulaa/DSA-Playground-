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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(k==0 || head==null)  return head;
        ListNode c = head;
        int n = 0;
        while(c.next!=null){
            c= c.next;
            n++;
        }
        if(k==n+1)  return head;
        c.next = head;
        k=k%(n+1);
        int jump = n-k;
        
        c=head;
        while(jump>0){
            c=c.next;
            jump--;
        }
        ListNode newh = c.next;
        c.next = null;
        
        return newh;
    }
}