import java.util.*;
/* 
Insertion Sort. 

1. array devided into 2 part. 1st sorted and second unsorted part . 
pick up unsorted part and place into sorted part.sorted increasing and unsorted decreasing.
7 8 3 1 2 -> assume 7 is sorted and 8312 unsorted.
7 , 8 now. , 
7 8 , 3 check and then is 3 less then 7 or 8 , yes.  3 7 8, 1 2. 12 unsorted.

3rd interation. pushing back. and smallest elements pushing front. 

*/
public class Main {
    public static void main(String[] args) {
       int arr[] = {7,8,3,1,2};
       
       for(int i=1; i<arr.length; i++){  // i start with 1. because we assume 1 is sorted part. 
         int current = arr[i]; // pick up and push on right position. 
         int j = i-1; // j using for sorted part track.
        // pick up sorted part last elements// j-1;
        // traversing sorted part. using j util j>=0; 
         
         while(j>=0 && current<arr[j]){
           arr[j+1]= arr[j];
           j--;
         }
         
         // placement. 
         arr[j+1]= current;
       }
       
       for(int i =0; i<arr.length; i++){
         System.out.print(arr[i]+" ");
       }
    }
}