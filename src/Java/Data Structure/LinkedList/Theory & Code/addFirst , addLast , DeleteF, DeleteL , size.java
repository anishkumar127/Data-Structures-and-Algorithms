import java.util.*;
// Linked List. 
public class LL {
  
  Node head; // creating head. 
  private int size;
  
  LL(){
    this.size = 0;
  }
  
  class Node { // node store data and next pointer. for that we represent as a class.
    String data;
    Node next ;
    
    Node(String data){ // constructor.
      this.data = data;
      this.next= null; // new node next always null. 
      size++; 
    }
  }
  // add - first , end ; 
  public void addFirst(String data){
    Node newNode  = new  Node(data); // create node .
    if(head==null){ // if head is null. 
      head = newNode; // put newNode data in head. 
      return;
    }
    newNode.next = head; // newNode.next pointing to head.
    head = newNode; // and head is now newNode;
   
  }
  // add last. 
  public void addLast(String data){
    Node newNode= new Node(data);
    if(head==null){
      head = newNode;
      return;
    }
    // traverse.. 
    Node  currNode = head;  // for not loosing the head.
    while(currNode.next !=null){
      currNode = currNode.next; // currNode node ka next then currNode node ka next. 
    }
    // when reached the last node. 
    currNode.next = newNode; // when currNode.next was null. then we put newNode then now currNode next is newNode;
  
    
  }
  
  // delete , deleteFirst, deleteLast ;
  public void deleteFirst(){
    if(head == null){// corner case 
      System.out.print("list is empty");
      return;
    }
    
    size--;
    head = head.next; // head ka next is head. 
  }
  
  // deleteLast ();
  public void deleteLast(){
    if(head ==null){ //corner case .
      System.out.print("list is empty");
      return;
    }
      size--;
    // we need to do travrse. 
    if(head.next ==null){  // when only 1 Node. // corner case.
      // then we do head null . 
      head = null;
      return;
    }
    Node secondLast = head; 
    Node  lastNode = head.next; // head.next = null -> lastNode = null. 
    while(lastNode.next !=null){ // null.next = got error. 
      lastNode= lastNode.next; // updating. 
      secondLast = secondLast.next; // updating.
    }
    secondLast.next = null; // when got secondLast we do null. 
  
  }
  
  
  // size linked list // don't need to travese to track the size.
  
  public int size(){
    return size;
  }
  
  
  //print 
  
  public void printList(){
    if( head == null){
      System.out.print("list is empty!");
      return ; 
    }
    Node currNode = head;
    while(currNode!=null){// we don't use currNode.next. if we do this. our last node will not print. 
      System.out.print(currNode.data+" -> "); // printing currNode.data. 
      currNode = currNode.next; // updating currNode node. 
    }
    System.out.print("null");
  }
    public static void main(String[] args) {
      // create own class object. 
      LL list = new LL();
      list.addFirst("a");
      list.addFirst("is");
      list.printList(); //is -> a -> null
      
      System.out.println();
      
      list.addLast("list");
      list.printList(); //is -> a -> list -> null

      System.out.println();
      
      list.addFirst("this");
      list.printList(); //this -> is -> a -> list -> null
      
      System.out.println();
      list.deleteFirst();
      list.printList(); // is -> a -> list -> null

      System.out.println();
      list.deleteLast();
      list.printList(); // is -> a -> null

      System.out.println();
      System.out.print(list.size()); // 2

    }
    
    
}