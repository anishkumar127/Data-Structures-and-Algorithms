import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i=0; i<n;i++){
        arr[i] = sc.nextInt();
      }
      
     int x = sumofArrayRec(arr,n);
     System.out.println(x);
  }
   static int sumofArrayRec(int arr[], int n)
    {
       if (n <= 0)
            return 0;
        return (sumofArrayRec(arr, n - 1) + arr[n - 1]);
    }
}

/*
4
1 2 3 4
Output::

10

*/




Given an array of integers, find sum of array elements using recursion.

Input Format
Input consists of a 2 lines.

First line contains n.

Second line contains n spaced integers.

Output Format
Print the sum of array elements.

EXAMPLE 1
Input:

4
1 2 3 4
Output::

10
EXPLANATION:

1 + 2 + 3 + 4 = 10

EXAMPLE 2
Input:

3
1 3 3
Output::

7
EXPLANATION:

1 + 3 + 3 = 7.

CONSTRAINTS
1 <= n <= 10^5

-10^4 <= arr[i] <= 10^4