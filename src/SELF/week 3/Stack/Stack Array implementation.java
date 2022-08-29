package Stack;

class Stack{
    int[] arr;
    int currIndex ;
    Stack(int maxSize){
        arr  = new int[maxSize];
        currIndex = -1;
    }

    void push(int element){
        currIndex++;
        arr[currIndex] = element;
    }

    // return the value at the top of the stack.
        int peek(){
        return arr[currIndex];
        }

        // return the top element and it also returns the value removed.
    int pop(){
        if(isEmpty()){
            System.out.println("can not pop");
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
