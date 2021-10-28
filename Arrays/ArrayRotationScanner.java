import java.util.*;
//array rotation
/*
nR is how much times rotate the array.
multi inputes 
array rotation
inputs
2
8
4
1 2 3 4 5 6 7 8 
10
3
1 2 3 4 5 6 7 8 9 10
outputs
5 6 7 8 1 2 3 4 
4 5 6 7 8 9 10 1 2 3 
*/
public class Main {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
    
    int k= sc.nextInt();
    for(int i=0; i<k; i++){
      int n = sc.nextInt();
      int arr[]= new int[n];
        int nR=sc.nextInt();
      for(int j=0; j<n; j++){
        arr[j] = sc.nextInt();
      }
      for(int r=0; r<nR; r++){
        
       int stored = arr[0],store;
        for( store =0; store<arr.length-1; store++){
         arr[store]= arr[store+1];
        }
       arr[store]=stored;
      }
       for(int printArray=0; printArray<arr.length; printArray++){
          System.out.print(arr[printArray]+" ");
        }   
        System.out.println();
    }
}}