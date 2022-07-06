import java.util.*;
/*

output:- Second Highest: 4
TC O(N);

1 4 5 7 8
*/
public class Main {
    public static void main(String[] args) {
       //unsorted array
       int arr[] = {7,8,4,7,8,5,8,1};
     
       int n=arr.length;
       
       // traver array and maintain two index highest and second highest;
       
      int highest = Integer.MAX_VALUE;
      int secondHighest=Integer.MAX_VALUE;
       //traversing array.
       for(int i=0; i<n; i++){
         if(arr[i]<highest){
           secondHighest=highest;
           highest=arr[i];
         }
         // maybe working without doing this. 
        // if(arr[i]>highest && arr[i]<secondHighest){
        //   secondHighest=arr[i];
        // }
       }
         System.out.print("Second Highest: "+secondHighest);
    }
}

 
 
 
 
 