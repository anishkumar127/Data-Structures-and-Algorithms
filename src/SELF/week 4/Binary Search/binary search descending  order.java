import java.util.*;

public class Main {
    public static void main(String[] args) {
    int arr[] = {20,17,15,14,13,10,8,7,4};
     int n = arr.length;
     int t = 4;
   int result= search(arr,0,n-1,t);
   System.out.println(result);
  }
  private static int search(int[] arr,int start,int end, int t){
    
    while(start<=end){
      int mid = start+(end-start)/2;
      
      if(arr[mid]==t){
        return mid;
      }else if(t<arr[mid]){
        // becase of decending order.
        start = mid+1;
      }else {
        end = mid-1;
      }
    }
    return -1;
  }
}