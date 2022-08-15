// Greedy Solution
// Idea: Use left to record the nearest left different number. Update left when it's a hill or valley.
// Time complexity: O(N)
// Space complexity: O(1)



import java.util.*;
// Input: nums = [2,4,1,1,6,5]
// Output: 3
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int n= sc.nextInt();
     int [] arr =new int[n];
     for(int i =0; i<n; i++){
       arr[i] = sc.nextInt();
     }
     
     int ans = 0;
     int prev = arr[0];
     for(int i=1; i<n-1; i++){
       if(arr[i]>arr[i+1] && arr[i]> prev || arr[i]<arr[i+1] && arr[i]<prev ){
         ans++;
       }
       if(arr[i] != arr[i+1]){
         prev = arr[i];
       }
     }
     System.out.print(ans);
     
  }
}




       int ans = 0;
        int left = arr[0];
        for(int i = 1; i < arr.length-1; i++){
            if(arr[i] > arr[i+1] && arr[i] > left){
                ans++;
                left=arr[i];     
            }
            else if(arr[i] < arr[i+1] && arr[i] < left){
                ans++;
                left=arr[i];
            }
        }
        return ans;




// 

class Solution {
    public int countHillValley(int[] nums) {
        int r =0;
        int left = nums[0];
        for(int i=1; i<nums.length-1; i++){
            if(nums[i]>nums[i+1] && nums[i]>left){
                r++;
                left = nums[i];
            }
            else if(nums[i]<nums[i+1] && nums[i]<left){
                r++;
                left=nums[i];
            }
        }
        
        return r++;
    }
}

