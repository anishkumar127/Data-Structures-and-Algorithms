import java.util.*;
// output true.
public class Main {
    public static void main(String[] args) {
    int [] arr = {1,2,3,4,4,3,2,1};
    boolean ans = output(arr,0,arr.length-1);
    System.out.print(ans);
    
  }
  private static boolean output(int arr[], int start , int end){
    
    // base case 
    if(start>=end) return true;
    
    // work 
    if(arr[start]!=arr[end]) return false;
    
    // faith
   else return output(arr,start+1,end-1);
    
  
  }
}