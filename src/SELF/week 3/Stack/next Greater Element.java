package Stack;

import java.util.Scanner;
import java.util.*;
import java.util.Stack;

public class nextGreaterElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextLong();
        }
        // store ans
        long[] ans = new long[n];
        // stack
        Stack<Long> st = new Stack<>();
        for(int i=n-1; i>=0; i--){
            long current_value = arr[i];
            if(i==n-1){
                // we are at the last element.
//                System.out.println("-1");
                ans[i] = -1;
            }else{
                    while(!st.isEmpty() && st.peek()<current_value){
                        st.pop();
                    }
                    if(st.isEmpty()){
//                        System.out.println("-1");
                        ans[i] = -1;
                    }else{
//                        System.out.print(st.peek()+" ");
                        ans[i] = st.peek();
                    }
            }
            st.push(current_value); // push into stack.
        }

        // print
        for(int i=0; i<n; i++){
            System.out.print(ans[i]+" ");
        }

    }
}
