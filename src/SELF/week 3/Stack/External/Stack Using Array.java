package Stack.Course;

public class StackUsingArray {
    /*

    basic stack method.
    size , isEmpty , push , pop , display, top (peek);
time complexity.
size O(1)
isEmpty O(1)
push O(1);
top O(1);
pop O(1);
display O(n);

stack use in  browsers   <- -> in this use this functionality.
 index value
    4 0
    3 0
    2 0
    1 0
    0 0
   top -1

 - push operation
  push(int value){

  // index out of bound exception.
  if(this.size()==data.length) {
  throw new Exception();
  this.top ++;
  this.data[this.top] = value;     data[top] = value.
 - stack.push(10);  stack.push(20); , stack.push(30);

 - pop operation.

    pop(){
    // if don't have value in stack. and we doing pop so have to throw exception.
    if(top==-1){
    }
    int remove = this.data[this.top];   // return value of value top.
    this.data[this.top] = 0;            // put value zero at top 0;
    this.top--;                             // decrease the top.
    return remove;



we use default capacity in constructor1. if user don't put capacity. then default capacity will follow by constructor.
if use pass capacity then we handle edge cases. if capacity less then 1. <1. means its 0 or -1 below.
     */

    // code
    private int[] data;
    private int top;

    public static final int DEFAULT_CAPACITY=5;
    // constructor.
//    if user don't pass capacity.
    public StackUsingArray() throws Exception{
        this(DEFAULT_CAPACITY);
    }

    // if user pass capacity.  // constructor.
    public StackUsingArray(int capacity) throws Exception{
        if(capacity<1){
            throw new Exception("Invalid Capacity");
        }

        this.data = new int[capacity];    // array will be capacity size.
        this.top =-1;                     //  if no elements inside stack initially -1;
    }
    public int size(){
        return this.top+1;
    }

    public boolean isEmpty(){
        return this.size()==0;
    }

    public void push(int value) throws Exception{
        if(this.size()==this.data.length){
            throw new Exception("Stack is Full");
        }
        this.top++;
        this.data[this.top] = value;
    }

    public int pop() throws Exception{
        if(this.size()==0){
            throw new Exception("Stack is Empty");
        }
        int removed = this.data[this.top];   // store top element.
        this.data[this.top]=0;                  // put 0 value at top element.
        this.top--;                             // decrease top.
        return removed;                         // return stored top element. it is deleted now.
    }
    public int top() throws Exception{
        if(this.size()==0){
            throw new Exception("Stack is Empty!");
        }
        int peek = this.data[this.top];
        return peek;
    }
    public void display(){
        for(int i=this.top; i>=0; i--){
            System.out.print(this.data[i]+" ");
        }
        System.out.println("END");
    }

    public static void main(String[] args) throws Exception {
        // client getting data.

        StackUsingArray stack = new StackUsingArray();

     /*   stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.display(); */ // instead of doing this i can do using for loop also.

        for(int i=1; i<=5; i++){
        stack.push(i*10);
        stack.display();
    }
//        stack.push(60); throw exception stack is full.
//        stack.push(70);

        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());

        // also can do pop as a loop
      /*  while(!stack.isEmpty()){
            stack.display();
            stack.pop();
        }
        System.out.println(stack.pop());
        */

    }
}
