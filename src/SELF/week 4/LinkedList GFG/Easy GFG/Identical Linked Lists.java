
/*
class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}*/

class Solution {
    
    //Function to check whether two linked lists are identical or not.
    public boolean isIdentical (Node head1, Node head2){
        //write your code here 
        Node current_node1 = head1;
        Node current_node2 = head2;
        
        int size1 = size1(head1);
        int size2 = size2(head2);
        // edge case.
        if(size1!=size2) return false;
        if(head1==null && head2==null) return true;
        
        if(head1== null || head2 ==null) return false;
        
        
        while(current_node1!=null && current_node2!=null){
            if(current_node1.data!=current_node2.data) return false;
            
            current_node1 = current_node1.next;
            current_node2= current_node2.next;
        }
        return true;
    }
    
    private static int size1(Node head1){
        int size=0;
        Node curr = head1;
        while(curr!=null){
            size++;
            curr = curr.next;
        }
        return  size;
    }
    
    private static int size2(Node head2){
         int size=0;
        Node curr = head2;
        while(curr!=null){
            size++;
            curr = curr.next;
        }
        return  size;
    }
}

