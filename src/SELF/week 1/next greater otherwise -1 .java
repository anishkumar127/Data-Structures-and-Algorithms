import java.util.*;
// 4 6 7 5 7 -1  output 
// tc O(n^2);
public class Main {
    public static void main(String[] args) {
      int arr[] = {2,4,6,1,5,7};
      int n = arr.length;
          for(int i = 0;i<n;i++){
         for(int j = i+1;j<n;j++){
             if (arr[j] > arr [i]){
                 System.out.print(arr[j]+" "); // print and break.
                 break;
             }
             // if j<i  & j=5;  then -1;
            if (arr[j] < arr[i] && j == n-1){
                System.out.print(-1+" ");
            }

         }
                 // if i == n-1;  i == 5; then -1;
         if ( i == n-1){
             System.out.print(-1+" ");
         }

     }
    }
}