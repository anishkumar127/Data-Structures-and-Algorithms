class Solution {
    public int mySqrt(int x) {
//      int start =1;
        
//         //  1 2 3 4 5 6 7 8 ;;; sqrt root lying in range beetween 1 to 8.
//         int end = x;
        
//         long ans =0;
        
//         while(start<=end){
//             long mid = start+(end-start)/2;
//             if(mid*mid==x){
//                 return (int)mid;
//             }else if(mid*mid<x){
//                 start =(int) mid+1;
//                 ans = mid;
//             }else{
//                 end =(int)mid-1;
//             }
//         }
//         return (int)ans;
        int start = 1;
        int end = x;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid<=x/mid){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return end;
    }
}