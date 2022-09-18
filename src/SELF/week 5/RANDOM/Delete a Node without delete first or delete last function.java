import java.util.*;
import java.lang.*;
import java.io.*;

class Node{
  int data;
  Node next;
  Node(int data)
  {
     this.data=data;
    this.next=null;
       }
}
class LinkedList
  {
    Node head;
    void addNode(int data)   // insert At Tail rule
    {
      Node newNode = new Node(data);
      if(head == null)
      {   head = newNode; return;    }
      Node current = head;
      while(current.next !=null)
        {
          current = current.next;
        }
      current.next = newNode;
    }
  }

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner sc =new Scanner(System.in);
      int n= sc.nextInt();
      LinkedList list = new LinkedList();
      for(int i=0;i<n;i++)
        {
          int x = sc.nextInt();
          list.addNode(x);
        }
   
      int k= sc.nextInt();

      if(k ==0)
      {
        list.head= list.head.next;
      }
      else
      {
        Node curr =list.head;
        for(int i=1;i<k;i++)
          {
             curr = curr.next;
           }
        curr.next= curr.next.next;
      }
      Node h=list.head;
      while( h != null)
        {
          System.out.print(h.data +" ");
            h = h.next;
        }
  
  }      
}



// 2nd way. 

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Node head = null;
        for(int i=0; i<n; i++){
          
          head = InsertElement(head,input.nextInt());
        }
        int position = input.nextInt();
        
       head= DeleteANode(head,position); // ur mistake was here.
       // u have to initialise again to head whatever head we are gettting after deletion.
       
        
        printLinklist(head);

        // System.out.println(size(head)); // size
	}
	
	// inserting element into linked list.
 static Node InsertElement(Node head, int data){
    Node a1=new Node(data);
     if(head==null){
       head = a1;
       return head;
     }
     Node temp = head;
     while(temp.next!=null){
       temp =temp.next;
     }
     temp.next = a1;
     return head;
  }
  
  // getting size of linked list.
  private static int size(Node head){
    int size=0;
    while(head!=null)
    {
      size++;
      head= head.next;
    }
    return size;
  }
  
  // printing the linked list.
  static Node printLinklist(Node head){
    Node temp = head; 
    while(temp!=null){
      System.out.print(temp.data +" ");
      temp = temp.next;
    }
    return head;
  }
  static Node DeleteANode(Node head,int position){
    
    // 1st method.
    Node temp = head; // storing first head into temp. because after may be head change. by delete first or delete last.
    if(head==null){ //if head is null then rerutn head
      return head;
    }
    
    if(position==0) head= head.next;   // if delete head.
    if(position<0 || position>size(head)){  // if position <size OR >size
      return head;
    }
    
    for(int i=1; i<position; i++){
      temp= temp.next;
    }
    temp.next =  temp.next.next;
    
    return head;
    
    // 2nd way.    both working.
//       if(position ==0)
//       {
//         head= head.next;
//       }
//       else
//       {
//         Node curr =head;
//         for(int i=1;i<position;i++)
//           {
//             curr = curr.next;
//           }
//         curr.next= curr.next.next;
//       }

// return head;
    
  }
}
class Node{
  Node head;
  int data;
  Node next;
 
  Node(int data){
    this.data = data;
    next = null;
  }
}

