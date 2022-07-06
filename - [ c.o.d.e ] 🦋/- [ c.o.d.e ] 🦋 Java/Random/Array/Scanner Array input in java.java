import java.util.*;

/*
5
2 3 4 2 5

*/
public class Main {
    public static void main(String[] args) {
  
  
  // array scanner input. in java. 
      Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int arr [] = new int [n];
       for(int i =0; i<n; i++){
         arr[i] = sc.nextInt();
       }
       
       
       
       for(int i =0; i<n; i++){
         System.out.print(arr[i]+" ");
       }
  }
}