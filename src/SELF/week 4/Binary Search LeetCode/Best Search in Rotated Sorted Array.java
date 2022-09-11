class Solution {
    public int search(int[] nums, int target) {
        
        // find the max element index.
        
         int n = nums.length;
        int low =0;
        int high = n-1;
        int maxIndex =0;
        
        while(low<=high){
            int mid = low+(high-low)/2;
            
            if(nums[mid]>=nums[0]){
                maxIndex = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        
 // answer will be pointing to location of maximum element. 
   
// now we do devide array into 2 part. using index like merge sort.don't need to create 2 seperate array. we don't devide array we devide indexes. 

        
   // first array.
   int leftStart = 0; 
   int leftEnd = maxIndex;
   
   // second array.
   int rightStart =maxIndex+1;
   int rightEnd = n-1;
   
   // now where have to search decide.
   
   if(target>=nums[0]){
     // search in first array.
     low = leftStart;
     high = leftEnd;
     
   }else{
     // search in second array.
     low = rightStart;
     high = rightEnd;
   }
    // we decided which part we should search.
   // now we do normally binary search.
        int index =-1;
        while(low<n && low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                index = mid;
                break;
            }
            if(nums[mid]>target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return index;
    }
}