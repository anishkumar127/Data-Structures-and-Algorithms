https://practice.geeksforgeeks.org/problems/print-linked-list-elements/1?page=1&difficulty[]=-2&difficulty[]=-1&category[]=Linked%20List&sortBy=submissions


/* Node is defined as
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution
{
    // Print elements of a linked list on console
    // head pointer input could be NULL as well
    // for empty list
    void display(Node head)
    {
        //add code here.
        Node current_node =head;
        while(current_node!=null){
            System.out.print(current_node.data+" ");
            current_node = current_node.next;
        }
    }
}


