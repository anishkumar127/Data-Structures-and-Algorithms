import java.util.*;
// Output:

// [1, 2, 3, 4, 42, 89]
public class Main {
    public static void main(String[] args) {
    int arr[] = {4 ,2, 3, 1 ,42,89};
    int n = arr.length;
    
    for(int i =0; i<n; i++){
      
      int lastelements  = arr.length-i-1;
      int MaxIndex = getMaxIndex(arr,0,lastelements);
      swap(arr,MaxIndex,lastelements);
      // System.out.print(MaxIndex);
      
    }
    System.out.print(Arrays.toString(arr));
  }
  private static int getMaxIndex(int arr[], int start, int end){
    int max = start;
    for(int i=start; i<=end; i++){
      if(arr[max]<arr[i]){
        max = i; 
      }
    }
    return max;
  }
  private static void swap(int[] arr, int first,int second){
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }
}