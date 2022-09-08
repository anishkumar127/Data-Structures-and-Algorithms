class Solution {
    public int search(int[] nums, int target) {
     
        return helper(nums,0,nums.length-1,target);
    }
    private static int helper(int nums[] , int start, int end, int x){
        
        if(start>end) return -1;
        
        int mid = start+(end-start)/2;
        
        if(nums[mid]==x) return mid;
        
        if(nums[mid]<nums[start]){
            //  right is sorted.
            if(x>=nums[mid+1] && x<=nums[end]){
                // go right
                return helper(nums,mid+1,end,x);
            }else{
                // go left
                return helper(nums,start,mid-1,x);
            }
            
        }else{
            // left is sorted.
            if(x>=nums[start] && x<=nums[mid]){
                // go left
                return helper(nums,start, mid-1, x);
            }else{
                
                // go right
                return helper(nums,mid+1,end,x);
            }
        }
    }
}


// itrative

class Solution {
    public int search(int[] nums, int target) {
        int length = nums.length;
        // for(int i =0; i<length; i++){
        //     if(nums[i]==target){
        //         return i;
        //     }
        // }
        
        int low =0;
       int high = length-1;
        while(low<=high){
            int middle = (low+high)/2;
            if(nums[middle]==target){
                return middle;
            }else if(nums[low]<=nums[middle]){
                if(target >= nums[low] &&  target<nums[middle]){
                    high= middle-1;
                }else{
                    low = middle+1;
                }
            }else{
                if(target>nums[middle] && target<=nums[high]){
                    low = middle+1;
                }else{
                    high = middle -1;
                }
            }
        }
        return -1 ;
    }
}