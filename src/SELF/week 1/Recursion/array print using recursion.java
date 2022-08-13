import java.util.*;
// output 10 20 30 40 50 60 70 
public class Main {
    public static void main(String[] args) {
   int arr[] = {10,20,30,40,50,60,70};
   int n = arr.length;
   output(arr,0,n-1);
  }
  public static int output(int[] arr,int i, int n ){
    
    // int i =0;
    
    if(i>n){
      return 0 ;
    }
    
     System.out.print(arr[i]+" ");
     int ans =   output(arr, i+1,n);
     return ans;
    
  } 
}