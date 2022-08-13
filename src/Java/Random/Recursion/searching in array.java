import java.util.*;

public class Main {
    public static void main(String[] args) {
      int arr[] = {1,2,3,4,5,6,7};
      int search = 4;
     boolean ans = output(arr,0,search);
     System.out.print(ans);
  }
   public static boolean output(int arr[] , int i, int s ){
     
    if(i==arr.length) return false;
    if(arr[i] == s) return true;
    
  return  output(arr,i+1 , s);
    
   }
}