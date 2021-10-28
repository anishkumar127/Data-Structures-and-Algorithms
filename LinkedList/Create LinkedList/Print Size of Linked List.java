package com.company.LinkedList;

public class CreateLinkedList {
    Node head; // linked first elements is head. it has data and reference of next node.

    public static void main(String [] args){

       // Representing
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

        // Traversing . print elements.

        create.printLinkedList(); // printing the linked list.

        // linked list size.

//        create.size();
        System.out.println(create.size()); // output: 4

    }
    private void printLinkedList(){
Node node = head; // head has all the data of linked list. even reference of next node.

System.out.println(node.next.data); // output: 20;
System.out.println(node.data); // output: 10;
System.out.println(node.next.next.data); // output 30;

        // print via loop.
        // don't know end condition. so we use while.
        while(node !=null){ // until node not equal to null. condition working.
            System.out.print(node.data+" "); // output: 10 20 30 40
            node = node.next; // increasing node.
        }
    }

    private int size(){ // linked List Size.
        Node node = head;
//        for count the size of the linked list we have to traverse the linked list. one by one
        int count =0;  // count the elements.
        while(node !=null){
            node = node.next;
            count ++;
        }
        return count; // output: 4
    }
}
