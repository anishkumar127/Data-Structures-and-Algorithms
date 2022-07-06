// even odd. number and the array in java.
import java.util.Date;

public class HelloWorld {
    public static void main(String[] args) {
      
      // Approach 1 ; simple way.
      int  n = 7;
      
      if(n%2==0){
        System.out.print("even");
      }else{
        System.out.print("odd");
      }
      
      System.out.println();
      
      // Approach 2 ; 100 even no. 
      
      int n1 = 100;
      
      for(int i=0; i<=n1; i++){
        if(i%2==0){
          System.out.println(i);
        }
      }
     
     // Approach 3; print 100 odd no;
     
     for(int i=0; i<=n1; i++){
       if(i%2!=0){
         System.out.println(i);
       }
     }
     
     
     
     // Approach 4;  even no. in array.
     
     int arr[] = {1,2,3,4,5,6,7,8,9,10};
     
     for(int i=0; i<=arr.length-1; i++){
       if(arr[i]%2==0){
         System.out.println(arr[i]);
       }
     }
    
    
    // Approach 5; odd no. in array;
    
    
     for(int i=0; i<=arr.length-1; i++){
       if(arr[i]%2!=0){
         System.out.println(arr[i]);
       }
     }
     
     
     
    }
}