// approach 1

/*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/
/*
below function is used to insert nodes in the linked list

1 2 3 4 4 5 7 9

// head = 1

// head = 1->2->3, val = 3
//

public static Node insert111(Node head, int val) {
        if(head == null) {
            return new Node(val);
        } else {
            Node cur;
            cur = insert111(head.next, val); //new Node(2)
            head.next = cur;
            return head;
        }
    }
*/

// 1 2 3 4 5 
// 4 7 9
// 1 2 3 4 4 5 7 9
public static Node Merge (Node head1, Node head2){
    Node head = null;
    while(head1 != null && head2 != null){ //head1 = null head2 = 7
        if(head1.val <= head2.val){
            head = insert111(head, head1.val);
            head1 = head1.next;
        }
        else{
            head = insert111(head, head2.val);
            head2 = head2.next;
        }
    }
    while(head1 != null){
        head = insert111(head, head1.val);
        head1 = head1.next;
    }
    while(head2!=null){
            head = insert111(head, head2.val);
            head2 = head2.next;        
    }
    return head;
}









// approach 2


if(head1 == null) return head2;
 if(head2 == null) return head1;
 
 if(head1.val> head2.val){
   Node temp = head1;
   head1 = head2;
   head2=temp;
 }
 Node res=head1;
 
 while(head1 != null && head2 !=null){
   Node temp2 =null;
   while(head1 !=null && head1.val <= head2.val){
     temp2 = head1;
     head1=head1.next;
   }
   temp2.next=head2;
   
   //swap
   
   Node temp = head1;
   head1 = head2;
   head2= temp;
 }
  return res;
  
  
  // approach 3 dry run.
  
  public static Node Merge (Node head1, Node head2){
//Enter your code here
if(head1 == null) return head2; // head1 null then return head2;
 if(head2 == null) return head1; // head2 is null then return head1;
 
 if(head1.val> head2.val){ // if head1 is greater then head 2; then i have to swap.
 // bcz head1 will be smaller one. like 1 2 3 4 , 1 is always smaller then next one.

// swapping.
   Node temp = head1; // head store in temp .
   head1 = head2; // assign head2 value in head1;
   head2=temp; // in head2 we assiging head1. 
   //  example 2 1
   /* 
    head1 is 2;
    head2 is 1;
    temp = head1;
    2= 2;
    head1 = head2;
    1 = 1;
    head2=temp;
    2 =2;
    now head1 1 and head2 is 2;
    now head1 will be smallest one and head2 will be larger one. 1st iteration.
   */
 }
 Node res=head1;  // head1 keep in result. 
 
 while(head1 != null && head2 !=null){
   Node temp2 =null; // assign a temp null;
   while(head1 !=null && head1.val <= head2.val){
     // head1 is 1 and head2 is 2;
     // head1 not null till head1 value not less then and equal to head2 value.

     temp2 = head1; // assign head1 in temp bcz to be remember which was last node. for making connection.
// head1 assign in temp2; now temp2 is 1;
     head1=head1.next; // remove head1;
    //  now head1 next is null. and now head1 will be null.
   }
   temp2.next=head2; // null ka next head2.
  //  temp2 was 1  now 1 next is head2.

   
   //swap
   
   Node temp = head1;
   // head1 = 2; temp will be 2;
   head1 = head2;
   // head2 1 now head1 1;
   head2= temp;
   // head2 was 1; and temp2; so now head2 2;
   /*
   2 = 2
   1 = 1
   2 = 2

   head1 1 head2 2
   */
 }
  return res;
  // return head1;
