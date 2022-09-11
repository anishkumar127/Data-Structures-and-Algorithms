import java.util.*;

public class Main {
    public static void main(String[] args) {
     int[] arr= {2,4,10,10,10,18,20};
     int n = arr.length;
     int t = 10;
     System.out.println(first(arr,0,n-1,t));
     System.out.println(last(arr,0,n-1,t));
  }
  private static int first(int[] arr,int start, int end , int t){
    
    int ans = -1;
    
    while(start<=end){
      int mid = start+(end-start)/2;
       if(arr[mid]==t){
        ans = mid;
       end = mid-1;
      }else if (t<arr[mid]){
        end = mid-1;
      }else {
        start = mid+1;
      }
    }
    return ans;
  }
  private static int last(int [] arr, int start,int end , int t){
    int ans1=-1;
    while(start<=end){
       int mid = start+(end-start)/2;
       if(arr[mid]==t){
        ans1 = mid;
       start = mid+1;
      }else if (t<arr[mid]){
        end = mid-1;
      }else {
        start = mid+1;
      }
    }
    
    return ans1;
  }
}