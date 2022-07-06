import java.util.*;
// Palindrom check.
public class HelloWorld {
    public static void main(String[] args) {
        
        
    }
    
    boolean palindrome(Node head){
      if(head ==null){
        return true;
      }
      Node mid= middle(head);
      Node last = reverse(mid.next);
      Node current = head;
      while(last!=null){
        if(last.data!=current.data){
          return false;
        }
        last = last.next;
        current= current.next;
      }
      return true;
    }
    
    // middle found. 
    Node middle(Node head){
      Node slow = head;
      Node fast = head;
      while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
      }
      return slow;
    }
    // reverse
    public Node reverse(Node head){
  if(head==null || head.next==null){
    return head;
  }
  Node current = head;
  Node prev = null;
  Node nextt = null;
  while(current!=null){
    nextt = current.next;
    current.next = prev;
    prev = current;
    current = nextt;
  }
  return prev;
    }
    
}