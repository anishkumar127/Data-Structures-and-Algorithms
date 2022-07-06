import java.util.*;
//Selection. 

/* 
time Complexixty : - n - 1 ;  O(n^2);
in which selection sort we found smallest element and put in the first. 
// we don't do much swap. 
// we run loop and compare which is small element  and then one swap. 
// one interation only one swap .
// no unneccary swap in selection sort. 

7 8 3 1 2 ->  1 8 3 7 2 // in which 7 and 1 was swapped. 
// now again start with now 8 . bcz i + 1 ; 1 2 3 7 8 ;  2 and 8 was swapped. 

i+1; 
*/
public class Main {
    public static void main(String[] args) {
      int arr[] = {7,8,3,1,2};
      
      // interation. selection sort. 
      
      for( int i =0 ; i<arr.length-1; i++){
        int smallest = i; // index of smallest elements.
        for(int j =i+1; j<arr.length; j++){ // starting value increacing. 
        if(arr[smallest]>arr[j]){ // arr [smallest] if greater ho jata h agle 
        //elements se to hum
        // j ko smallest bana denge. 
          smallest=j;  // j ko smallest bana denge. 
        }
          
        }
        int temp = arr[smallest];
        arr[smallest]= arr[i];
        arr[i]= temp;
      }
       for( int i =0 ; i<arr.length; i++){
         System.out.print(arr[i]+" ");
       }
    }
}