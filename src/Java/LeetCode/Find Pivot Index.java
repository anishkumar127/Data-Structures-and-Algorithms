class Solution {
    public int pivotIndex(int[] nums) {
         int sum =0; // 28
        int ans =0;
        for(int n:nums){
            sum+=n;
        }
    for(int i=0; i<nums.length; i++){
       if(ans == sum - ans - nums[i]) return i; // 11 ==11  index=3;
        ans+=nums[i];
    }
        return -1;
    }
}

