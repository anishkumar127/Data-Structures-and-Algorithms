import java.util.*;

public class Linked{
  Node head;
 private int size;
 Linked(){
   this.size =0;
 }
  class Node {
  int data ;
  Node next;
  
  Node(int data){
    this.data = data;
    this.next =null;
    size++;
  }
  
}
// add first.
public void addFirst(int data){
  Node newNode = new Node(data);
  if(head==null){
    head = newNode;
    return;
  }
  
  newNode.next = head;
  head = newNode;
}

// add last. 

public void addLast(int data){
  Node newNode = new Node(data);
  if(head==null){
    head = newNode;
    return;
  }
   Node currNode = head;
   while(currNode.next!=null){
    currNode = currNode.next;
   }
   currNode.next = newNode;
}
// display.
private void display(){
  if(head ==null){
    System.out.print("list is empty!");
    return;
  }
  Node currNode = head;
  while(currNode!=null){
    System.out.print(currNode.data+" -> ");
    currNode = currNode.next;
  }
  System.out.print("null");
}

// delete first
public void deleteFirst(){
  if(head==null){
    System.out.print("list is empty");
    return;
  }
  size--;
 head = head.next;
}

// delete last 
public void deleteLast(){
  if(head==null){
    System.out.print("list is empty!");
    return;
  }
  size--;
  if(head.next==null){
    head = null;
    return;
  }
  Node secondLast = head;
  Node lastNode = head.next;
  while(lastNode.next!=null){
    lastNode = lastNode.next;
    secondLast = secondLast.next;
  }
  secondLast.next = null;
}
// size 
public int getSize(){
  return size;
}
// delete position. 

// position insert 
public void position(int data ,int index){
        if(index ==0){
            addFirst(data);
            return;
        }
        if(index ==size){
            addLast(data);
            return;
        }
        Node temp = head;
        for(int i =1; i<index; i++){ // go to one -
            temp = temp.next;
        }
        Node newNode = new Node(data);
        temp.next = newNode;
        size+=1;
    }

    public static void main(String[] args) {
        Linked list = new Linked();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);
        // list.deleteFirst();
        // list.deleteLast();
    System.out.println(list.getSize());
    list.position(81,2);
        list.display();
        
    }
}