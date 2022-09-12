Square root of a number


class Solution
{
     long floorSqrt(long x)
	 {
        long start =0;
        long end = x;
        long ans =0;
        
        while(start<=end){
            long mid = start+(end-start)/2;
            
            if(mid*mid==x){
                return mid;
            }else if(mid*mid<x){
                
                start =mid+1;
                ans =mid;
            }else{
                end  = mid-1;
            }
        }
        return ans;
	 }
}



