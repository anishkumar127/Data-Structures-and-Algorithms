
class MyStack 
{
    // class StackNode {
    //     int data;
    //     StackNode next;
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    // }   
    StackNode top;
    
    //Function to push an integer into the stack.
    void push(int a) 
    {
       
        StackNode new_node = new StackNode(a);  // creating new stack node. 
        
      // order maintain.  first newNode.next put the top. and after that put newnode inside the top.
       new_node.next = top;
       top = new_node;
        
    }
    
    //Function to remove an item from top of the stack.
    int pop() 
    {
        
        if(top ==null){
            return -1;
        }
        int removed = top.data;
        top = top.next;
        return removed;
    }