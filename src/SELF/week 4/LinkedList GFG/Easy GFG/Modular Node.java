
/*node class of the linked list is as:
class Node {
	int data;
     Node next;
     Node(int key)
     {
         data = key;
         next = null;
     }
}
*/
// Your task is to complete the function
// function should return the modular Node
// if no such node is present then return -1
class GfG
{
    public static int moduarNode(Node head, int k)
    {
        Node current_node = head;
        int data = -1;
        int i=0;
        while(current_node!=null){
            i++;        // 1 
            if(i%k==0){        // do maximum index % k 
                data = current_node.data;
            }
            current_node = current_node.next;
        }
        
       return data;
    }
}