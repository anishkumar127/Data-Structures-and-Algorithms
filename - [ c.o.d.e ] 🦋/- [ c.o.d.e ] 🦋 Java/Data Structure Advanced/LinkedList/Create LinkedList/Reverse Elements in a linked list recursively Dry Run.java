// reverse 10 7 4;
Node reverse(Node head){
  // base case
  if(head == null || head.next == null){
    return head;
  }
  Node newHead = reverse(head.next); // recursion. 
  // head.next 10 ka next  = 7 4; // recursive function call.
  
  // es function ka kaam h apne aap reverse krna or 
  // newHead return krna. 
  // now 4 es newHead;
  // now 4 don't have null  4 pointing to 7 
  
  Node headNext = head.next;
  // head.next was 7. 
  // headNext me assign kr denge head.next = 7 ko.
  headNext.next = head;
  // headNext.next is 10; and head is 10;
  // how. headNext is 7  and reverse way 7 pointing to 10 so HeadNext.next is 10;
  // so we head 10 assign to headNext.next me 
  
  head.next= null;
  // now head is 10 
  // when do head.next  head.next will be point null bcz we'r assiging null to head.next;
  
  return newHead;
  // newhead 4 7 10;
}