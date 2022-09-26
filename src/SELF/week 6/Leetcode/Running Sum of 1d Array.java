class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int [] output= new int [n];
        int sum =0;
        for(int i=0; i<n; i++){
           sum = sum+ nums[i]; 
            output[i] = sum;
        }
        
        return output;
    }
}



class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int [] output= new int [n];
        int sum =0;
        for(int i=0; i<n; i++){
           sum = sum+ nums[i]; 
            nums[i] = sum;
        }
        
        return nums;
    }
}



class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int [] output= new int [n];
        int sum =0;
        for(int i=0; i<n; i++){
           nums[i] = nums[i]+sum; 
            sum=nums[i];
        }
        
        return nums;
    }
}

