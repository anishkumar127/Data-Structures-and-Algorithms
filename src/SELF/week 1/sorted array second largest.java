
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
      // int n = sc.nextInt();
      int n = 5;
      int arr[] = new int[n];
      for(int i =0; i<n; i++){
       arr[i] = sc.nextInt();
      }
int max = Integer.MIN_VALUE;
      int second= 0;
      for(int i=0; i<n; i++){
        if(arr[i]>max){
         second = max;
          max = arr[i];
        }
        else if(arr[i]>second && arr[i]!=max){
          second= arr[i];
        }
      }
      System.out.println(second);
      // System.out.print(max);
    }
}











import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System.in);
		int []arr = new int[5];
		int big = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for(int i=0; i<5; i++){
            arr[i] =input.nextInt();
		}
		for(int j=0; j<5; j++){
				if(arr[j]>big){
				second = big;
				big = arr[j];
				
			}
			if(arr[j]>second && arr[j]<big){
				second = arr[j];
			}
		}
		System.out.println(second);
	}
}