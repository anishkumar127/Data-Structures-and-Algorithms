import java.util.*;


public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList llist= new LinkedList(); 
        int a1=sc.nextInt();
        Node head= new Node(a1);
        llist.addToTheLast(head);
        for (int i = 1; i < n; i++) 
        {
            int a = sc.nextInt(); 
            llist.addToTheLast(new Node(a));
        }
            
        Accio A = new Accio();
        llist.head = A.midpointOfLinkedList(llist.head);
        llist.printList();
        
    }
}

class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    
class LinkedList
{
    Node head;  
    Node tail;
    public void addToTheLast(Node node) 
    {
      if (head == null) 
      {
       head = node;
       tail = node;
      } 
      else 
      {
       tail.next = node;
       tail = node;
      }
    }
      void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
    
}

class Accio
{
    static Node midpointOfLinkedList(Node head)
    {
        //Your code here
            Node slow = head;
            Node fast = head;
            while(fast!=null && fast.next!=null){
                    slow = slow.next;
                    fast = fast.next.next;
            }
            return slow;
    }
    
}






Given the head of a linked list, return the middle node of the linked list.

Linked List Structure:

public class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}   
public class LinkedList
{
    Node head;  
    Node tail;
}
Example:

If your list is [5, 4, 3, 2], the function should return the node at index 2, i.e. value 3.

Input Format
You will be provided with an integer n, the number of elements in the linked list.

The next n integers denote the values of the nodes in the linked list.

Output Format
Return the node at the middle of the list. In case the number of elements is even, return the second middle element.

Example 1
Input

4
5 4 3 2
Output:

3 2
Example 2
Input

3
5 7 1
Output:

7 1
Constraints
1 <= n <= 10^5