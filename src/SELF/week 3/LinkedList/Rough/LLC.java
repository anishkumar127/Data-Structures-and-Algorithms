package LinkedList;

public class LLCLP {
    private static class Node{
        int data ;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
            Node head  = new Node(1);


    }
    // inserting at kth position.
    public static Node insertAtkth(Node head, int k, int data){
        /*
        * k> length
        * k<-1
        * insert at when node null
        * insert at last.
        * only one element in LL.
        * if LL is empty.
        * */
        Node current = head;
        Node prev = null;
        Node newNode = new Node(data);
//        edge case.
        if(k==1){
            // insert at head.
            newNode.next = head;
            return newNode;
        }
        // move forward k-1 times.
        for(int i=0; i<k-1; i++){
            // move forward
            prev = current; // prev node become current node because prev initial null. we have to put node into prev.
            current = current.next;
        }
        // after this current Node is the kth Node.
         prev.next = newNode;
        newNode = current;
        return head;
    }
    // delete head node.
    // delete last node.
    private static Node deleteLast(Node head){
        // edge case.
        if(head==null || head.next == null) return null;

        // go to the tail node and also maintain the prevNode.

        Node prev = null;
        Node current = head;
        while(current.next!=null){
            // move forward.
            prev = current;
            current=current.next;
        }
        // current node is tail.
        prev.next= null;
        return head;
    }
  // delete kth node.
    private static Node deleteKTH(Node head){
        // edge case.
        Node current = head;
        Node prev = null;

        return head;
    }
    // delete the middle node.
    private static Node deleteMiddle(Node head){
        if(head==null || head.next==null) return null;
        Node slow =head;
        Node fast = head;
        Node prevOfSlow = null;
        while(fast!=null && fast.next!=null){  //fast.next we are standing at tail node don't move forward.
            prevOfSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        // slow is the  middle Node.
        prevOfSlow.next = slow.next;
        return head;
    }

    // reverse linked list.
    private static void PrintReverseOrder(Node head){
        // base case
        if(head == null) return ;
        PrintReverseOrder(head.next);
        System.out.print(head.data);
    }
}
