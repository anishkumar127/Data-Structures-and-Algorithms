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
      for(int i =0;  i<n-i; i++){
        for(int j =0; j<n-1; j++){
          if(arr[j]>arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1]= temp;
            count++;
            swapped=true; 
          }
        }
         if(swapped == false){
                 break;
      }
      }
      System.out.println("Array is sorted in "+count+" swaps.");
      System.out.println("First Element: "+arr[0]);
      System.out.println("Last Element: "+arr[n-1]);
    
	}
}