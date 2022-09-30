
Given an array containing N integers and an integer K., Your task is to find the length of the longest Sub-Array with the sum of the elements equal to the given value K.

 

Example 1:
 

Input :
A[] = {10, 5, 2, 7, 1, 9}
K = 15
Output : 4
Explanation:
The sub-array is {5, 2, 7, 1}.
Example 2:

Input : 
A[] = {-1, 2, 3}
K = 6
Output : 0
Explanation: 
There is no such sub-array with sum 6.
Your Task:
This is a function problem. The input is already taken care of by the driver code. You only need to complete the function lenOfLongSubarr() that takes an array (A), sizeOfArray (n),  sum (K)and returns the required length of the longest Sub-Array. The driver code takes care of the printing.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

 

Constraints:
1<=N<=105
-105<=A[i], K<=105
 



brute force.  tc O(n^2)  sc O(n);
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
              // sum    value.
      HashMap<Integer,Integer> map = new HashMap<>();
      
      for(int i=0; i<n; i++){
         int sum =0;
        for(int j=i;j<n; j++){
          sum+=arr[j]; // sum 
          
          if(!map.containsKey(sum)){  // if map not contains sum then put it.
            map.put(sum,j-i+1);   // put sum as a key. and index as a value. 2-0+1; 3. +1 because index value start from 0;
          }else{
            // if contianns that sum.
            int val = Math.max(j-i+1,map.get(sum)); // current sum, vs before sum.
            map.put(sum,val); // sum and max value.
          }
        }
      }
      
      System.out.println(map.get(k)!=null?map.get(k):0);
      // System.out.println(map);
  }
}