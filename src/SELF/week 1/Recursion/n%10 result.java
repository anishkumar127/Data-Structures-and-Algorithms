import java.util.*;
// output 10 20
public class Main {
    public static void main(String[] args) {
    int arr[] = {1,5,10,20,7};
    
    output(arr,0);
  }
  private static void output(int arr[], int i){
    
    // base case :
    if(i== arr.length) return ;
    
    // work.
      if(arr[i]%10==0){
        System.out.print(arr[i]+" ");
      }
    
    // faith
     output(arr,i+1);
    
    
    
  }
}