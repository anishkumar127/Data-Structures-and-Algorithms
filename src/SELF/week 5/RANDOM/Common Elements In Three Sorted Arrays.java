





import java.util.*;
import java.lang.*;
import java.io.*;
// N, M, K 
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
		int b [] = new int[m];
		int c[] = new int[k];
		for(int i=0; i<n; i++){
		  a[i] = sc.nextInt();
		}
		for(int i=0; i<m; i++){
		  b[i] = sc.nextInt();
		}
		for(int i=0; i<k; i++){
		  c[i] = sc.nextInt();
		}
		int check = 0;
		
		for(int i=0; i<n; i++){
		  
		  for(int j=0; j<m; j++){
		    if(a[i]==b[j]){
		      check = a[i];
		    }
		  }
		}
		int ans =-1;
		for(int i=0; i<k; i++){
		  if(c[i]==check){
		    ans = c[i];
		  }
		}
		System.out.print(ans);
	}
}
/*
 4  3   3  

1 4 5 6 A
3 4 5  B
5 6 7 C
ans  5

3  1   3  
4 6 8
6
2 2 6
ans = 6.


*/







You are given three arrays 'A', 'B' and 'C' of length 'N', 'M' and 'K' respectively. All the three arrays are sorted in non-decreasing order. Your task is to find all such elements which are present in all the three given arrays.

Note:

The output array should have the same ordering of elements as the original arrays.
Even if a particular element appears more than once in each of the three arrays, it should still be present only once in the output array.
If there are no common elements in the arrays, print -1.
For example: Consider the three arrays A = [ 2, 3, 4, 7 ] , B = [ 0, 0, 3, 5 ] , C = [ 1, 3, 8, 9 ] The output array should be [ 3 ] as 3 is the only element which is present in all the three arrays.

Input Format: The first line contains three space-separated integers 'N', 'M' and 'K' denoting the number of elements in Array A, Array B and Array C respectively. The second line contains 'N' space-separated integers denoting the elements of the array 'A'. The third line contains 'M' space-separated integers denoting the elements of the array 'B'. The fourth line contains 'K' space-separated integers denoting the elements of the array 'C'.

Output Format: The only line of output should contain the elements that are common in all three arrays separated by space or -1 if no element is common in all the three arrays.

Example 1: Input: 4 3 3 1 4 5 6 3 4 5 5 6 7 Output: 5 Explanation: Elements that are common in array A and B = [ 4, 5 ]. Out of which only 5 is present in Array C. Therefore the output array is [ 5 ] in this case.

Example 2: Input: 3 1 3 4 6 8 6 2 2 6 Output: 6 Explanation: It can be seen that only 6 is present in all the three arrays. Therefore the output array is [ 6 ] in this case.

Constraints: 1 <= N, M, K <= 100000 0 <= A[i] <= 10^9 0 <= B[i] <= 10^9 0 <= C[i] <= 10^9 Where 'A[i]', 'B[i]', 'C[i]' denotes the 'i'th' element of the arrays 'A', 'B' and 'C' respectively.