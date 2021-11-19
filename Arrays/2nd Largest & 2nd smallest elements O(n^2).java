import java.util.*;
/*
input:-  int arr[] = {3,5,7,3,8,5,7,1,4};
output:- 7

TC :- O(n^2);

*/
public class Main {
    public static void main(String[] args) {
        int arr[] = {3,5,7,3,8,5,7,1,4};
         // logic second largest. 
          // sorting array elements.
        for(int i=0; i<arr.length; i++){
          //sorting.
          for( int j=i+1; j<arr.length; j++ ){
            if(arr[i]>arr[j]){ // second Largest.
            //if(arr[i]<arr[j]){ // second smallest. 
              // swapping.
           int max = arr[i];
              arr[i]=arr[j];
              arr[j]=max;
            }
          }
        }
        System.out.print(arr[arr.length-2]);
    }
}