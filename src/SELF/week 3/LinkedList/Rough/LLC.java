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
    public static void insertAtkth(Node head, int k, int data){
        Node current = head;
        Node prev = null;
        Node newNode = new Node(data);

        // move forward k-1 times.
        for(int i=0; i<k-1; i++){
            // move forward
            prev = current; // prev node become current node because prev initial null. we have to put node into prev.
            current = current.next;
        }
        // after this current Node is the kth Node.
         prev.next = newNode;
        newNode = current;
    }
}
