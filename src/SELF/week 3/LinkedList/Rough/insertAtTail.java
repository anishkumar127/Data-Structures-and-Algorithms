package LinkedList;

import java.util.Scanner;

public class InsertFirstLL {
    private static class Node {
        int data;
        Node next;

        // constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int data = 0;
        // Scanner -> taking input
        for (int i = 0; i < 5; i++) {
            data = sc.nextInt();
//            head = insertAtHead(head, data);
            head = insertAtTail(head,data);
        }

        // printing the linked list.
        display(head);
    }

    // insert at last.
    private static Node insertAtTail(Node head, int data){
        Node newNode = new Node(data);
        // edge case.
        if(head==null){
            return newNode;
            //   OR
//            head = newNode;
//            return head;
        }
        Node current_head= head;
        while(current_head.next!=null){
            // move forward. move to next node.
            current_head=current_head.next;
        }
        // when this loop stops current_Node is the tailNode.
        current_head.next=newNode;
        return head;
    }
    // printing the node.
    private static void display(Node head){
        Node current_head = head;
        while(current_head!=null){
            System.out.print(current_head.data+" -> ");
            current_head  = current_head.next;
        }
        System.out.print("null");
    }
}
