class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length; 
        int sum =0;
        int max=Integer.MIN_VALUE;   // add minimum value.
        for(int i=0; i<n; i++){
            sum+=nums[i];   // keep doing sum. 
            max = Math.max(sum,max);  // storing maximum sum.
            if(sum<0) sum=0;  // if sum go below 0. make sum 0; to fresh start.
        }
        return max;
    }
}