import java.util.*;
// optimal.
public class Main {
    public static void main(String[] args) {
       int arr [] = {1,0,3,44,5};
       int n = arr.length;
       int count = 0;
       boolean swapped;
       for(int i=0; i<n; i++){
         swapped=false;
         for(int j=1; j<n-i; j++){
           if(arr[j]<arr[j-1]){
             // swap. 
             
             int temp = arr[j];
             arr[j] = arr[j-1];
             arr[j-1]= temp;
             swapped=true;
             
             
           }
         }
         
         if(!swapped){
           break;
         }
         count++;
       }
       System.out.print(Arrays.toString(arr));
       System.out.print(count);
  }
}