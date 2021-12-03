

public class LL {
    private Node head;
    private Node tail; // benefits O(1); if extra vairable tail. no need to traverse for insert at the last.
    private int size;
    public LL(){
        this.size=0;
    }
    // addFirst
    public void addFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node; // making head 1st.
        if(tail ==null){
            tail = head; // tail also pointing to the head;
        }
                size+=1;
    }
    // addLast
    public void addLast(int value){
        if(tail ==null){  // if tail es empty then put addlast in the first. and then simmply return;
            addFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail=node;

        size+=1;
    }

    // add on the specific position.
    public void position(int value ,int index){
        if(index ==0){
            addFirst(value);
            return;
        }
        if(index ==size){
            addLast(value);
            return;
        }
        Node temp = head;
        for(int i =1; i<index; i++){ // go to one -
            temp = temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next = node;
        size+=1;
    }

    // delete First
    public int deleteFirst(){
int val = head.value;
   head = head.next; // now head is head.next and head in null.
   if(head ==null){
       tail =null;
   }
   size --;
   return val;
    }
    // delete last. tc. O(N);
    public int deleteLast(){
 if(size <=1){
     return deleteFirst();
 }
 Node secondLast = get(size-2);
 int val = tail.value;
 tail =secondLast;
 tail.next = null;
 return val;
    }
// delete at position.
public int deletePosition(int index){ // tc O(N);
        if(index ==0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
                prev.next = prev.next.next;
        return val;
}
public Node find(int value){ // Tc O(N);
        Node node = head;
        while(node!=null){
            if(node.value == value){
                return node;
                // int. return node.value;  and return -1;
            }
            node = node.next;
        }
    return null;
}
    // reference get.
    public Node get(int index){ // reference
        Node node = head;
        for(int i=0; i<index; i++){
            node = node.next;
        }
        return node;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public class Node {
    private int value;
    private Node next;
    public Node(int value){
        this.value = value;

    }
    public Node ( int value , Node next){
        this.value = value;
        this.next = next;
    }

}
}