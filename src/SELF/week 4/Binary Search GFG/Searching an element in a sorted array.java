
class Solution{
    static int searchInSorted(int arr[], int N, int K)
    {
        
       int start =0;
       int end = arr.length-1;
       
       while(start<=end){
           int mid = start+(end-start)/2;
           if(arr[mid]==K)
           {
               return 1;
           }else if(arr[mid]>K){			// if middle greater than k so we have to end --;
               end = mid-1;
           }else{
               start = mid+1;			// if middle smaller than k so we have to start++;
           }
           mid = start+(end-start)/2;
       }
        return -1;
    }
}