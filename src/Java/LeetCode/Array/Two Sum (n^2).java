class Solution {
    public int[] twoSum(int[] nums, int target) {
   
 for(int i=0; i<nums.length; i ++){
        for(int j=i+1; j<nums.length; j++){
          int  sum = nums[i] +nums[j];
                    if(sum==target){
                        int solution [] = {i,j};
                        return solution;
                    }
          }
        }
        return null;
        
    }
}


                // OR without using extra variable.

                for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int []{-1,-1};