import java.util.*;
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

*/

// TC:- O(n^2);
public class Main {
    public static void main(String[] args) {
       int arr[]= {3,2,4};
       int n = arr.length;
       int target=6;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
          int sum=arr[i]+arr[j];
                if(sum==target){
                  System.out.print(i+" , "+j);
                }
                
                /*      OR
                if(target==arr[i]+arr[j]){
            System.out.print(i+" "+j);
          }
                */
          //        OR

          /******************************************

          for(int i=0; i<nums.length; i ++){
        for(int j=0; j<nums.length-1; j++){
          if(nums[i] +nums[j+1]==target){
            System.out.print(i+" ");
          }
        }
      }
          ********************************* */

            }
        }
    }
}