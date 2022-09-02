
/* Structure of LinkedList
class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
*/
class GfG
{
    boolean isCircular(Node head)
    {
	// Your code here	
	if(head==null) return true;
	if(head.next ==null) return false;
	
	Node current_node=head;
	while(head!=null){
	   if(head.next==current_node) return true;
	   
	   head= head.next;
	}
	return false;
    }
}