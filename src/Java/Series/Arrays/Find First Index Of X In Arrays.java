import java.util.*;
// find the first index of x in array 
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
       for(int i =0; i<n; i++){
         if(x == arr[i]){
           System.out.println("First index of x in array"+" "+i);
           return;
         }
       }
       System.out.println("-1");
    }
}
