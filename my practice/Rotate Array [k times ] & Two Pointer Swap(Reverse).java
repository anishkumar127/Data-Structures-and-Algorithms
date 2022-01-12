import java.util.*;
// TC - O(N);
public class Main {
    public static void main(String[] args) {
      // 5 1 2 3 4
      // int  n = 5;
      int k = 5;
      int arr[] = {1, 2, 3, 4, 5};
      int n = arr.length;
      k = k%n; // for negative value;
      if(k<0){
        k = k+n;
      }
      // order should be maintain.
      // for position one clock wise we can array start from 1 instead of 0;
            reverse(arr,0, arr.length-k-1);
            reverse(arr,arr.length-k,arr.length-1);
            reverse(arr,0,arr.length-1);
      for(int nums:arr){
        System.out.print(nums);
      }
    }
    
    public static void reverse(int arr[] ,int x , int y ){
      int start =i;
      int end = j;
      while (start<end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end] = temp;
            start++;
            end--;
      }
    }
}