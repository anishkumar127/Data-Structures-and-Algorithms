

public class DLL {

        private Node head;
        private int size ;
    DLL(){
        this.size =0;
    }
    public void addFirstDLL(int value){
        Node node= new Node(value);
        node.next = head;
        if(head!=null){
            head.prev = node;
        }
        head = node;
    }
    // insert last.
    public void addLastDLL(int value){
        Node node = new Node(value);
        Node last   = head;
        node.next = null;
        if(head ==null){
            node.prev = null;
            head = node;
            return;
        }
        while(last.next!=null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;

    }
    // after particular value insert.
    public void afterInsert(int after, int value){
        Node p = find(after);
        if(p ==null){
            System.out.print("does not exist");
            return;
        }
        Node node = new Node(value);
        node.next = p.next;
        p.next= node;
        node.prev =p;
        if(node.next!=null) {
            node.next.prev = node;
        }
    }
    public Node find(int val){
        Node node = head;
        while(node!=null){
            if(node.value == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void display(){
        Node node = head;
        Node last = null;
        while(node!=null){
            System.out.print(node.value+" <-> ");
            last = node;
            node = node.next;
        }
        System.out.print("null");
        System.out.println();
        System.out.println("reverse printing");
        while(last!=null){
            System.out.print(last.value + " <-> ");
            last = last.prev;
        }
        System.out.print("null");
    }


   private class Node{
        int value;
        Node next;
        Node prev;

        public Node (int value){
            this.value = value;
        }
        public Node(int value,Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
