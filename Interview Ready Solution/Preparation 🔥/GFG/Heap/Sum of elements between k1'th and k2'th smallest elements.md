Given an array A[] of N positive integers and two positive integers K1 and K2. Find the sum of all elements between K1th and K2th smallest elements of the array. It may be assumed that (1 <= k1 < k2 <= n).

 

Example 1:

Input:
N  = 7
A[] = {20, 8, 22, 4, 12, 10, 14}
K1 = 3, K2 = 6
Output:
26
Explanation:
3rd smallest element is 10
6th smallest element is 20
Element between 10 and 20 
12,14. Their sum = 26.
 

Example 2:

Input
N = 6
A[] = {10, 2, 50, 12, 48, 13}
K1= 2, K2 = 6
Output:
73
 

Your Task:  
You don't need to read input or print anything. Your task is to complete the function sumBetweenTwoKth() which takes the array A[], its size N and two integers K1 and K2 as inputs and returns the sum of all the elements between K1th and K2th smallest elements.
 

Expected Time Complexity: O(N. log(N))
Expected Auxiliary Space: O(N)

 

Constraints:
1 ≤ N ≤ 105
1 ≤ K1, K2 ≤ 109











```java
class Solution { 
    public static long sumBetweenTwoKth(long arr[], long N, long K1, long K2)
    {
        long first = kthSmallest(arr,K1);
        long second = kthSmallest(arr,K2);
        long sum =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>first && arr[i]<second){
                sum+=arr[i];
            }
        }
        return sum;
    }
    
    private static long kthSmallest(long[] arr, long k){
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
            
            if(pq.size()>k){
                pq.poll();
            }
        }
        
        return pq.peek();
    }
    
}

```