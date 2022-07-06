package com.company.LinkedList;
import java.util.*;
public class CreateLinkedList {
    Node head; // linked first elements is head. it has data and reference of next node.
    public static void main(String [] args){
        // Representing
        CreateLinkedList list= new CreateLinkedList(); // instance of CreateLinkedList.
//      list.push(10);
//      list.push(20);
//      list.push(30);
//      list.push(40);
//        list.push(10);
list.head = new Node(10);
Node second = new Node(20);
Node third = new Node(30);
Node forth = new Node(40);
list.head.next=second;
second.next = third;
third.next=forth;
      list.display();
System.out.println();
      boolean isExits = list.Search(10);
      System.out.print(isExits);

    }
private boolean Search(int key){
        Node current = head;
        while(current!= null){
            if(current.data==key){
                return true;
            }
            current = current.next;
        }
        return false;
}
    public void display(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data+"-> ");
            current = current.next;
        }
        System.out.print("null");
    }

}
