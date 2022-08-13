import java.util.*;
import java.lang.*;
import java.io.*;
/*
4 1
32 0 63 8
output 0

6 2
32 6 4 0 3 1
output 2 ;
*/
public class Main
{
	public static void main (String[] args) 
	{
		Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    int k=obj.nextInt();
    int arr[]=new int[n];
    int count=0;
    for(int i=0;i<n;i++){
      arr[i]=obj.nextInt();
    }
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        if((arr[i] - arr[j])==k)
          count++;
          else if((arr[j]-arr[i])==k)
          count++;
      }
    }
    System.out.print(count);
	}
}