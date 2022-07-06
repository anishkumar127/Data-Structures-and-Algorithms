package com.company.Test;

public class TestCode {
    Node head;
    private int size;
    TestCode(){
        this.size =0;
    }

// starting code function.
        public void addLast(int data){
            Node newNode = new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            Node current =head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = newNode;
        }
        // reverse the linked list.
    public void reverse(){
        if(head ==null || head.next==null){
            return;
        }
      Node prev = head;
        Node current = head.next;
        while(current!=null){
            Node next  = current.next;
            current.next = prev;

            //update
            prev = current;
            current=next;
        }
        head.next = null;
        head=prev;
    }
public Node middle(){
        if(head==null){
            return null;
        }
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
}
    public void display() {
            Node current = head;
            while(current!=null){
                System.out.print(current.data+" -> ");
                current=current.next;
            }
            System.out.print("null");
    }

// ............ starting node class.
    class Node {
        int data ;
        Node next;
        Node(int data){
            this.data = data;
            this.next =null;
            size++;
        }
    }
}

// main 

package com.company.Test;

public class Main {
    public static void main(String[] args) {
        TestCode list = new TestCode();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.display();
        System.out.println();

        // reverse
        list.reverse();
        list.display();

        // middle
      TestCode.Node resultMiddle = list.middle();
        System.out.println(resultMiddle.data); // 3
    }
}
