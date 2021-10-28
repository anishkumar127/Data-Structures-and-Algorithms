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
Node reverse = list.reverse();
System.out.println();
System.out.println(reverse);
    }
    public Node reverse(){
        Node p = head; // initi head;
        Node q = null;  // take two pointer / inti null p  and r = null
        Node r = null;
        while(p != null){ // run loop until p null.
            r = q;  //
            /*
            *  r = null q = null
            * now r=null;
            *  q null ; 10;
            * now q = 10;
            * p = 10 ; p.next = 20;
            * now p = 20;
            * q.next = null; r = null;
            * now q.next = null;
            *
            * q = null;
            * */
            q = p;
            p = p.next;
            q.next = r;
        }
        return q;
    }
    public void display(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data+"->");
            current = current.next;
        }
        System.out.print("null");
    }

}
