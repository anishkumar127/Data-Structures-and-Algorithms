
/*
Structure of node class is:
class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/
/*


*/
class Solution {
    
    public Node insertInMid(Node head, int data){
        //Insert code here, return the head of modified linked list
        if(head==null) return null;
        
        Node current_node = head;
        
        Node slow =head;
        Node fast = head;
        Node newNode  = new Node(data);
        while(fast.next!=null && fast.next.next!=null){    // even odd case handle.
            
            slow = slow.next;
            fast = fast.next.next;
        }
        // order maintain. first have to link newNode with next NOde. then attach with previous node.
        newNode.next =slow.next;     // newNode is 30. and slow pointer is 20.  so slow.next is 40.  so 30.next is 40.
        slow.next = newNode;        // 20.next is 30. newNode.
        
        return head;
    }
}