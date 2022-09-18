import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
  	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
	
		int n = sc.nextInt();
		int target  = sc.nextInt();
		int []arr = new int[n];
		// 1st way .
		// String s = "";
		// for(int i=1; i<=n; i++){
		//   arr[i-1] = sc.nextInt();
		//   if(arr[i-1]==target){
		//     s+=i+" ";
		//     }
		//     }
		//     System.out.println(s.length()==0?-1:s);
		    
		    // 2nd way. 
		    search(arr,n,target);
	}
	private static void search(int arr[] , int n, int t ){
	  
	  		String s = "";
		for(int i=0; i<n; i++){
		  arr[i] = sc.nextInt(); // storing array. taking input.
		  
		  if(arr[i]==t){
		    s+=i+1 +" ";
		    }
		    }
		    System.out.println(s.length()==0?-1:s);
	}
}

