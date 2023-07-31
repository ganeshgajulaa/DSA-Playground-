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
        ListNode a = headA;
        ListNode b = headB;
        
        long n = 0;
        long m = 0;
        
        while(a!=null || b!= null){
            if(a!=null){
                a=a.next;
                n++;
            }
            if(b!=null){
                b=b.next;
                m++;
            }
        }
        
        long diff = Math.abs(n-m);
                
        ListNode p1 = n>m ? headA:headB;
        ListNode p2 = p1==headA ? headB:headA;
        
        int i=0;
        while(i<diff){
            p1=p1.next;
            i++;
        }
        
        while(p1!=p2){
            p1=p1.next;
            p2=p2.next;
        }
        
        return p1;
        
    }
}