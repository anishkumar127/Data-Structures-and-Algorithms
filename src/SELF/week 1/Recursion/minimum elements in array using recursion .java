import java.util.*;
// 1
public class Main {
    public static void main(String[] args) {
     int [] arr = {4,1,3,2,56};
     int ans = code(arr,0);
     System.out.print(ans);
  }
  private static int code(int arr[], int i ){
    if(i == arr.length-1) return arr[i];
    
    int min =   code(arr,i+1);
    return Math.min(arr[i],min);
  }
}