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





You are given an array (Arr) of N Distinct integers. You have to find the sum of minimum element of all the subarrays (continuous) in that array. See Sample for better understanding.

Input
The first line of input contains N, the size of the array.
The second line of input contains N space-separated integers.
Constraints
2 ≤ N ≤ 100000
1 ≤ Arr[i] ≤ 1000000000
Expected Time Complexity: O(n)
Output
The output should contain single integers, the sum of minimum element of all the subarrays in that array.

Example
Sample Input

4
3 1 2 4
Sample Output

17
Explanation

Subarrays are [3], [1], [2], [4], [3, 1], [1, 2], [2, 4], [3, 1, 2], [1, 2, 4], [3, 1, 2, 4]. Minimums are 3, 1, 2, 4, 1, 1, 2, 1, 1, 1. Sum is 17.
Sample Input

4
1 2 3 4
Sample Output

20