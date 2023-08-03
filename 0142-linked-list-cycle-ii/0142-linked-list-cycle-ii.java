/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode,Boolean> mp = new HashMap<>();        
        
        while(head!=null){            
            if(mp.containsKey(head) && mp.get(head)==true){
                return head;
            }
            if(!mp.containsKey(head)){
                mp.put(head,true);
            }
            head=head.next;
        }
        return null;
    }
}