import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc = new Scanner(System.in);
	 int n  = sc.nextInt();
	 int sum = sc.nextInt();
	 int arr[] = {1,2,3,4,5,6,7,8,9,10};
    int ans=0;
    for(int i =0; i<n; i++){
       ans +=arr[i];
    }
    if(ans==sum){
      System.out.println("YES");
      return;
    }else{
     
      for(int i=n; i<10; i++){
        ans+=arr[i]-arr[i-n];
        if(ans==sum){
        System.out.println("YES");
        return;
      }
      }
    }
    System.out.println("NO");
	}
}


Given an array arr[10] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} of size 10. Find whether there exists a sub-array of size n and sum s, where n and s both are user input values.

Print “YES” if there exists a subarray of size n and sum s in the array arr[10].

Input Format
The user will take 2 integer inputs from the user:
n => size of the subarray
s => sum of the subarray of size n 
Output Format
Print either “YES” or “NO”
Sample Testcase
Input
3 16
Output
YES


