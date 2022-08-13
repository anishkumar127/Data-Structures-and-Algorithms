import java.util.*;
/*
best case tc = O(n^2);
worst case tc = O(n^2);
// if size small. 
*/
public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int [] arr = new int [n];
     for(int i =0; i<n; i++){
       arr[i] = sc.nextInt();
     }
     for(int i =0; i<n-1; i++){
       int minIndex = i;
       for(int j=i+1; j<n-1; j++){
         if(arr[j+1]<arr[minIndex]){
           // swap 
           int temp = arr[minIndex];
           arr[minIndex]  = arr[j+1];
           arr[j+1] = temp;
         }
       }
     }
     for(int print : arr){
       System.out.print(print+" ");
     }
  }
}

// bubble maybe ?