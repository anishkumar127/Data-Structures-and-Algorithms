import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int [] a = new int [n];
      int [] b = new int[n];
        int sum1 = 0;
      int sum2=0;
      for(int i=0; i<n; i++){
        a[i] = sc.nextInt();
        sum1+=a[i];
      }

      for(int i=0; i<n; i++){
        b[i] = sc.nextInt();
        sum2+=b[i];
      }

      if(sum1==sum2){
        System.out.print(1);
      }else{
        System.out.print(0);
      }
      
	}
}







Given two arrays A and B of equal size n, the task is to find if given arrays are equal or not. Two arrays are said to be equal if both of them contain same set of elements, arrangements (or permutation) of elements may be different though.

Note : If there are repetitions, then counts of repeated elements must also be same for two array to be equal.

Input
line 1: contains an integer n denoting size of array.

line 2: contains n spaced integers denoting elements of array A.

line 3: contains n spaced integers denoting elements of array B.

Output
Print 1 if the two arrays are equal otherwise print 0.

Constraints
1<=n<=10^6

1<=A[i],B[i]<=10^6

Expected Time Complexity: O(N)

Expected Space Complexity: O(N)

Sample Input
5
1 2 5 4 0
2 4 5 0 1
Sample Output
1
Explaination