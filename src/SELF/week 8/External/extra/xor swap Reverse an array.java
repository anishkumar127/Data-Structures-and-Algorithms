import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int arr[] = new int[n];
		 
		 for(int i=0; i<n; i++){
		   arr[i] = sc.nextInt();
		 }
		 
		 int s =0;
		 int e = n-1;
		 while(s<=e){
		   // swap.
		  // int temp = arr[s];
		  // arr[s] = arr[e];
		  // arr[e]= temp;
		  // using xor 
		  arr[s] ^= arr[e];
		  arr[e]^=arr[s];
		  arr[s]^= arr[e];
		  
		   s++;
		   e--;
		 }
		 
		 for(int val:arr)System.out.print(val+" ");
	}
}


You are given an array arr of length n. You have to print the reversed array.

Input Format

The first line of input contains an integer n, size of the array.

The next line contains n space-separated integers denoting the elements of the array.

Output Format

Print n space separated integers denoting the reverse of the input array.

Example 1:

6
1 3 5 7
Output

7 5 3 1
Explanation

We have arr = [1 3 5 7]

Print the array from the ending

The reversed array is [7 5 3 1]

Example 2:

7
0 0 1 1 0 2 3
Output

3 2 0 1 1 0 0
Explanation

The reversed array is [3 2 0 1 1 0 0]

Constraints

1 <= n <= 10^6

1 <= arr[i] <= 10^9