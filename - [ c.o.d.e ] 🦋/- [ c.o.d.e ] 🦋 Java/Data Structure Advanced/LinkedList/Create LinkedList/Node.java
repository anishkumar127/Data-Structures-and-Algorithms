package com.company.LinkedList;

public class Node {
    int data ; // put data in linked list.
    Node next; // same of class name.

    public Node(int data){ // constructor.
        this.data = data; // data in linked list.
        this.next=null; // by default null.
    }
    @Override
    public String toString(){
        return "Node [data= "+ data + ", next= "+next+"]";
    }
}
