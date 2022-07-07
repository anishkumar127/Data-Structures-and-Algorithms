
<!-- Runtime: 0 ms, faster than 100.00%  -->
<!-- Always see do we really need a new array to store our result into? Usually we can store our results in the same input array, if the the input array is not required after a point. -->
<!-- Using same array to store result to make space complexity from O(N) to O(1)
Updating the values of nums as the value of sum gets updated. -->
class Solution {
    public int[] runningSum(int[] nums) {
       
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            nums[i] = nums[i] + sum;   // 1 = 1+0 ; 3= 2+1;  6 = 3+3;  10=6+4 
           
            sum = nums[i];
        }
        return nums;
       
            }
}





class Solution {
    public int[] runningSum(int[] nums) {
        int prefixSum = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            prefixSum += nums[i]; // 3 = 1+2;  6 = 3+3;  10 = 6+4;
            nums[i] =  prefixSum;
        }
        return nums;
    }
}


class Solution {
    public int[] runningSum(int[] nums) {
    int[] ans = new int[nums.length];
    ans[0] = nums[0];
    for (int i = 1; i < nums.length; i++)
        ans[i] = ans[i-1] + nums[i];
    return ans;
    }
}

Time O(N)
Space O(1)
Explanation
Loop once, we can get the sum of subarray starting from the initial point.

public int[] runningSum(int[] nums) {
        int i = 1;
        while (i<nums.length){
            nums[i]+=nums[i-1];
            i++;
        }
        return nums;
    }


class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length; i++)
        {
            if(i==0)
                ans[i] = nums[i];
            else{
                ans[i] = nums[i] + ans[i-1];
            }
        }
        return ans;
    }
}