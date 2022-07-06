// Reverse the an array.
import java.util.*;

public class Main {
    public static void main(String[] args) {
     
    // Approach 1  without extra memory. 
     
     int arr[] = {1,2,3,4,5};
     
    int start =0;
    int end = arr.length-1;
    int temp;
    while(start<end){
      temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      
      start ++;
      end --;
    }
    
    for(int i =0; i<=arr.length-1; i++){ 
    System.out.print(arr[i]);
    }
   
    
    System.out.println();
    
    // Approach 2 simple way. 
    
    int arrSimple[] = {1,2,3,4,5};
    for(int i=arrSimple.length-1; i>=0; i--){
      System.out.print(arrSimple[i]);
    }
    
    // Appraoch 3 using extra memory;
    
    // Appraoch 3 using XOR;
    
    System.out.println();
    // Approach 5 . using recursion. 
    
    int arr1[] = {1,2,3,4,5};
    reverse(arr1,0, arr1.length-1);
    
    for(int i=0; i<=arr1.length-1; i++){
      System.out.print(arr1[i]);
    }
    }  
    
    private static void reverse(int arr1[], int start,int end){
   
      // base terminating condition.
      if(start>=end){
        return ;
      }
      
      // logic to swap values
        int temp;
        temp = arr1[start];
        arr1[start] = arr1[end];
        arr1[end]= temp;
      
      // recursive coll. 
      reverse(arr1,start+1,end-1);
    }
}