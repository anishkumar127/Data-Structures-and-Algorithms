import java.util.*;
public class Main {
    public static void main(String[] args) {
    int[] arr = {40,10,5,2,1}; //1 Descending.
    // int[] arr = {1,2,5,10,40};  // 3 ascending.
     int n = arr.length;
     int t = 10;
     
     System.out.println(search(arr,0,n-1,t));
  }
  private static int search(int[] arr, int start, int end , int t){
    
    while(start<=end){
      
      int mid = start+(end-start)/2;  // 4 + 4-4 = 4; 
      
   // Checking the sorted order of the given array
     boolean isAsc = arr[start] < arr[end];
   
      if(arr[mid]==t){
        return mid;
      }
      if(isAsc==true){
        // Ascending order
         if(t>arr[mid]){
           // If x greater, ignore left half
          start = mid+1;
        }else{
           // If x smaller, ignore right half
          end = mid-1;
        }
      }else{
          // Descending order
        if(t<arr[mid]){
           // If x smaller, ignore left half
          start = mid+1;
        }
        else{
          // If x greater, ignore right half
          end = mid-1;
        }
      }
    }
    return -1;
  }
}