package LinkedList;
public class LLTD1 {
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

        Node head = null;
        for(int i=0; i<=5; i++){
            head = insertNodeAt(head,i,i*10);
        }
        display(head); // 0 -> 10 -> 20 -> 30 -> 40 -> 50 -> null

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
    // add At - index.
    private static  Node insertNodeAt(Node head,  int idx,int data ){
        // edge case.
        if(idx>size(head) || idx<0 ) return  head;
        if(head==null || idx ==0) return addFirst(head,data);
        Node newNode = new Node(data);
        Node before = getNode(head,idx-1);
        Node after = before.next;

        before.next = newNode;
        newNode.next = after;
        return head;
    }
    // edge case
    /*
     * empty    [x]
     * single   [x]
     * at last  [x]
     * at first [x]
     * at middle something middle  [x]
     * */

    // add first
    private static Node addFirst(Node head,int data){
        Node newNode = new Node(data);
        newNode.next= head;
        return newNode;
    }
    // get Node at index
    private static int getNodeAt(Node head, int idx){
        Node current = head;
        int currentIndex = 0;
        while(current!=null){
            if(currentIndex==idx) return current.data;  // return value which present at index 3.
            currentIndex++;
            current=current.next;
        }
        return -1;  // if not present return -1;
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
