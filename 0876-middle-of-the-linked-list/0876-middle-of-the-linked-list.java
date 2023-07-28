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
    public ListNode middleNode(ListNode head) {
        int cnt = 0;
        ListNode temp = head;
        while(temp!=null){
            cnt++;
            temp = temp.next;
        }
        int mid = cnt/2;
        temp = head;
        while(mid>0){
            mid--;
            temp = temp.next;
        }
        return temp;
    }
}