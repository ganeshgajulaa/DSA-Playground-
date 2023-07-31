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
    public ListNode getIntersectionNode(ListNode a, ListNode b) {
        ListNode p = a;
        ListNode q = b;
        
        while(p!=q){
            p = p!=null? p=p.next:b;
            q = q!=null? q=q.next:a;
            }
        
        return p;
    }
}