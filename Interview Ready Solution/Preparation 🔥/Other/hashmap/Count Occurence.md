`` brute force``

```java
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
        {
                Scanner input=  new Scanner(System.in);
                int n  = input.nextInt();
                int []arr  = new int[n];
                for(int i=0; i<n; i++){
                        arr[i] = input.nextInt();
                }
                Arrays.sort(arr);
                // 0 0 1 1 1 1 2 3 
                int []ans = new int[n];
                int count =1;
                int index = 0;
                 for(int i = 0; i<arr.length-1; i++){
                        if(arr[i] ==arr[i+1]){
                                count++;
                        }
                         else if(arr[i]!=arr[i+1]){
                                 ans[index] = count;
                                 count = 1;
                                 index++;
                         }
                }
                ans[index] = count;
                for(int x:ans){
                        if(x!=0)
                        System.out.print(x+" ");
                }
	}
}
```



`` hashmap optimal``

```java

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int [] arr = new int [n];
		for(int i=0; i<n; i++){
		  arr[i]=sc.nextInt();
		}
		
		HashMap<Integer,Integer>map = new HashMap<>();
		
		for(int i =0; i<n; i++){
		  map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		}
	
		for(int val:map.keySet()){
		System.out.print(map.get(val)+" ");
		}
	}
}

/*
8
2 0 1 1 1 0 3 1



2 4 1 1



*/
```



``theory``

You are given an integer array A of size n. Your task is to find the number of occurences of each number and return an array containing number of occurences starting with the smallest value's occurence first.

For example, A = [5, 3, 3, 4], you have to return an array [2, 1, 1], where 2 is the number of occurences for element 3, 1 is the number of occurences for element 4, and 1 is the number of occurences for element 5.

Input
The first line of each test case contains an integer n, the length of the array A.
The next line contains n integers.

Output
Output an array representing the occurences of each number.

Example
Input:
8
2 0 1 1 1 0 3 1
Output:
2 4 1 1