
class Solution{
    
   
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
      int sum =0;
      int ans =0;
      HashMap<Integer,Integer> map = new HashMap<>();
    // >  map.put(0,1);
      for(int i=0; i<N; i++){
           sum+=A[i];
          
          int len = sum-K;
        if(sum==K) ans = i+1;   // if somewhere sum ==k then do i+1;
        
        // get the sum-k and compare with max. if max then put into ans;
          if(map.containsKey(len)){
             ans = Math.max(ans, i-map.get(len));
          }
          // if sum not present then we have to put sum into map. and that map index.
          if(!map.containsKey(sum)){
              map.put(sum,i);
          }
      }
      return ans;
    }
    
    
}


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