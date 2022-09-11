import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
      int value = 35;
      int arr[] = new int[n];
      for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
      }
      int count =0;
      for(int i=0; i<n; i++){
        if(arr[i]>value){
          count++;
        }
      }
      System.out.print(count);
	}
}






Write a java program to count the elements in an array which are greater than 35 .

Input Format First line contains n, size of an array. Second line contains n elements of the array.

output Format Print the number of the elements present in the array which are greater than 35.

Example

Input 1 5 12 67 89 16 23

Output 1 2

Input 2 4 22 39 45 72

Output 2 3

