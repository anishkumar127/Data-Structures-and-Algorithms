import java.util.*;
// find the min and max value in array. using scanner
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        
        for(int input=0; input<n; input++){
          arr[input] = sc.nextInt();
        }
      // find min value from the array.
      int min =Integer.MAX_VALUE;
   // find max value from the array.
      int max = Integer.MIN_VALUE;
      for(int i=0; i<n; i++){
        if(arr[i]<min){
          min=arr[i];
        }
        if(arr[i]>max){
          max=arr[i];
        }
        
      }
      System.out.println("min value in array"+" "+min);
      System.out.println("max value in array"+" "+max);  
    }
}
      
