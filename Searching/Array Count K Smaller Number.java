import java.util.*;
/*
int[] arr1 = { -1, -1, 2, 90, 
90, 120 }; int k = 34; System.out.
println(smallerThanK(arr1, k));
// output:3
*/
public class HelloWorld {
    public static void main(String[] args) {
  // O 2(n)
      int[] arr1 = { -1, -1, 2, 90, 90, 120 };
      int k = 34;
      System.out.println(smallerThanK(arr1, k));
      
      // System.out.print(count);
    }
    public static int smallerThanK(int [] arr1, int k){
      int count =0;
      for(int i=0; i<arr1.length; i++){
        if(arr1[i]<k){
          count++;
        }
       
      }
   return count;
    }
}