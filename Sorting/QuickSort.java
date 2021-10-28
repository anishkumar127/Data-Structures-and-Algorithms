import java.util.*;
//quick sort

public class Main {
    public static void main(String[] args) {
int arr[] = {3,2,1,5,6,7};
int leng = arr.length;
Main qsm = new Main();
qsm.quickSortRecursion(arr,0,leng-1);
qsm.printArray(arr);
    }
    
    int partition(int [] arr, int low, int high){
      int pivot = arr[(low+high)/2];
      while(low<=high){
        while(arr[low]<pivot){
          low++;
        }
        while(arr[high]>pivot){
          high--;
        }
        if(low<=high){
          int temp = arr[low];
          arr[low]=arr[high];
          arr[high]=temp;
          low++;
          high--;
        }
      }
      return low;
    }
    void quickSortRecursion(int[] arr,int low,int high){
    int pi=  partition(arr,low,high);
    if(low<pi-1){
      //left hand
      quickSortRecursion(arr,low,pi-1);
    }
    if(pi<high){
      // right hand
      quickSortRecursion(arr,pi,high);
    }
    }
    void printArray(int [] arr){
      for(int i:arr){
        System.out.print(i+" ");
      }
      
    }
}