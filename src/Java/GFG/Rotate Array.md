``https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements/0``
```

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
	
	int t = sc.nextInt(); // for test cases.
		while(t>0){
		    	int n = sc.nextInt();
		int d = sc.nextInt();
		    	int [] arr = new int [n];
		for(int i =0; i<n; i++){
		    arr[i] = sc.nextInt();
		}
	
        for (int i=d; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        for(int i =0; i<d; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        t--;
		}
	
	}
}
```
```
import java.util.*;

public class Main {
    public static void main(String[] args) {
    int [] arr  = {1,2,3,4,5};
    int d = 2;
    int n = arr.length;
    
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        
      for(int p : arr){
        System.out.print(p+" ");
      }
  }
public static int[] reverse(int[] arr, int start, int end){
    
    while(start<end){
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end]= temp;
       start++;
       end--;
    }
    return arr; 
  }
}
```


```

import java.util.*;

public class Main {
    public static void main(String[] args) {
    int [] arr  = {1,2,3,4,5};
    int d = 2;
    int len = arr.length;
    swap1(arr,0,len-1);
    swap1(arr,0,len-d-1);
    swap1(arr,len-d,len-1);
      for(int p : arr){
        System.out.print(p+" ");
      }
  }
public static int[] swap1(int[] arr, int start, int end){
    
    while(start<end){
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end]= temp;
       start++;
       end--;
    }
    return arr; 
  }
}

```



```
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0)
		{
		    int n=sc.nextInt();
		    int d=sc.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++)
		      arr[(i+n-d)%n]=sc.nextInt();
			for(int x1:arr)
		      System.out.print(x1+" ");
		      System.out.println();
	     }
	}
}
```
