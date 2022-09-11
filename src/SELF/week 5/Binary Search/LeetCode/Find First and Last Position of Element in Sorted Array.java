class Solution {
    public int[] searchRange(int[] nums, int target) {
        
      int ans=  first(nums,0,nums.length-1,target);
      int ans1=  last(nums,0,nums.length-1,target);
      int [] result={ans,ans1};
      return result;
        
    }
    private static int first(int[] nums, int start,int end , int t){
        
        int ans =-1;
        
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==t){
                ans = mid;
                end  = mid-1;
            }else if(t<nums[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
     private static int last(int[] nums, int start,int end , int t){
        
        int ans =-1;
        
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==t){
                ans = mid;
                start = mid+1;
            }else if(t<nums[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
}