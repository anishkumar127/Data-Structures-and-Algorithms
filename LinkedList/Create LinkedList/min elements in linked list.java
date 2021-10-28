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
// find Min Elements.
//        create.findMixElements(); // find minimum elements.

      int  min = create.findMinElements();
      System.out.println(min); //output: 10

    }
    // worst case time complexity. no of elements. if 10 in last.
    // for find max or min elements our time complexity will be O(n);
    private int findMinElements(){
//        int min = 200; // i know not greater then 200;
//        OR
        int min = Integer.MAX_VALUE; // we no value greater then this. u can also do this.
        Node node = head;
        while(node !=null){
            if(node.data<min){
                min = node.data;
                // min 200;
                // 10 < 200 yes; min  10
                // 80 < 10 no ; min  10
                // 70 < 10 no ; min 10
                // 40 <10 no ; min 10
                // so min value is 10; output will be 10;
            }
            node = node.next; // traversing.
        }
        return min; // output: 10;

    }
}
