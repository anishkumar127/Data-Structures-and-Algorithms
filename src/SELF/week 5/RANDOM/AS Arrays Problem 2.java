import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{

       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
   
        int[] arr = new int [n];
         int count =0;
        for(int i=0; i<n; i++){
         arr[i] =sc.nextInt();
          if(arr[i]>20){
            count++;
          }
        }
      System.out.print(count);
	}
}
Write a program to find out the count of numbers greater than 20 that are present in the array. First take input of size (N) of the array from user followed by array elements. Then using a loop, find out the total number of integers present in the array that are greater than 20 and finally print that count.

Approach: First find out the space and time complexity to get the approach for this question

Input Format

First line contains an integer N denoting size of array
Second line contains N integers denoting the array elements separated by single space
Output Format

Print count of all array elements greater than 20 in a line
Example

Input

6
7 81 17 21 20 11
Output

2