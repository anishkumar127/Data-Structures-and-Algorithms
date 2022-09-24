
class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
       long sum = 0;
       long max = Integer.MIN_VALUE;
       int start =0;
       int end =0;  
       while(end<N){
           sum+=Arr.get(end);   // adding ending. not start.
           if(end-start+1<K){   // increasing end till not equal to K. first time for maintaing the window.
               end++;
           }else if(end-start+1==K){  // if windows maintained .
               max = Math.max(max,sum);  // add max to maxiumum sum.
               sum = sum-Arr.get(start);  // after adding max sum then decrease the start index element sum.
               start++;  // after decreasing start index element sum do start++; to move forward start.
               end++;    // after start move forward. do end move forward.  after doing this windows will be maintained.
           }
       }
        
        return max;   // end the end return max sum of size K.
    }
}