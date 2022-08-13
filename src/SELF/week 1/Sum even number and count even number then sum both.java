import java.util.*;

// input 1 4 2 5 
// even 4 2 
// sum 6 
// 2 count then 6 + 2 = 8
public class Main {
    public static void main(String[] args) {
    
     int arr[] = {1, 4 ,2 ,5};
     int sum =0;
     int count = 0;
     for(int i=0; i<arr.length; i++){
       if(arr[i]%2==0){
         sum+=arr[i];
         count++;
       }
      
     }
      // System.out.print(sum); // 6 
       int ans = sum+count; // 8 
       System.out.print(ans);
  }
}