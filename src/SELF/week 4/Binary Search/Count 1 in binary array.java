import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
       Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr= new int[n];
      for(int i=0; i<n; i++){
        arr[i]  = sc.nextInt();
      }
      
      int low = 0;
      int high = n-1;
      int ans = -1;
      
      while(low<=high){
        int mid = (high+low)/2;
        
        if(arr[mid]==0){
          // move left+1 
           high = mid-1;
        }else{
          ans = mid;
          low = mid+1;
        }
      }
      System.out.println(ans+1);
	}
}

// question

Count 1 in binary array
Given a binary sorted non-increasing array arr of size N. You need to print the count of 1 in the binary array.

Try to solve the problem using binary search

Input
Each test case contains two lines. The first line contains N (size of binary array). The second line contains N elements of binary array separated by space.

Output
In new line, print the count 1 in binary array.

Constraints:
1 <= N <= 10^6 arr[i] = 0,1

Sample Input:
8
1 1 1 1 1 0 0 0
Sample Output:
5
Explaination
Number of 1 in given binary array : 1 1 1 1 1 0 0 0 is 5.