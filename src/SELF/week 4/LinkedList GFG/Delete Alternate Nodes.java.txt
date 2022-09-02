
/*
class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
    }
}
*/

/*

current 1. next = 1.next.next 3
1 3.
3.next ! null.
3.next = 3.next.next 5.
1 3 5
5.next!null.
5.next = 5.next.next = null. 

*/
class Solution {
    
    public void deleteAlternate (Node head){
        //Write your code here
        if(head==null) return;
        Node current_node = head;
        
        while(current_node!=null && current_node.next!=null){   // both not null. if do only one the null pointer exception.
            current_node.next = current_node.next.next;
            
            current_node = current_node.next; // traversing. i++;
        }
        
    }
}