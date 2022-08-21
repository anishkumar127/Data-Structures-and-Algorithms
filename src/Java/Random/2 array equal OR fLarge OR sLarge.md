Write a java program to find out the difference between two arrays arr1 and arr2. If arr1 is larger then the output should be "First array is larger", if arr2 is larger then the output should be "Second array is larger", otherwise the output should be "Both are equal".

Input Format First line contains n, size of the first array. Second line contains n elements of the first array. Third line contains m, size of the second array. Fourth line contains m elements of the second array. n and m will always be equal.

output Format Print the output as per difference.

Example Input 1 2 1 2 2 3 4

Output 1 Second array is larger


```

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
      int [] arr1 = new int[n];
      int f_sum = 0;
      for(int i=0; i<n; i++){
        arr1[i] = sc.nextInt();
        f_sum+=arr1[i];
      }
      int m = sc.nextInt();
      int s_sum=0;
      int arr2[] = new int[m];
      for(int i=0; i<m; i++){
        arr2[i] = sc.nextInt();
        s_sum+=arr2[i];
      }

      if(f_sum>s_sum){
        System.out.print("First array is larger");
      }else if(s_sum>f_sum){
        System.out.print("Second array is larger");
      }else{
         System.out.print("Both are equal");
      }
	}
}
/*
arr1 and arr2

1.  n size 2.
2. n elements  1 2.
3. m size 2
4.  n elements 3 4.
2  2 
1 2 
3 4


*/

```