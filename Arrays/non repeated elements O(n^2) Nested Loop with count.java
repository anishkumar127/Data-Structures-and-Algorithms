import java.util.*;
/*
input:- 4,2,4,2,5,-1,-1,6
output:- 5 6

TC:- O(n^2)

*/
public class Main {
    public static void main(String[] args) {
        int arr [] = {4,2,4,2,5,-1,-1,6};
        int n = arr.length;
        int count;
        for( int i =0; i<n; i++){
          count =0;
          for( int j =0; j<n; j++){
            if(arr[i]==arr[j] && i!=j){
              count ++;
            }
          }
          // count still zero then print elements. 
        if(count==0){
              System.out.print(arr[i]+" ");
            }
          
        }
        
    }
}