import java.util.*;

public class Main {
  static   Scanner sc= new Scanner(System.in);
  public static void FindIndex(int n, int arr[]){
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
    public static void main(String[] args) {
    
      int n = sc.nextInt();
      int [] arr  = new int[n];
      // for input
      for(int input = 0; input<n; input++){
        arr[input] = sc.nextInt();
      }
      
      FindIndex(n,arr);
    }
}





====================================

//u can also do this.


import java.util.*;

public class Main {
  static   Scanner sc= new Scanner(System.in);
  public static void FindIndex(int n, int arr[]){
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
    public static void main(String[] args) {
      int n = sc.nextInt();
      int [] arr  = new int[n];
      
      FindIndex(n,arr);
    }
}
