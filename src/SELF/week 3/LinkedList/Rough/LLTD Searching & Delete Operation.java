package LinkedList;

public class LLTDFindandDeleteNode {
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
            head = addLast(head,i*10);
        }
        display(head); // 0 -> 10 -> 20 -> 30 -> 40 -> 50 -> null

        System.out.println();
        Node found = find(head,30);
        if(found==null)System.out.print("not found");
        else System.out.print("found : "+found.data);

        System.out.println();
        head =  deleteLast(head);
        display(head);

        System.out.println();
        head = deleteFirst(head);
        display(head);

        System.out.println();
       head = deleteNodeAT(head,2);
        display(head);

    }

    // find OR searching.
    private static Node find(Node head, int data){
        Node curr = head;
        while(curr!=null){
            if(curr.data==data) return curr;
            curr=curr.next;
        }
        return null;
    }
    // deleteFirst
    private static Node deleteFirst(Node head){
        if(head==null) return null;
        return head.next;
    }
    // deleteLast.
    private static Node deleteLast(Node head){
        if(head==null) return null;  // when node is empty.
        if(head.next==null) return null; // when only 1 node.
        Node prevTail = null;
        Node tail = head;
        while(tail.next!=null){
            prevTail  = tail;
            tail = tail.next;
        }

        prevTail.next = null;
        return head;
    }

    // delete Node At  1st approach
    private static Node deleteNodeAt(Node head, int idx){
        if(head==null) return null;
        if(idx<0 || idx>=size(head)) return head;
        if(idx==0) return deleteFirst(head);
        if(idx==size(head)) deleteLast(head);

        Node before = getNode(head,idx-1);
        Node after = getNode(head,idx+1);
        before.next = after;
        return head;
    }

    // detele node At 2nd approach.

    // delete Node At
    private static Node deleteNodeAT(Node head, int idx){
        if(head==null) return null;
        if(idx<0 || idx>size(head)) return null;
        if(idx==0) return deleteFirst(head);

        Node before = getNode(head,idx-1);
        Node after = (before!=null && before.next!=null)?before.next.next:null;
       if(before!=null) before.next = after;
        return head;
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

    // get node at node
    private static Node getNode(Node head, int idx){
        int currIndex =0;
        Node current = head;
        while(current!=null){
            if(currIndex==idx) return current;
            current = current.next;
            currIndex++;
        }
        return null;
    }

    // add Last
    private static Node addLast(Node head, int data){
        Node newNode = new Node(data);
        if(head==null) return newNode;
        Node current = head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
        return head;
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
