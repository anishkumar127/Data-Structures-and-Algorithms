// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

// Runtime: 1 ms, faster than 100.00% 
class Solution {
    public int removeDuplicates(int[] nums) {
         if (nums.length==0){
           return 0;  
         } 
              int j=0;
    for (int i=0; i<nums.length; i++){
        if (nums[i]!=nums[j]) {
            ++j;
            nums[j]=nums[i]; // could be nums[++j]
        }
    }
    return ++j;
    }
}


                                            //

