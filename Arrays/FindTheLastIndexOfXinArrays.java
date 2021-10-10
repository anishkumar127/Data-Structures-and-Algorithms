import java.util.*;
// find the last index of x in array using reverse order. 
public class Main {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int n = sc.nextInt();
      int [] arr  = new int[n];
      // for input
      for(int input = 0; input<n; input++){
        arr[input] = sc.nextInt();
      }
        int x = sc.nextInt();
       // finding first x index of array.
       for(int i =n-1; i>=0; i--){
         if(x == arr[i]){
           System.out.println("First index of x in array"+" "+i);
           return;
         }
       }
       System.out.println("-1");
    }
}
