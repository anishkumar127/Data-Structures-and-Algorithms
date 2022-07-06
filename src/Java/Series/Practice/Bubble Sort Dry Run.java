import java.util.*;
/*
n-1 . 

Time Complexity = O(n^2);
*/
// bubble sort. 

/*  
for example bubble. heavy bubble last and light bubble first . ascending
do in rounds . 
in first round larget heavy in the end. 
second round second larget heavy in the 2nd end.  .. don't compare 7 to 8 bcz 8 largest . 


7 8 3 1 2 -> 7 3 1 2 8 1st round . 
*/

public class Main {
    public static void main(String[] args) {
        int arr[]= {7,8,3,1,2 } ; 
      // interation 
      for( int i = 0 ; i <arr.length-1; i++){ // i  only counter. actual position index is j. 
        for( int j = 0 ; j<arr.length-i-1; j++){ // doing i-1 bcz last elements if sorted then dont compare. 
        if(arr[j] > arr[j+1]){
          // arr[i] ki value greater ho jati hai. eske i+1 yaani agle elements se.
          // then we do swap. 
          int temp = arr[j];
          arr[j]= arr[j+1];
          arr[j+1]= temp ;
        }
        }
      }
      for( int i =0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
        
      }
    }
}