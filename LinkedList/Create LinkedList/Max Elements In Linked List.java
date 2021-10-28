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
// find max Elements.
//        create.findMaxElements(); // find max elements.

        int max= create.findMaxElements();
        System.out.print(max); // output: 80
    }
private int findMaxElements(){
        int max = 0;
        Node node = head;
        while(node !=null){
            if(node.data>max){ // if first node data greater than max;
                max = node.data; //  max value put data first elemens of node
                // 10 greater then max 0;
                // 10 greater then 80 yes max 80;
                // 80 greater then 70; no max 80;
                // 80 greater then 40; no max 80
               // last node null. loop exit
            }
            node = node.next; // linked list keep traversing.
        }
        return max; // returning the max it will be int.  output: 80
}}
