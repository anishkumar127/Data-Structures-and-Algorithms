import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      int sum =0;
      for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
        sum+=arr[i];
      }
      System.out.print(sum);
	}
}

Write a program to find sum of all elements present in an array (arr[ ]). Take input of size of array(N) from user followed by the elements of array. After taking input, make variable sum and add all the elements of the array to the sum variable till you reach the last element of the array.

Time complexity: O(N) will be the time complexity because we will have to make N iterations to execute the code starting from the 1st element of the array till the Nth element.

Space Complexity: Since we take the same amount of input/space to implement without using any additional space to store, we can say that the Space complexity will be O(1)

Input Format

First line contains an integer N denoting size of array
Second line contains N integers denoting the array elements separated by single space
Output Format

Print sum of the array elements 
Example

Input

5
1 2 3 4 4
Output

14