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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head; 
        
        int k = 0;
        while(curr!=null){
            curr = curr.next;
            k+=1;
        }
        
        if(k==n){
            return head.next;
        }
            curr = head;
            int i=1;
            while(i<k-n){
                curr=curr.next;
                i++;                    
            }
        curr.next = curr.next.next;
        
        return head;
    }
}