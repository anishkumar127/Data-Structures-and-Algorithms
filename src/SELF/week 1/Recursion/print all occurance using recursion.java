import java.util.*;
// output 1 3
public class Main {
    public static void main(String[] args) {
   int arr[] = {1,2,3,2,3,1};
   int s = 2;
   output(arr,0,s);
  }
  private static void output(int arr[], int i, int s){
    if(i==arr.length) return;
    if(arr[i]==s) System.out.print(i+" ") ;
     output(arr,i+1,s);
  }
}