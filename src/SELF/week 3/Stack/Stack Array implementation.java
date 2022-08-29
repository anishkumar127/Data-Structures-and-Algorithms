package Stack;

class Stack{
    int[] arr;
    int currIndex ;
    int maxSize;
    Stack(int maxSize){
        arr  = new int[maxSize];
        this.maxSize = maxSize;
        currIndex = -1;
     }

    void push(int element){
        if(getSize()==this.maxSize){
            System.out.println("size is full can't insert");
            return;
        }
        currIndex++;
        arr[currIndex] = element;
    }

    // return the value at the top of the stack.
        int peek(){
        if(isEmpty()){
            System.out.println("can not peek, The stack is empty");
            return -1;
        }
        return arr[currIndex];
        }

        // return the top element and it also returns the value removed.
    int pop(){
        if(isEmpty()){
            System.out.println("can not pop, The stack is empty");
            return -1;
        }
        int value = arr[currIndex];
        currIndex--;
        return value;
        // return arr[currIndex--];
    }

    boolean isEmpty(){
        return currIndex==-1;
    }

//    return number of elements in the stack.
    int getSize(){ return currIndex+1; }
}
public class StackArrayImplemention {
    public static void main(String[] args) {
        Stack stack = new Stack(100);
        stack.push(1);
        stack.push(2);
        System.out.println("peek element -> "+stack.peek());
        System.out.println("pop element -> "+stack.pop());
        stack.push(3);
        System.out.println("pop element -> "+stack.pop());

        System.out.println("is stack empty -> " + stack.isEmpty());
        System.out.println("stack size -> "+stack.getSize());
    }
}
