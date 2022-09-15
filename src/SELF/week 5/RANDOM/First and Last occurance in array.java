

 O(logn);
 
 
 
 import java.util.*;

// ** Example :** N = 9 arr[] = {1, 3, 5, 5, 5, 5, 67, 123, 125}
// x = 5 ** Output : ** 2 5
 
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
   
    int[] arr = new int [n];
 
    for(int i=0; i<n; i++){
     arr[i] =sc.nextInt();
    }
       int x = sc.nextInt();
     int[] output= new int[2];
     
    // int firstPosition = first(arr,0,n-1,x);
    // int secondPosition = second(arr,0,n-1,x);
      System.out.print(first(arr,0,n-1,x)+" "+second(arr,0,n-1,x));
      // System.out.print(second(arr,0,n-1,x));
    
    // int[] result = {firstPosition,secondPosition};
    
    // for(int xx:result)System.out.print(xx+" ");
  }
  
  private static int first(int[] arr, int start, int end , int x){
    int ans = -1;
    
    while(start<=end){
      int mid = start+(end-start)/2;
      if(arr[mid] == x){
          ans = mid;
          end = mid-1;
      }else if(x<arr[mid]){
        end = mid-1;
      }else{
        start= mid+1;
      }
    }
    return ans;
    
  }
  private static int second(int[] arr, int start, int end, int x){
      int ans = -1;
      
    while(start<=end){
      int mid = start+(end-start)/2;
      if(arr[mid] == x){
        ans = mid;
       start = mid+1;
      }else if(x<arr[mid]){
        end = mid-1;
      }else{
       start=mid+1;
      }
    }
    return ans;
  }
}

// n^2

import java.util.*;

public class Main {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
   
    int[] arr = new int [n];
 
    for(int i=0; i<n; i++){
     arr[i] =sc.nextInt();
    }
    
       int x = sc.nextInt();
     int[] output= new int[2];
     Arrays.fill(output,-1);
     for(int i =0; i<n; i++){
       if(arr[i]==x){
         output[0] =i;
         break;
       }
     }
     for(int i=n-1; i>=0; i--){
       if(arr[i]==x){
         output[1] = i;
         break;
       }
     }
     
     for(int r:output)System.out.print(r+" ");
  }
}



Given a array with possibly duplicate elements, the task is to find indexes of first and last occurrences of an element x in the given array.

Input Format: The first line contains an integer 'N' denoting the number of elements. The second line contains 'N' space seprated integers denoting the elements of the array. The third line contains 'x' the number whose positions are to be found.

Output Format: Print a two integer denoting the first and last appearance of x. If element doesn't appear print -1 -1.

** Example :** N = 9 arr[] = {1, 3, 5, 5, 5, 5, 67, 123, 125}
x = 5 ** Output : ** 2 5

Constraints: 1 <= N <= 3000 0 <= A[i] <= 5000 1 <= x <= 5000