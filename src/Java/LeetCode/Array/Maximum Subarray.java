//  https://leetcode.com/problems/maximum-subarray/

// Runtime: 1 ms, faster than 100.00% of Java online submissions for Maximum Subarray.

// extra space required...
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int max = nums[0];
        int prev = nums[0];
        for(int i=1; i<nums.length; i++){  // starting from 1 because nums[0] already we are using for chekcing.
            if(prev + nums[i] > nums[i]){
                prev = prev + nums[i];
            }
            else {
                prev = nums[i];
    }
            max = Math.max(max,prev);
        }
        return max;
    }
}

/*
Time complexity: O(n)
Space complexity: O(1)
*/
                                    // 2 fasted 

// Runtime: 1 ms, faster than 100.00%

class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int currSum =0;
        for(int i =0; i<nums.length; i++){     // can also do only forEach loop  for(int n:nums) 
            currSum = Math.max(currSum + nums[i] , nums[i]);
            max = Math.max(currSum , max);
        }
        return max;
    }
}


                                // 3
// Runtime: 2 ms, faster than 67.76% 
// Kadane's Algorithm 
class Solution {
    public int maxSubArray(int[] nums) {
       int currSum = nums[0];            // here we can aslo do int max=Integer.MIN_VALUE; int currSum=0; instead of doing nums[0];
       
       int max = nums[0];
        for(int i=1; i<nums.length; i++){
            if(currSum<0){
                currSum =0;
            }
            currSum = currSum + nums[i];
            
            if(currSum>max){
                max = currSum;
            }
        }
        return max;
    }
}

                        // 4

// Runtime: 1 ms, faster than 100.00%
// Why we are not using for loop?
// Ans: While loop took 1ms & 49.8 MB whereas for loop took >=2 ms & 90MB.There's no issue with for loop. It's upto the programmer.

class Solution {
    public int maxSubArray(int[] nums) {
      int max = nums[0], currSum = nums[0], i=1;
        while(i<nums.length) {
            currSum = Math.max(currSum + nums[i], nums[i]);
            max = Math.max(max, currSum);
            i++;
        }
        return max;
    }
}



                                // 5

// Runtime: 1 ms, faster than 100.00%
// Note that checking if nums[i] > (currSum + nums[i]) is the same as checking if currSum < 0.
// currSum = nums[i] > (currSum + nums[i]) ? nums[i] : (currSum + nums[i]);

class Solution {
    public int maxSubArray(int[] nums) {
      int max = nums[0], currSum = nums[0];
   
        for(int i=1; i<nums.length; i++){
          currSum =( currSum < 0 ) ? nums[i] : (currSum + nums[i]);
          
          if(currSum>max){
              max = currSum;
          }
      }
        return max;
    }
}


                                // 6  intuitive O(n) prefix sum without kadane algorithms

// Runtime: 1 ms, faster than 100.00% 

class Solution {
    public int maxSubArray(int[] nums) {
      int max = nums[0], currSum = 0, min =0;
        for(int n : nums){
            currSum = currSum + n;
            max = Math.max(max,currSum-min);
            min = Math.min(currSum,min);
        }
            return max;
    }
}