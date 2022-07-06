// 1 4 7 reverse this.
Node reverse (Node head){
  /* we create 2 pointer.
   curr=head; now curr is our head;
   
   hamesha prev node pehle hogi and uske aage wali node curr hogi reverse me.
   
   now prev = null hogi bcz hamari current node = head;
  */
  Node curr = head;
  
  Node prev = null;
  
  while(curr !=null){ // until current not equal to null.
    
    
    Node temp = curr.next;
    /*
    Node temp = curr.next;
    // 1 4 7
    current is 1; and curr.next is 4;
    so we store 4 in temp variable.
    bcz 4 wali node ko khone se pehle hum usko store kr lenge bcz hum node ko todenge reverse krne ke liye.
    so we save 4 in temp variable. 
    */
    curr.next = prev;
    
    /*
    curr.next = prev 
    prev was null.  so now curr.next will point to null. 
    
    1 -> 4 pehle. but we assign prev value in curr.next so now
    curr.next will be null. now 1st node point to null.
    
    */
    prev = curr;
    /*
    prev was null . but now hum curr jo 1 tha uski value prev me assign kr denge.
    so now prev is 1. 
    */
    curr= temp;
    /*
    now . temp was 4. 
    and curr was 1. 
    so now we assign temp in curr. then curr will be 4.
    so now curr is 4.
    */
  }
  /*
  now current point to 4. 
  we check in while loop. current is null. no current is not null. so we keep loop running.
  
  now again do same process.
  
  Noe temp = curr.next;
  current is 4. and current next is 7.
  so we store 7 in temp. 
  //
  curr.next= prev. 
      4    =  1
      1 = 1
  now curr is 4 and prev was 1.
  so now currnt ka next is 1. 
  
  //
  
  prev= curr;
    1    4 
    now 4 = 4
  so now 4 pointing to 1 ;
  //
  
  curr = temp;
  4 = 7;
  7 = 7;
  
  */
  return prev;
}