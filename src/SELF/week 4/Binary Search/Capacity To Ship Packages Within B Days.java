1st method.

import java.util.*;

public class Main {
  private static boolean isPossible(long capacity, int [] arr, int days){
    long sumOfItems = 0;
    int daysNeeded = 1;
    int n = arr.length;
    for(int i=0; i<n; i++){
      if(arr[i]>capacity)
      return false;
      if(sumOfItems+arr[i]>capacity){
        sumOfItems = arr[i];
        daysNeeded++;
      }else{
        sumOfItems+=arr[i];
      }
    }
    return daysNeeded<=days;
  }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int [] arr = new int[n];
     for(int i=0; i<n; i++){
       arr[i] = sc.nextInt();
     }
     int days = sc.nextInt();
     
     long low = 1;
     long high = (long)5e10;
     long ans = (long)5e10;
     
     while(low<=high){
       long mid = (high+low)/2;
       if(isPossible(mid,arr,days)){
       ans = mid;
       high= mid-1;
     }else{
       low = mid+1;
     }
     }
     System.out.println(ans);
  }
}


2nd method 


import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
       public  static long shipWithinDays(int[] weights, int days)
  {      
             int n=weights.length;
            long min = -1;
           long max = 0;
           long res = -1;
             for(int i=0;i<n;i++)
                {
                    min = Math.max(min,weights[i]);
                    max+=weights[i];
            }
            while(min<=max)
            {
                    long mid = min + (max-min)/2;
                    if(isFeasible(weights,days,mid))
                    {
                            res = mid;
                            max = mid-1;
                    }
                    else
                    {
                            min = mid+1;
                    }
            }
        return res;
    }
    public static boolean isFeasible(int a[],int k, long res)
  {        
               int Day = 1;
              long sum = 0;
            for(int i=0; i<a.length; i++)
            {      
                     sum += a[i];
                    if(sum>res)
                    {
                           Day++;
                            sum = a[i];
                    }
            }
            return Day<=k;
    }
  
	public static void main (String[] args) throws java.lang.Exception
	{
		 //your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[]= new int [n];
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      int b=sc.nextInt(); 
      System.out.print(shipWithinDays(arr,b));
      System.out.println();
	}
}



// question

Problem Description

A conveyor belt has packages that must be shipped from one port to another within B days.

The ith package on the conveyor belt has a weight of A[i]. Each day, we load the ship with packages on the conveyor belt (in the order given by weights). We may not load more weight than the maximum weight capacity of the ship.

Print the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within B days.

Problem Constraints 1 <= B <= |A| <= 5 * 10^5 1 <= A[i] <= 10^5

Input Format

The first line contains an integer n — the length of array A.

The second line contains n integers A1,A2,…,An — elements of array A.

The third line contains the integer B denoting the number of days.

Output Format

Print the least weight capacity of the ship.

Example Input Input 1: 10 1 2 3 4 5 6 7 8 9 10 5 Input 2: 6 3 2 2 4 1 4 3

Example Output Ouput 1: 15

Ouput 2: 6

Example Explanation Explanation 1: A ship capacity of 15 is the minimum to ship all the packages in 5 days like this: 1st day: 1, 2, 3, 4, 5 2nd day: 6, 7 3rd day: 8 4th day: 9 5th day: 10 Note that the cargo must be shipped in the order given, so using a ship of capacity 14 and splitting the packages into parts like (2, 3, 4, 5), (1, 6, 7), (8), (9), (10) is not allowed. Explanation 2:

A ship capacity of 6 is the minimum to ship all the packages in 3 days like this: 1st day: 3, 2 2nd day: 2, 4 3rd day: 1, 4