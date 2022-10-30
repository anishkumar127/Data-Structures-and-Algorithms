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
            
        Solution A = new Solution();
        A.checkLinkedListPalindrome(llist.head);
        
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

class Solution
{
    static void checkLinkedListPalindrome(Node head)
    {
        //Your code here
            if(isPalindrome(head)){
                    System.out.print("YES");
            }else{
                    System.out.print("NO");
            }
    }
         public static boolean isPalindrome(Node head) {
        // edge case.
        if(head==null || head.next==null) return true; 
        
        // find the middle.
        Node slow= head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        slow.next = reverse(slow.next);  // reverse right half.
        
        slow = slow.next;  // right half starting from slow.
        
        while(slow!=null){          
            if(head.data!=slow.data){ 
                return false;
            }
            head = head.next;
            slow = slow.next; 
        }
        return true;
    }
    
    private static Node reverse(Node head){
        Node dummyHead =null;
        while(head!=null){
            
            Node next = head.next;
            head.next = dummyHead;
            dummyHead = head;
            head = next;
        }
        return dummyHead;
    }
    
}

Given the head of a linked list, check whether the linked list is palindromic or not.

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
If your list is [5, 4, 4, 5], the output should be YES.

Input Format
The first integer denotes n, the number of elements in the linked list.

The next n space separated integers denote the elements of the linked list.

Output Format
Output YES if the list is palindromic, else output NO.

Example 1
Input

4
5 4 4 5
Output

YES
Explanation

The given list is a palindrome

Example 2
Input

2
5 7
Output

NO
Explanation

The given list is not a palindrome

Constraints
1 <= n <= 10^5