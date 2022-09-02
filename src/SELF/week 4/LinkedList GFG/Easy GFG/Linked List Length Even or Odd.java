
/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/
/* isLengthEvenorOdd method should return 0 if the length of LL is even 
   otherwise return 1.*/
class GFG
{
	int isLengthEvenorOdd(Node head1)
	{
	    
	    Node current_node = head1;
	    int length =0;
	    while(current_node!=null){
	        length++;
	        current_node = current_node.next;
	    }
	    
	    if(length%2==0) 
	    return 0;
	    else return 1;
	}
}