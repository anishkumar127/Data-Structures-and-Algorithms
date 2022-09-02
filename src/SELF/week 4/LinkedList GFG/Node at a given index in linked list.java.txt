
/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/
class GfG
{
   
    public static int getNth(Node node, int ind)
    {
       //Your code here
      
       Node current_node = node;
       int idx=0;
     for(int i=1; i<=ind; i++){
         if(ind==i){
            idx =current_node.data;
         }
         
         current_node = current_node.next;
     }
     
     return idx;
    }
}





// comments

class GfG
{
    public static int getNth(Node node, int ind)
    {
       int i = 0;
       while(node != null) {
           i++;
           if(i == ind) return node.data;
           node = node.next;
       }
       return -1;
    }
}

//

 int result = -1;
       Node temp = node;
       int len = 0;
       
       while(temp != null){
           len++;
           if(len == ind){
               result = temp.data;
               break;
           }
           temp = temp.next;
       }
       return result;
       
       
