import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int [] arr = new int[n];
      for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
      }
      
      HashMap<Integer, Integer> map = new HashMap<>();
      int  ans = 0;
      int sum =0;
      
      // map.put(0,-1);  // key = sum, value is = index.
      
      for(int i=0; i<n; i++){
        sum+=arr[i];
        
        if(sum==k) ans = i+1;
        
        // checking map contains sum or not.
        if(!map.containsKey(sum)){
          map.put(sum,i); //  key and value. sum and index.
        }
        
        // try to search sum-k is present into hashmap or not. if it is then get index.
        
        if(map.containsKey(sum-k)){
          ans=Math.max(ans,i-map.get(sum-k));
          // we get max index. and we also don't Override old sum index. 
        }
      }
      
      System.out.print(ans);
  }
}

/*
Dry run. 

 0 + 10.
 
key  10  15  17  24  , 25(25-15 = 10.)  , 34
value 0   1   2  3   4                   5

10 present.  
so ans  =0. ,  
max(0, 4-0)   max is (4);
return 4.
*/


Given an array containing N integers and an integer K., Your task is to find the length of the longest Sub-Array with the sum of the elements equal to the given value K.

Input
First line contains 2 integers N(size of array) and K(required sum).
Next line contains N integers denoting elements of array

Output
Length of longest Sub-Array with sum K. In case no subarray exist ouput 0

Constraints:
1 <= N <= 100000

-100000 <= A[i] , K <= 100000

Sample Input:
6 15
10 5 2 7 1 9
Sample Output:
4