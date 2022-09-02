class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        
        
        //Code here
        // edge case 
        if(head==null) return 0;
        int size =0;
        Node current_node = head;
        while(current_node!=null){
            size++;
            current_node = current_node.next;
        }
        
        return size;
    }
}
   
   