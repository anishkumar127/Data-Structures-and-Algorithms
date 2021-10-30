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

public static Node addElement(Node head, int k ,int pos) {
    Node newNode = new Node(k); // in which k is 2; for that we create new node.
    //newNode ={k, null}
    // position is 3. 
    if(pos == 1 || head == null){ // position 0 se nahi 1 se lenge esme. 
    // in which position ager 1 hai . and head null hai. mean starting null hai.
    // so hum starting ke head me 2 ko insert kr denge new node ko. 
    // now head is 2.
        newNode.next = head;
        return newNode;
    }
    int i = 1; // esme also starting zero se nahi 1 se krenge. bcz question me 1 se hai. 
    Node temp = head; // head ko temp me store kr denge. 
    while(i < pos-1){  
    /*
    
    // loop running util i = 1 < pos meaning postion 3 - 1 = 2;  // 1 < 2;

    */
        temp = temp.next;
        /*
        1. temp is head and head is 1;
 2. temp.next 3;  so now head become  3;
 after that loop will be terminated because i++ =  1<2; 
        */
        i++; 
        /* 
        i ++ meaing i = 1 become i = 2; then loop will be terminated. 
        */
    }
    // now after the loop terminated. mean i<pos-1 = 1<2;
    // now exchange the link node.  
    newNode.next = temp.next;
    /*
    temp.next is 2; how ? bcz temp(head) is now 3 bcz of loop;
    so that temp.next is 2;
    // 
    newNode is 2; for now excume we can say that newNode now 44; okay;
so newNode.next 2;  bcz temp.next is 2 and we assign 2 in newNode 44 ka next so newNode 2;
    */
    temp.next = newNode;
    /*
    newNode is 2; but we excume for simplicity newNode is 44;
    and temp.next was 3. bcz of loop.
    so now temp.next is  2.
    so now temp.next is 2 or we were excuming for simplicity its 44;
    so temp.next 44; 

    now  1 3 44 2 4 5;
    and according to question its 1 3 2 2 4 5; 

    */
    return head;
}