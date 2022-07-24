import java.util.*;

public class Main {
    public static void main(String[] args) {
     int arr[] = {1,2,3,2,2,2,5};
     int s = 2;
     
     int ans = output(arr,0,s);
     System.out.print(ans);
  }
  private static int output(int arr[], int i, int s){
    // base case 
    if(i==arr.length) return 0;
    // do base case 0. because it hit the arr.length then start returning 0.
    // like in multiplication we return 1. and there we don't return -1 because
    // if return -1; then output 4-1 = 3;
    
       // faith
    int count =  output(arr,i+1,s);  // recursivly do something.
    
       // work 
       if(arr[i]==s){ 
         return count+1;
       }else{
         return count;
       }
  }
}