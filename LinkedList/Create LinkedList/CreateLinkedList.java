package com.company.LinkedList;

public class CreateLinkedList {
    Node head; // linked first elements is head. it has data and reference of next node.

    public static void main(String [] args){
        CreateLinkedList create= new CreateLinkedList(); // instance of CreateLinkedList.
        create.head = new Node(10); // Head first node is 10;

        Node second = new Node(20);
        Node third = new Node(30);
        Node forth = new Node(40);

        System.out.println(create.head); // output: Node [data= 10, next= null]

//        create self reference.
        create.head.next=second;
        System.out.println(create.head); // output: Node [data= 10, next= Node [data= 20, next= null]]

   second.next = third;
   System.out.println(create.head); // output: Node [data= 10, next= Node [data= 20, next= Node [data= 30, next= null]]]

        third.next=forth;
        System.out.println(create.head); // output: // Node [data= 10, next= Node [data= 20, next= Node [data= 30, next= Node [data= 40, next= null]]]]
// forth node pointing to null;
    }
}
