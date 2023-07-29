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
        ListNode dummy = new ListNode(0);
        int carry = 0;
        int sum = 0;
        ListNode curr = dummy;
        
        while(l1!=null || l2!=null || carry!=0){
            int n1 = (l1!=null) ? l1.val:0;
            int n2 = (l2!=null) ? l2.val:0;
            
            sum = n1 + n2 + carry;
            carry = sum/10;
            
            ListNode nd  = new ListNode(sum%10);
                        
            if(l1!=null)    l1 = l1.next;
            if(l2!=null)    l2 = l2.next;
            
            curr.next = nd;
            curr=curr.next;
        }
        return dummy.next;
    }
}