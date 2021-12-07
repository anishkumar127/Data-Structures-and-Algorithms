import java.io.*;
import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
      // int arr[] = {2,4,8,5,3,6,3,2};
      int arr[] ={1 , 5, 9, 6, 7 ,2, 1}; 
        //  8 8 6 6 6 3 2 -1
        // { 1 , 5, 9, 6, 7 2 1 }
        // 9  9 7  7  2 1 -1
        solve(arr);
        
    }
    public static void solve(int []arr){
      int n = arr.length;
      int next = arr[n-1];
      arr[n-1]= -1;
      
      for(int i=n-2; i>=0; i--){
        int temp = arr[i];
        // arr[i]=Math.max(next,arr[i+1]);
        arr[i]=next;
        next=Math.max(temp,next);
      }
    System.out.print(Arrays.toString(arr));
    }
}