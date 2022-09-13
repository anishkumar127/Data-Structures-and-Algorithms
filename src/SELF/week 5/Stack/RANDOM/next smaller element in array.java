import java.util.*;

public class Main {
    public static void main(String[] args) {
     
        int arr[] = {7,8,1,4}; // output 8 -1 4 -1 
     int n = arr.length;
     int[] output = new int [n];
     
     Arrays.fill(output,-1);
     
   Stack<Integer> stack = new Stack<>();
  
    // traversing. and we are in stack pushing the indexes.
    for(int i=0; i<n; i++){
    while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){   // if arr[stack peek index]<arr[i current] 
    //then stack.pop peek and push the current bigger value.
      output[stack.pop()] = arr[i];
    }
    stack.push(i);  // pushing the index. in the stack.
  }

    for(int x:output)System.out.print(x+" ");
  }
}