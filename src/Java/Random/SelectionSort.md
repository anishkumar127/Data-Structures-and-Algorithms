```

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
       for(int j=i+1; j<n; j++){ // if i do here n-1 then sorting will be 2 3 4 8 1 
         if(arr[j]<arr[minIndex]){
           minIndex = j;
         }
       }
       // swap. 
       int temp = arr[i];
       arr[i] = arr[minIndex];
       arr[minIndex] = temp;
     }
     for(int print : arr){
       System.out.print(print+" ");
     }
  }
}
```
