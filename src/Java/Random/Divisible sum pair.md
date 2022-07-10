
``output:- [1,4][2,3][4,6]
3``
```
import java.util.*;

public class Main {
    public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6};
    // int arr[]={1,3,2,6,1,2};
     int k = 5;
     int ans = 0;
     for(int i=0; i<arr.length; i++){
       for(int j=i+1; j<arr.length; j++){
         if((arr[i]+arr[j])%k==0){
           ans++;
           System.out.print("["+arr[i]+"," + arr[j]+"]");
         }
       }
     }
       System.out.println();
    System.out.print(ans);
  }
}
```