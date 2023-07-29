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
import java.util.*;
class Solution {
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<ListNode>();
       
        ListNode curr = head;
        
        while(curr!=null){
            stack.push(curr);
            curr=curr.next;
        }
        
        ListNode dummyHead = new ListNode();
        curr = dummyHead;
        
        while(!stack.isEmpty()){
            curr.next=stack.peek();
            curr = curr.next;
            stack.pop();
        }
        
        curr.next = null;       
        
        return dummyHead.next;
        
    }
}