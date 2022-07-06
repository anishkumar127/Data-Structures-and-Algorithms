// intersection
public static Node intersection(Node head1,Node head2){
if(head1==null || head2==null){
    return null;
}
Node tail = head1;
while(tail.next!=null){
    tail = tail.next;
}
tail.next = head2; // modify
Node ans = Cycle(head1);
tail.next = null; // unmodify


    return ans;

}
// floid alog. like find cycle in linked list.
public static Node Cycle(Node head){
    if(head ==null || head.next ==null){
        return null;
    }
    Node slow = head;
    Node fast = head;
    while(fast!=null && fast.next !=null){
        slow = slow.next;
        fast = fast.next.next;
   
    if(slow==fast){
        break;
    }
     }
     if(slow!=fast){
         return null;
     }
     
     slow = head;
     fast = fast;
     while(slow!=fast){
         slow = slow.next;
         fast = fast.next;
     }
     return slow;
}