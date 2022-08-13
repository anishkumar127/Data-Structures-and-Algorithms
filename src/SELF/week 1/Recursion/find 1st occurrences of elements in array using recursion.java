import java.util.*;
// output 1
public class Main {
    public static void main(String[] args) {
   int arr[] = {1,2,3,2,3,1};
   int s = 2;
   int ans = output(arr,0,s);
   System.out.print(ans);
   
  }
  private static int output(int arr[], int i, int s){
    
    if(i==arr.length) return -1;
    if(arr[i]==s) return i;
    return output(arr,i+1,s);
  }
}