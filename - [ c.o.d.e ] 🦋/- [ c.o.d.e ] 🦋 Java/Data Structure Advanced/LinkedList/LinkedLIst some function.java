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
// middle in linked list. 

public Node middle(){
  if(head ==null){
    return null;
  }
  Node slow = head;
  Node fast = head;
  while(fast!=null && fast.next!=null){
    slow = slow.next;
    fast = fast.next.next;
  }
  return slow;
}
public Node nthNode(int n){
  if(head==null){
    return null;
  }
  if(n<=0){
    
    throw new IllegalArgumentException("invalid "+n);
    // return;
  }
  Node mainPointer = head;
  Node referencePointer = head;
  int count =0;
  while(count<n){
    if(referencePointer==null){
   throw new IllegalArgumentException(n+" is greater tahn the number of nodes in list");
 }
    referencePointer= referencePointer.next;
    count++;
  }
  while(referencePointer!=null){
 
    referencePointer = referencePointer.next;
       mainPointer= mainPointer.next;
  }
  return mainPointer;
}

// search

public boolean search(Node head, int key){
  if(head==null){
    return false;
  }
  Node current = head;
  while(current!=null){
    if(current.data ==key){
      return true;
    }
    current= current.next;
  }
  return false;
}

// length get 
public int length(){
  if(head==null){
    return 0;
  }
  int count =0;
  Node current = head;
  while(current!=null){
    count++;
    current= current.next;
  }
  return count;
}
// reverse linked list.
/*
public Node reverse(Node head){
  if(head==null || head.next==null){
    return head;
  }
  // Node current = head;
  // Node prev = null;
  // Node nextt = null;
  // while(current!=null){
  //   nextt = current.next;
  //   current.next = prev;
  //   prev = current;
  //   current = nextt;
  // }
  // return prev;
  // not. 
  // Node prevNode = head;
  // Node currNode = head.next;
  // while(currNode!=null){
  //   Node nextNode = currNode.next;
  //   currNode.next = prevNode;
  //   prevNode=currNode;
  //   currNode=nextNode;
  // }
  // head.next = null;
  // head = prevNode;
  // return head;
}
*/
// delete to given position. 

public void deleteGivenPosition(int position){
  if(position ==1){
    head = head.next;
  }else{
    Node prev = head;
    int count =1;
    while(count<position-1){
      prev = prev.next;
      count++;
    }
    Node current = prev.next;
    prev.next = current.next;
  }
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
        // middle
        Node middleNode = list.middle();
  System.out.print(middleNode.data);


  // nth node find 
  System.out.println();
Node findnthNode = list.nthNode(2);
System.out.print(findnthNode.data);

// search 
System.out.println();
Node curr = list.head;
if(list.search(curr,2)){
  System.out.print("found");
}else{
  System.out.print("NOT found");
}

System.out.println();

System.out.print(list.length()); // size 

// System.out.println();
// Node root = list.head;
// Node reversed = list.reverse(root);
//   Node display(reversed);
System.out.println();
list.deleteGivenPosition(2);
list.display();

    }
}