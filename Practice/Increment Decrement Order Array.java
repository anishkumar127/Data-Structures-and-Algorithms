import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      
      for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
      }
      
      for(int i =0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
      }
      System.out.print("Increment");
      System.out.println();
      reverseArray(arr);
    }
    private static void reverseArray(int arr[]){
      for(int i=arr.length-1; i>0; i--){
        System.out.print(arr[i]+" ");
      }
          System.out.print("Decrement");
    }
    
}