import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner sc = new Scanner(System.in);
            // int n = sc.nextInt();
            // int arr[] = new int[n];
            // for(int i=0; i<n; i++){
            //   arr[i] = sc.nextInt();
            // }
      int arr[] ={29,18,45,67,18,36,49,91,19,21};
      int n = arr.length;
      int max = Integer.MIN_VALUE;
      int index =0;
      for(int i =0; i<n;  i++){
        if(arr[i]>max){
          index =i;
          max = arr[i];
        }
      }
      System.out.print(index);
	}
}



Ruma has given an array arr to Sima such that arr[10]={29,18,45,67,18,36,49,91,19,21}. Ruma asks Sima to write a java program to find out the index of the largest element present in the array and print the index. Your task is to help Sima by writing a java program.