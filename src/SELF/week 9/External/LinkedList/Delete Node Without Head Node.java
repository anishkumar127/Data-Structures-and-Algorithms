import java.util.*;

class Node{
  int data ;
  Node next;
  Node(int d)
  {
    data = d;
    next = null;
  }
}

class Main{
  Node head;
  Node tail;
  
  void printList(Node head){
    Node tnode = head;
    while(tnode != null)
    {
      System.out.print(tnode.data+ " ");
      tnode = tnode.next;
    }
    System.out.println();
  }
  
  void addToTheLast(Node node){
    if(head == null)
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
  
  Node search_Node(Node head, int k){
    Node current = head;
    while(current != null){
      if(current.data == k)
        break;
      current = current.next;
    }
  return current;
  }
  
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      Main llist = new Main();
      int a1=sc.nextInt();
      Node head= new Node(a1);
      llist.addToTheLast(head);
      for (int i = 1; i < n; i++) {
      int a = sc.nextInt(); 
      llist.addToTheLast(new Node(a));
    }
      int k = sc.nextInt();
      Node del = llist.search_Node(llist.head,k);
      Solution g = new Solution();
      if(del != null && del.next != null)
      {
        g.deleteNode(del);
      }
      llist.printList(llist.head);
  }
}

class Solution
{
    void deleteNode(Node del)
    {
         // Your code here
            del.data = del.next.data;
            del.next =del.next.next;
    }
}




You are given the pointer to a node of a linked list. You need to delete that node from the list.

Note

All the values of the linked list are unique, and it is guaranteed that the given node is not the last node in the linked list. You need to only complete the function. Dont worry about input, it is for internal reference.

You are given the node to be deleted. You will not be given access to the head of the list.

Input Format
The first line of input contains N representing the number of nodes in linked list.

The second line of input contains N space seperated integers, representing elements in linked list.

The third line of input contains a number X representing which node is to be deleted.

Output Format:
Delete the given node from the list. Printing of the list after deletion will be handled by the driver code.

Example 1
Input

3
1 3 4
3
Output

1->4
Explanation

1->3->4
This is the list given in question. We are asked to delete '3', after which the list looks as shown.

Example 2
Input

4
1 2 3 4
2
Output

1->3->4
Explanation

1->2->3->4
This is list you are given in the question. We are asked to delete '2', after which the list looks as shown.

Constraints
1 <= N <= 100000

1 <= value of node <= 100000