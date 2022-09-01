package LinkedList.Course;

import java.util.LinkedList;

public class LinkedListAsStack {
    /*
     Q. how to use linked list as a stack?

     linked list , Queue , Arrays.

     linked list   10    20    30  40  X

     10->20->30-40->END

     insert 50.
     insert 50 top of stack.
     it is add first.
        stack.
       | 50 |
       | 10 |
       | 20 |
       | 30 |
       | 40 |
       | END |
       ------
  display ->  50 - 10 - 20 -30 - 40 - end.
  push -> TC  O(1). because doing addFirst().

  push (60). ->  60 50 10 20 30 40 end.

  if stack is empty.
  push (10);

  pop -> O(1);
  push -> O(1);
  top -> O(1);

  pop()    -> removeFirst O(1).
  push()   ->  addFirst O(1).
  top()    ->  atFirst O(1).
  display() ->  O(n) -> simple linked list display function.
  isEmpty() ->  isEmpty function of linkedList.
  size()   ->   size of the linked list. size() function.

Note:-  in case use linked list form of stack.
   -  not given stack, given linked list. and we use linked list form of stack.

     */

    // code

    private LinkedListImplementation stack;
    // constructor.
    public LinkedListAsStack(){
        this.stack = new LinkedListImplementation();
    }

    public int size(){
         return this.stack.size();
    }
    public boolean isEmpty(){
        return this.stack.isEmpty();
    }
    public void push(int data){
        this.stack.addFirst(data);
    }
    public int pop() throws Exception{
        return this.stack.removeFirst();
    }
    public int top() throws Exception{
        return this.stack.getFirst();
    }
    public void display(){
        this.stack.display();
    }

    public static void main(String[] args) throws Exception{
        LinkedListAsStack stack = new LinkedListAsStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.display();
        System.out.println();
        System.out.println(stack.pop());

        System.out.println(stack.top());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
    }
}
