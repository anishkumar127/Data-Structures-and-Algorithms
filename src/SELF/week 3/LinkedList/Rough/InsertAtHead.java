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
            head = insertAtHead(head, data);
        }

        // printing the linked list.
        display(head);
    }
    private static Node insertAtHead(Node head, int data){
            Node newNode = new Node(data);
            newNode.next = head;
            return newNode;
    }

    private static void display(Node head){
        Node current_head = head;
        while(current_head!=null){
            System.out.print(current_head.data+" -> ");
            current_head  = current_head.next;
        }
        System.out.print("null");
    }
}


