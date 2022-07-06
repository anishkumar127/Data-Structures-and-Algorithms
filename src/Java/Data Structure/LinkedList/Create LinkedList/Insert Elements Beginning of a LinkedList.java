package com.company.LinkedList;

public class CreateLinkedList {
    Node head; // linked first elements is head. it has data and reference of next node.
    public static void main(String [] args){
        // Representing
        CreateLinkedList create= new CreateLinkedList(); // instance of CreateLinkedList.
        create.head = new Node(10); // Head first node is 10;
        Node second = new Node(80);
        Node third = new Node(70);
        Node forth = new Node(40);
        create.head.next=second;
        second.next = third;
        third.next=forth;
        System.out.println(create.head);

        // insert elements beginning of a linked list.
        create.insertAtFirst(5); // add 5 of the beginning.
        System.out.println(create.head); // print the current head node.
    }
private void insertAtFirst(int n ){
        Node newNode = new Node(n); // new node. we will create.
    Node node = head; // current node;
    newNode.next=head; // newNode point to head . old
    // old head 10 and newNode 5
    // after that head 5 and NewNode 10;
    head=newNode; // head will be new node.
    // nothing to return. just swapping.
}
}
