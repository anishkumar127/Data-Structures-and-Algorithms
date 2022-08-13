import java.util.*;
// think as a stack . and return from last.
public class Main {
    public static void main(String[] args) {
      int arr[] = {1,2,3,2,3,1};
   int s = 2;
 int ans =  output(arr,0,s);
 System.out.print(ans);
  }
  private static int output(int arr[], int i, int s){
    if(i==arr.length) return -1;
   
    int last = output(arr,i+1,s);
  
    if(last!=-1){
      return last;
    }   else{
      if(arr[i] == s){
        return i ;
      }else{
        return -1;
      }
    }
  }
}