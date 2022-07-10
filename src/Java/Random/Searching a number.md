Searching a number
Given an array Arr of N elements and a integer K. Your task is to print the position of first occurrence of K in the given array.

Note: Position of first element is considered as 1.

Input
The first line contains two integers N and K.
The second line contains N spaced integers, elements of Arr.
Constraints
1 <= N <= 10^6
1 <= K <= 10^6
1 <= Arr[i] <= 10^6
Output
Print the position of first occurrence of K. If K is not present in the array, print -1.

Example
Sample Input

5 16
9 7 2 16 4
Sample Output

4
Explanation

K = 16 is found in the given array at position 4.

```
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
          Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
            int K = sc.nextInt();
       int Arr [] = new int [N];
       for(int i =0; i<N; i++){
         Arr[i] = sc.nextInt();
       }
      int ans = 0;
      for(int i=0; i<Arr.length; i++){
        if(Arr[i]==K)
        {
          ans = i+1;      
          break;
        }  
      }
      if(ans>=1){
        System.out.print(ans);
      }else{
        System.out.print(-1);
      }
	}
}
```