public class BinarySearch {
//    arr[] = {1 2 3 4 5}
//    K = 4
    public static int binary(int [] arr,int K){
        int n  = arr.length;
        int start=0;
        int end =n-1;
        int mid = (start+end)/2;
     while(start<=end){
         if(arr[mid]==K){
//             System.out.print(mid);
             return mid;
//             break;
         }else if(arr[mid]<K){
             start = mid+1;
         }else{
             end=mid-1;
         }
         mid  = (start+end)/2;
//         if(start>end){
//             System.out.print("not found");
//         }
     }
     return -1;
    }
}
public class Main {
    public static void main(String []args){
  BinarySearch binary= new BinarySearch();
        int arr[] = {1 ,2 ,3 ,4 ,5};
       int  K = 4;
       int result = binary.binary(arr,K);
        System.out.println(result);
}
}