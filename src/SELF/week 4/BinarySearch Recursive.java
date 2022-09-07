import java.util.*;

public class Main {
    public static void main(String[] args) {
      int arr[] = {1,2,3,4,5,6};
      int target = 2;
    int ans =   BinarySearchRecursive(arr,target,0,arr.length-1);
    System.out.print(ans);
  }
  private static int BinarySearchRecursive(int arr[] , int target,int start,int end){
    
    // base case 
    if(start>end){
      // target not present.
      return -1;
    }
    int mid = start+(end-start)/2;
    if(arr[mid]==target) return mid;
    if(arr[mid]>target){
      // go to left
      return BinarySearchRecursive(arr,target,start,mid-1);
    }else{
      // go to right
      return BinarySearchRecursive(arr,target,mid+1,end);
    }
  }
}