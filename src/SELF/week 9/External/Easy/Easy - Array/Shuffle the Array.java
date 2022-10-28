import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      int size = n*2;
      int arr[] = new int[size];
      for(int i=0; i<size; i++){
        arr[i] = sc.nextInt();
      }
      // System.out.print(Arrays.toString(arr));
      
      int Shuffled [] = new int[size];
      int idx=0;
      for(int i=0; i<n; i++){
        Shuffled[idx] = arr[i];
        Shuffled[idx+1]=arr[i+n];
        idx+=2;
      }
      
      for(int val:Shuffled) System.out.print(val+" ");
  }
}
/*
Input:
4
1 2 3 4 4 3 2 1 
Output:
1 4 2 3 3 2 4 1 
*/


Given the array, nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Print the array in the form [x1,y1,x2,y2,...,xn,yn].

Input
Input consists of the first line containing integer n followed by 2*n numbers for the array.

Constraints:
1 <= n <= 5000
-1000000 <= a[i] <= 1000000

Output
In a new line, print the array in the form [x1,y1,x2,y2,...,xn,yn].

Example
Input:
4
1 2 3 4 4 3 2 1 
Output:
1 4 2 3 3 2 4 1 
Input:
3
2 5 1 3 4 7
Output:
2 3 5 4 1 7 