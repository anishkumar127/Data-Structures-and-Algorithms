
/*
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


*/
/*
2
6
1 2 3 4 5 6
2
5
2 7 9 3 5
3

1st. 6/2 = 3  is is 3.0;

3>1
head.next 2
2>1 head.next 3;
1>1 not return head.data= 3.

2nd

5/3 = 1
1>1 not but its decimal value. so 1.6 is greater than 1. so its go inside.
head.next 7.
0>1 not break loop.
head.data is 7.


*/
class GfG
{
    public static int nknode(Node head, int k)
    {
       
    //   float size = size(head);
       float kth = size(head) / k;
        while(kth>1){
            head = head.next;
            kth--;
        }
       return head.data;
    }
    private static float size(Node head){
        float count_Size = 0;
        Node current_node = head;
        while(current_node !=null){
              count_Size++;
            current_node = current_node.next;
        }
        
        return count_Size;
    }
}







// my code  on odd cases.

// my appraoch fail somewhere. wrong code.
class GfG
{
    public static int nknode(Node head, int k)
    {
       // add your code here
       int size = size(head);
       int kth = (int) Math.ceil(size/k);
      Node current_node = head;
    //   for(int i=0; i<kth; i++){
    //       current_node = current_node.next;
    //   }
    //   return current_node.data;
    int i=0;
    while(current_node!=null){
        i++;
        if(kth==i){
            return current_node.data;
        }
        
        current_node = current_node.next;
    }
    return -1;
       
    }
    private static int size(Node head){
        int count_Size = 0;
        Node current_node = head;
        while(current_node !=null){
            count_Size++;
            current_node = current_node.next;
        }
        
        return count_Size;
    }
}

