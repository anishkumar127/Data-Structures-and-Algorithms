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

        // insert elements ending of a linked list.
        create.insertAtEnd(5); // add 5 of the beginning.
        System.out.println(create.head); // print the current head node.
    }
private void insertAtEnd(int n){
        Node newNode = new Node(n); // new node
        Node node = head; // current node
        while(node.next!=null){ //traverse until node.next null.
                node = node.next;
                // node.next 80
            //node 70 // node 40 / node null . loop terminate.
        }
        node.next = newNode;
        // node.next =null bcz of loop.
//    after that newNode = 5; assign 5 into node.next now node.next is 5;;
        // newNode 5;
//    node.next  // 5 =  5;
//node.next // 5
}
}
