package LinkedList;

import java.util.LinkedList;

public class tail {
    private class Node{
        int data;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;

    public static void main(String[] args) {
        tail list = new tail();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.display();
    }
    private void addLast(int item){
        // create a new node.
        Node newNode = new Node();
        newNode.data = item;
        newNode.next  = null;

        // attach
        if(this.size >=1){
            this.tail.next = newNode;
        }

        if(this.size ==0){
            this.head = newNode;
            this.tail= newNode;
            this.size++;
        }else{
            this.tail=newNode;
            this.size++;
        }
    }

    private void display(){
        Node current_node = this.head;
        while(current_node!=null){
            System.out.print(current_node.data+" -> ");
            current_node=current_node.next;
        }
        System.out.print("null");
    }

}
