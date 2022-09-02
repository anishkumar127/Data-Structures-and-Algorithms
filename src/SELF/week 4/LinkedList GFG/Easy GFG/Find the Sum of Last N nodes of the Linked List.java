
/*
Node class is as follows:

class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}

*/

/*

1
2 2
1 2

3
*/

class Solution {
    
    //Return the sum of last k nodes
    public int sum(Node head, int k){
      //write code here
      if(head==null) return 0;
      Node current_node = head;
      int lastNodeSum = 0;
      int size =0;
      
      while(current_node!=null){
          size++;
          current_node  = current_node.next;
      }
      
      current_node = head;  // again starting from head.
      for(int i=0; i<size; i++){      // 2-2 <=0 , 6-3 = 3 
          if(size-k<=i){                    
              lastNodeSum+=current_node.data;
          }
          current_node = current_node.next;
      }
    
      return lastNodeSum;
    }
}




/*
Node class is as follows:

class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}

*/

/*

1
2 2
1 2

3
*/

class Solution {
    
    //Return the sum of last k nodes
    public int sum(Node head, int k){
      //write code here
      if(head==null) return 0;
      Node current_node = head;
      int lastNodeSum = 0;
      int size =0;
      
      while(current_node!=null){
          size++;
          current_node  = current_node.next;
      }
      
      current_node = head;
      for(int i=0; i<size; i++){
          if(size-k <=i){
          lastNodeSum += current_node.data;     
          }
         
          current_node = current_node.next;
      }
    
      return lastNodeSum;
    }
}

