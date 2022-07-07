https://practice.geeksforgeeks.org/problems/find-n-th-term-of-series-1-3-6-10-15-215506/1/?category%5B%5D=Mathematical&category%5B%5D=Mathematical&difficulty%5B%5D=-2&difficulty%5B%5D=-1&difficulty%5B%5D=0&page=1&query=category%5B%5DMathematicaldifficulty%5B%5D-2difficulty%5B%5D-1difficulty%5B%5D0page1category%5B%5DMathematical#

class Solution {
    static int findNthTerm(int N) {
      int sum = 0; 
       for(int i = 0; i<=N; i++) {
           sum += i; 
       }
           return sum;
    }
};

// or

 return (N*N+N)/2;

