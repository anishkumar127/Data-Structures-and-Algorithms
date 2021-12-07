public void deleteAlternate (Node head){
 Node curr = head;
      if(curr == null){
          return;
      }
      while(curr !=null && curr.next!=null){
 curr.next = curr.next.next;
          curr = curr.next;
      }
}

/*
Input:
LinkedList: 1->2->3->4->5->6
Output: 1->3->5
*/