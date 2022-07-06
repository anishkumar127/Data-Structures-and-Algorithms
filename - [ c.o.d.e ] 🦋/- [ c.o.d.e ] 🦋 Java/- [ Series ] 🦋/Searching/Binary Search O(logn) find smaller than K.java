// find smaller than given number k=34 , 3, k=90 , 3; k =0; 2, 
// logn time. binary search. 
public class Main {
    public static void main(String[] args) {
        int[] arr1 = { -1, -1, 2, 90, 90, 120 };
        int k = 0;
        System.out.println(smallerThanK(arr1, k));
    }
    public static int smallerThanK(int arr1[], int k ){
        int n = arr1.length;
        int start = 0;
        int end = n-1;
       int count =0;

        while(start<=end){
           int mid=(start+end)/2;
        if(arr1[mid]<k){
               count=mid+1;
               start  = mid+1;
            }else{
               end = mid-1;
           }
           //mid=(start+end)/2;
       }
       return count;
    }
}