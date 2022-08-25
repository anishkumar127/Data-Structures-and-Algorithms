package LinkedList;

public class GetTail {
    private static class Node{
        int data;
        Node next;
        // constructor
        Node(int data){
            this.data=data;
            this.next=null;
        }


    }
    public static void main(String[] args) {

        Node head = null;  // if no node and node is null.
        for(int i=0; i<=5; i++){
            head = addFirst(head,i*10);
        }
        display(head); // 0 -> 10 -> 20 -> 30 -> 40 -> 50 -> null

        System.out.println();
        Node tail=  getTail(head);
        System.out.println(tail.data); // 0 

    }
    //    get tail
    private static Node getTail(Node head){
        if(head==null) return null;
        Node current = head;
        while(current!=null && current.next!=null){
            current=current.next;
        }
        return current;
    }



    // add first
    private static Node addFirst(Node head,int data){
        Node newNode = new Node(data);
        newNode.next= head;
        return newNode;
    }

    // get size
    private static int size(Node head){
        Node current = head;
        int length=0;
        while(current!=null){
            length++;
            current=current.next;
        }
        return length;
    }
    // print
    public static void display(Node head){
        Node current= head;
        while(current!=null){
            System.out.print(current.data+" -> ");
            current=current.next;
        }
        System.out.print("null");
    }
}
