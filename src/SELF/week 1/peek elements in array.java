import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
     
      int ans = -1;
      for(int i =0; i<n; i++){
        if(i==0){
          if(arr[i]>arr[i+1]){
            ans =i;
            break;
          }
        }
        else if (i==n-1){
          if(arr[i]>arr[i-1]){
            ans = i;
            break;
          }
        }
        else{
          if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
            ans = i;
            break;
          }
        }
      }
      
      System.out.print(ans);
    }
}


// wrong maybe. its getting max elements second code. 
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        boolean flag = false;
        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int i =0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
             index = i;
             flag = true;
            }
        }
        if(flag==true){
            System.out.print(index);
        }else {
            System.out.print(-1);
        }
    }
}