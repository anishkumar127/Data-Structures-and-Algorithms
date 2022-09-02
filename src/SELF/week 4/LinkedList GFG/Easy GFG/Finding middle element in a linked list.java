
/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         Node current_node = head;
         
         Node slow = head;
         Node fast = head;
         while(fast.next!=null && fast.next.next!=null){
             slow = slow.next;
             fast = fast.next.next;
             
             if(slow ==fast){
                 break;
             }
         }
         
         int size = size(head);
         if(size%2==0){
             return slow.next.data;
         }
         return slow.data;
    }
    private static int size (Node head){
        int size =0;
        Node curr = head;
        while(curr!=null){
              size++;
        curr=curr.next;
        
        }
      
        return size;
    }
}



/*

fast.next !=null return slow.next.data;
esle return slow.data.

2 4 6 7 5 1
slow 2
fast 6
slow 4
fast 5
slow 6
fast null.

even case..   fast.next  5.next 1 !=null means 1 left so return slow.next;
*/
class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         Node current_node = head;
         
         Node slow = head;
         Node fast = head;
         while(fast.next!=null && fast.next.next!=null){
             slow = slow.next;
             fast = fast.next.next;
             
             if(slow ==fast){
                 break;
             }
         }
         
        if(fast.next!=null) return slow.next.data;  // even
        else return slow.data;                      // odd
    }
  
}

/*
// this is also working.

//

2 4 6 7 5 1

slow 2
fast 4
slow 4
fast 6
slow 6 
fast 7
slow 7
fast 5
slow 5 and fast.next 1.next null. so return slow pointer.
*/

class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         Node current_node = head;
         
         Node slow = head;
         Node fast = head;
         while(fast!=null && fast.next!=null){
             slow = slow.next;
             fast = fast.next.next;
             
             if(slow ==fast){
                 break;
             }
         }
         return slow.data;              
    }
  
}



