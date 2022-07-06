package com.company.LinkListT;

public class LINKED {

    Node head;
    static class Node{
        int data ;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        LINKED list = new LINKED();
        int a[] = { 1, 2, 3, 4, 5 };
        Node h = convertArraytoList(a);
        while(h !=null){
            System.out.println(h.data + " ");
            h = h.next;
        }
    }
    public static Node convertArraytoList(int[] arr) {
        Node head =  null;
        int n = arr.length;
        /*
        // reverse order working when do add first.
        for(int i =n-1; i>=0; i--){
            head = addFirst(head,arr[i]);
*/
        for(int i =0; i<n; i++){
//          head=addLast(arr[i],head);
            head=addLast(head,arr[i]);
        }
        return head;
    }
    public static Node addLast(Node head,int data){
        Node newNode = new Node(data);
        if(head ==null){
            head = newNode;
          addFirst(head,data);
            return head;
//            return;
        }
        /* also working after modification. bcz i was returning crr.next=newnode that case failing after that. returning the head
        its working.
         */
        Node currentNode = head;
        while(currentNode.next !=null){
            currentNode = currentNode.next;
        }
         currentNode.next=newNode;
        return head;
        /*  working
        Node curr= head;
        while(curr.next!=null){
           curr= curr.next;
        }
        curr.next = newNode;
     return head;
         */
    }
    // sir your audio not working.

    public static Node addFirst(Node head,int data) {
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return head;
        }
        newNode.next = head;
       return head=newNode;
    }
//    public static Node reverse(Node head){
//        if(head==null || head.next)
//    }
    /*
    public static void display(Node head){
        if(head ==null){
            System.out.print("list is empty");
            return;
        }
        Node temp  = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
    */

}
