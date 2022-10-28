import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
       Scanner input = new Scanner(System.in);
        int mod = 1000000007;
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }

      // 2 4 3 5 6 1
      int left[] = new int[n];
      int right[]=new int[n];

      Stack<Integer> stack=new Stack<>();
      for(int i=0;i<n;i++){

        while(stack.isEmpty()==false    &&  a[stack.peek()]>=a[i]  ){
          stack.pop();
        }
        if(stack.isEmpty()){
          left[i]=i+1;
        }
        else{
          left[i]=i-stack.peek();
        }
        stack.push(i);
        
      }

       stack = new Stack<>();
        for(int i = n - 1; i >= 0; i--){
            while(stack.isEmpty() == false && a[stack.peek()] > a[i])
                stack.pop();
            if(stack.isEmpty()){
                right[i] = n - i;
            }else{
                right[i] = stack.peek() - i;
            }
            stack.push(i);
        }

      long ans=0;
      for(int i=0;i<n;i++){
        ans+= (long)a[i]*left[i]*right[i] % mod;
        ans%=mod;
      }

      System.out.println(ans);

      

      
        
    }
}


Given an array of integers arr, find the sum of the minimums of all contiguous subarrays of the array. Since the answer may be large, print the answer modulo 10^9 + 7.

Input Format
The first line contains a single integer n(size of the array) The second line contains n space integers that denote the elements of the array

Output Format
Print the sum of minimum of all subarrays

Example 1
Input

4
3 1 2 4
Output

17
Explanation

Subarrays are [3], [1], [2], [4], [3,1], [1,2], [2,4], [3,1,2], [1,2,4], [3,1,2,4]. Minimums are 3, 1, 2, 4, 1, 1, 2, 1, 1, 1. Sum is 17.

Example 2
Input

5
11 81 94 43 3
Output

444
Constraints
1 <= arr.length <= 3 * 10^4 1 <= arr[i] <= 3 * 10^4