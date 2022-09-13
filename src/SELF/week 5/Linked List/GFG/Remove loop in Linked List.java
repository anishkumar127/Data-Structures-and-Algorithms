
working.


/*
class Node
{
    int data;
    Node next;
}
*/

class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        if(head==null || head.next==null) return;
          Node slow =head;
           Node fast = head;
          boolean isLoopFound =false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
               
             isLoopFound = true;
             break;
            }
        }
        if(isLoopFound){
            slow = head;
            
            if(slow!=fast){
                while(slow.next!=fast.next){
                    slow = slow.next;
                    fast= fast.next;
                }
                fast.next = null;
            }else{
                while(fast.next!=slow){
                    fast=fast.next;
                }
                fast.next=null;
            }
        }
    }
   
}







///some test cases failed.


class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        if(head==null || head.next==null) return;
          Node slow =head;
           Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
               remove(head,slow);
               return;
            }
        }
    }
    private static void remove(Node head,Node slow){
          Node temp_node= head;
          while(slow.next!=temp_node.next){
              slow = slow.next;
              temp_node = temp_node.next;
          }
           slow.next = null;
        }
}