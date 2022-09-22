class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        long sum =0;
        long maxy = Integer.MIN_VALUE;
        for(int el :arr){
            sum+=el;
            
            maxy = Math.max(sum,maxy);
            if(sum<0) sum = 0;
        }
        
        return maxy;
    }
    
}

