/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node c = head;
        while(c!=null){
            Node temp = c.next;
            c.next = new Node(c.val);
            c.next.next = temp;
            c = temp;            
        }
        c =head;
        
        while(c!=null){
            if(c.next!=null){
                c.next.random = c.random!=null?c.random.next:null;
                c = c.next.next;
            }
        }
        
        c = head;
        Node d = c!=null?c.next:null;
        Node temp = d;
        
        while(c!=null){
            c.next = c.next.next;
            d.next = d.next != null ? d.next.next : null;
            c = c.next;
            d = d.next;
        }
        
        return temp;        
    }
}