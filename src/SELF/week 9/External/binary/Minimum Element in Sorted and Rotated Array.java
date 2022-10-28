
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here
            Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      int arr[] = new int[n];
      for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
      }

            System.out.print(searching(arr,n));
    }
        public static int searching(int nums[] , int n){
                  if(n==0) return -1;
        if(n==1 || nums[0]<nums[n-1]) return nums[0];
        if(n==2) return Math.min(nums[0],nums[1]);
        
        int s=0;
        int e = n-1;
        
        while(s<=e){
            int mid =(s+(e-s)/2);
            if(mid>0 && nums[mid]<nums[mid-1]) return nums[mid];
            else if(nums[mid]<nums[e])  e = mid-1;
            else if(nums[mid]>nums[e])  s=mid+1;
        }
        
        return -1;
        }
}



Given an array A which is sorted in ascending order and contains N elements. Also, this array is rotated at some unknown point. The task is to find the minimum element in it.

Input
The first line consists of an integer N, where N is the size of array.
The second line contains N space separated integers denoting array elements.

Constraints:
1 <= N <= 10^5
-10^6 <= A[i] <= 10^5

Output
Print the minimum element in the array in new line.

Example
Input:
10
2 3 4 5 6 7 8 9 10 1
Output:
1 
Explanation:
The array is rotated once anti-clockwise. So minimum element is at last index (n-1) which is 1.
Input:
8
10 20 30 45 50 60 4 6
Output:
4 
Explanation:
The array is rotated and the minimum element present is 4