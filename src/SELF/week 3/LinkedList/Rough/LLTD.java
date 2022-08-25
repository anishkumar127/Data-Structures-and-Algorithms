package LinkedList;

public class LLTD {
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
          Node head =null;
          Node tail = null;
        for(int i=1; i<=5; i++){   // taking the input.
            if(head==null){
                head= new Node(i);
                tail=head;
            }else{
                Node temp = new Node(i);
                tail.next=temp;
                tail=temp;
            }
        }
        display(head);  // print

        System.out.println();

        System.out.println( size(head)); // size

        // get node at data.
        System.out.println(getNodeAt(head,3));

        // add first
       head=addFirst(head,11);  // after calling have to update the head.
        display(head);

        System.out.println();
        // add at idx.
//       addAt(head,2,108); // wrong code

        // add or insert node at
        insertNodeAt(head,2,108); // working code. edge cases cover.
        display(head);
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
    private static Node addAt(Node head, int idx, int data){    // wrong code.
        // edge case
        /*
        * empty    [x]
        * single   [x]
        * at last  [x]
        * at first [x]
        * at middle something middle  [x]
        * */
        if(idx==0) return addFirst(head,data);
     Node current = head;
     int currIndex = -1;
     while(current!=null){
         if(currIndex ==idx){
             // 2 -> 108  -> 3
             Node newNode = new Node(data);   // 108
             newNode.next = current.next;   //  108.next = 2.next  = 108 -> 3
             current.next = newNode;       // 2.next = 108        =  2 ->  108
         }
         current=current.next;
         currIndex++;
     }
     return head;
    }
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
