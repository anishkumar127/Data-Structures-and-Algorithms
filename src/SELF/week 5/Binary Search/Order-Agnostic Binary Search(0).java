import java.util.*;
// Input: arr[] = {40, 10, 5, 2, 1}, N=5, X=10
public class Main {
    public static void main(String[] args) {
    // int[] arr = {40,10,5,2,1};
    int[] arr = {1,2,5,10,40};
     int n = arr.length;
     int t = 10;
     
   System.out.println(  search(arr,0,n-1,t));
  }
  private static int search(int[] arr, int start, int end , int t){
    
    while(start<=end){
      int mid = start+(end-start)/2;  // 4 + 4-4 = 4; 
      
      if(arr[mid]==t){
        return mid;
      }else if(arr[0]>arr[1]){
        
        if(t<arr[mid]){
          start = mid+1;
        }
        else{
          end = mid-1;
        }
      }else{
        if(t>arr[mid]){
          start = mid+1;
        }else{
          end = mid-1;
        }
      }
    }
    return -1;
  }
}