
1 faild
2 pass.
3 faild
4 pass 

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
      for(int i=0; i<n; i++){
        arr1[i] = sc.nextInt();
      }
      int m = sc.nextInt();
      int arr2[] = new int[m];
      for(int i=0; i<m; i++){
        arr2[i] = sc.nextInt();
      }

      if(arr1.length>arr2.length){
        System.out.print("First array is larger");
      }else if(arr2.length>arr1.length){
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
*/

1. pass 
2. faild 
3. pass
4 . pass 


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
      for(int i=0; i<n; i++){
        arr1[i] = sc.nextInt();
      }
      int m = sc.nextInt();
      int arr2[] = new int[m];
      for(int i=0; i<m; i++){
        arr2[i] = sc.nextInt();
      }

      if(arr1.length>arr2.length){
        System.out.print("First array is larger");
      }else{
        System.out.print("Second array is larger");
      }
      
      // else{
      //   System.out.print("Both are equal");
      // }
      
	}
}
/*
arr1 and arr2

1.  n size 2.
2. n elements  1 2.
3. m size 2
4.  n elements 3 4.
*/