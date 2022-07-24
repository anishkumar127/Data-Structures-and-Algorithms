
``Best code with dry run.``
```
package BubbleSort;
import java.util.*;
// no extra space.
// no copying the array.
// this is also known as in-place sorting algorithms. no need extra array.
// tc. best case - O(N), worst case : O(N^2),
// it is stable sorting algorithms. order should be same when value is same.
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n; i++){
            arr[i] =sc.nextInt();
        }

        // actual part begin.
        boolean swapped;
        for(int i=0; i<n; i++){ // run the steps n-1; times.
            swapped = false;
            for(int j=1; j<n-i; j++){ // j is internal loop. we can do. j<=n-i-1; or j<n-i; help in rounded tc reduce.
                if(arr[j]<arr[j-1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped=true;
                }
            }
            if(!swapped){ // !false = true;
                break;
            }
        }
        for(int print:arr){
            System.out.print(print+" ");
        }
    }
}
```


``rough code``

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
      int t = sc.nextInt();
      int [] arr=new int [t];
      for(int i=0; i<t; i++){
        arr[i] = sc.nextInt();
      }
      int count =0;
      int n  =arr.length;
      boolean swapped = false;
      for(int i =0;  i<n-1; i++){
        for(int j =0; j<n-i-1; j++){
          if(arr[j]>arr[j+1]){
            
            // swap 
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1]= temp;
            count++;
            swapped=true;
         
          }
      //     if(swapped == false){
      //           break;
      // }
        }
      }
      System.out.println("Array is sorted in "+count+" swaps.");
      System.out.println("First Element: "+arr[0]);
      System.out.println("Last Element: "+arr[n-1]);
    
	}
}

```


``in this j run array.length and i run also array.length``