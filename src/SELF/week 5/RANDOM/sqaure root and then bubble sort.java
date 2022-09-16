import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
      }
      
      // square first.
      sqaure(arr,n);
      
      // then sort it using bubble sort.
      bubbleSort(arr,n);
       for(int x:arr){
        System.out.print(x+" ");
      }
      
  }
  private static void sqaure(int arr[] , int n){
     for(int i=0; i<n; i++){
        arr[i] = arr[i]* arr[i];
      }
  }
  private static void bubbleSort(int arr[], int n){
      for(int i=0; i<n; i++){
        for(int j=1; j<n; j++){
          if(arr[j]<arr[j-1]){
            // swap 
            
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
          }
        }
      }
  }
}

Given an integer array arr[] in unsorted order. Using Bubble Sort Technique, return an array of the squares of each number sorted in non-decreasing order.

Explanation: After squaring, the array becomes [16,1,0,9,100]. After sorting, it becomes [0,1,9,16,100].

Input Format

n (size of the array)
arr[0] arr[1] arr[2] … arr[n-1]
Output Format

arr[0] arr[1] arr[2] … arr[n-1] 
Sample Testcase

Input

5
-4 -1 0 3 10
Output

0 1 9 16 100