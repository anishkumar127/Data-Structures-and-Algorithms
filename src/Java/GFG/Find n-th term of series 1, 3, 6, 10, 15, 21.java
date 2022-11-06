//Question Link: https://practice.geeksforgeeks.org/problems/find-n-th-term-of-series-1-3-6-10-15-215506/1
class Solution {
    
    //O(N) Solution
    static int findNthTerm(int N) {
      int sum = 0; 
       for(int i = 0; i<=N; i++) {
           sum += i; 
       }
       return sum;
    }
    
    //O(1) -> Simple Mathematical formula to calculate sum of first N natural Numbers
    static int findNthTerm(int N) {
      return (N*(N+1))>>1;
    }
}
