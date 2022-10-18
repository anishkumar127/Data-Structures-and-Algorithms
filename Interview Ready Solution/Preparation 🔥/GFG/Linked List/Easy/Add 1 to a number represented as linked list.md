```java
//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}
class GfG
{
    public static void printList(Node node) 
    { 
        while (node != null)
        { 
            System.out.print(node.data);
            node = node.next; 
        }  
        System.out.println();
    } 
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Node head = new Node( s.charAt(0) - '0' );
                    Node tail = head;
                    for(int i=1; i<s.length(); i++)
                    {
                        tail.next = new Node( s.charAt(i) - '0' );
                        tail = tail.next;
                    }
                    Solution obj = new Solution();
                    head = obj.addOne(head);
                    printList(head); 
                }
        }
}
// } Driver Code Ends


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

class Solution
{
    public static Node addOne(Node head) 
    { 
       head =  reverse(head);
       int sum =0;
       int carry=0;
       boolean flag = false;
       Node curr =head;
       Node temp = null;
       while(curr!=null){
           if(flag==false){
               sum = curr.data+1;  // only one time and 1.
               flag=true;
           }else{
               // second time not add 1. just add carry into sum.
               sum = carry+curr.data;
           }
               carry = sum>=10 ? 1 : 0;
               sum = sum % 10 ; // 15 %5 = 5;
               
               //put sum data into curr.data
               curr.data = sum;
               temp = curr;  // store curr value also in temp if 0 0 0 and then 1 case handle.
               curr = curr.next;
       }
       
       if(carry>0){
           temp.next = new Node(1);
       }
       
       return reverse(head);
    }
    private static Node reverse(Node head){
        
        Node prev = null;
   
        while(head!=null){
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}

```


**theory part **

A number N is represented in Linked List such that each digit corresponds to a node in linked list. You need to add 1 to it.

Example 1:

Input:
LinkedList: 4->5->6
Output: 457 
Example 2:

Input:
LinkedList: 1->2->3
Output: 124 
Your Task:
Your task is to complete the function addOne() which takes the head of the linked list as the only argument and returns the head of the modified linked list. The driver code prints the number.
Note: The head represents the left-most digit of the number.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= N <= 101000