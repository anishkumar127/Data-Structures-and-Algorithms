
class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
        
        if(n==1) return 0;  // in single num.
        int start =0;
        int end =n-1;
        
        while(start<end){
            int mid = start+(end-start)/2;
            
            if((mid==0 || arr[mid]>arr[mid-1]) && (mid==arr.length-1 || arr[mid]>arr[mid+1])) return mid;
            else if(arr[mid]>arr[mid+1]){
                end = mid;
            }else {
                // arr[mid]<arr[mid+1]
                start = mid+1;
            }
        
        }
        
        return end; // in case nothing happend then return low or high anything.
        
            

    }
}