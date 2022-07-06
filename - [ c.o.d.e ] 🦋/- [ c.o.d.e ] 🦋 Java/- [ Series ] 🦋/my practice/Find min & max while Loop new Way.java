import java.util.*;

public class Main {
    public static void main(String[] args) {
      int arr[ ] = {5, 3, 1, 6, 9};
      int n = arr.length;
          int ans = 0;
          int i = 0;
          int j = n-1;
          while(i<j){
              if(arr[j]>arr[i]){
                 j--;
              }else{
                  i++;
              }
         }
             ans = arr[i];
            System.out.print(ans);
    }
}