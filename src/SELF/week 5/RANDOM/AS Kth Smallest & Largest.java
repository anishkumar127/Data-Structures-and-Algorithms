import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
      }
      int k = sc.nextInt();

      Arrays.sort(arr);
      // 3 4 7 10 15 20.
      
      int small = arr[k-1];
      int largest = arr[arr.length-k];
      System.out.println(small);
      System.out.println(largest);
	}
}



AS Kth Smallest & Largest
Write a program to print the Kth smallest and Kth largest element of array arr[]. Take input of an Array arr[] of size N from the user, followed by another integer K, where K is smaller than the size of the array. Use the array and integer K to find the Kth smallest and Kth largest number from the unsorted array. It is given that all elements of array are distinct

Input Format

Line 1 contains an integer N denoting size of array.
Line 2 contains N single spaced integers denoting the array elements.
Line 3 contains input of K.
Output Format

In line 1, print the Kth smallest element of array.
In line 2, print the Kth largest element of array.
Example

Input

6
7 10 4 3 20 15
4
Output

10 (This is the 4th smallest element)
7 (This is the 4th largest element)
