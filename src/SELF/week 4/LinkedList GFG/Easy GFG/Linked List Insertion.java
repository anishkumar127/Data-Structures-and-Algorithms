
/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
*/
/*
   1. 2 3 4 5    6
   6.next = 1;
   head = 6.
*/
class Solution
{
    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x)
    {
        
        Node new_node = new Node(x);
        if(head==null) return  head = new_node;
        
        new_node.next = head;       // set new node next is our head value
        head = new_node;            // update the head. now new node is our head.
        return head;            // return that head.
    }
    
    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
      
        Node new_node = new Node(x);
        if(head==null) return head = new_node;
        
   
         Node current_node = head;
         
         while(current_node.next!=null){
             current_node = current_node.next;
         }
         
         current_node.next = new_node;
        return head;
    }
}