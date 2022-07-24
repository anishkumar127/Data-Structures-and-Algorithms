import java.util.*;

public class Main {
    public static void main(String[] args) {
     int arr[] = {8,5,1,3,2,4,6};
     output(arr,0,arr[0]);
  }
  public static void output(int[] arr, int i ,int max  ){
    
    if(i==arr.length){
    System.out.print(max); // hit the base condition then print.
      return;
    }
      max = Math.max(arr[i],max); // finding the max.
      
   // System.out.print(max); // if i do this. it will keep repeatly print 8 8 8 8 max elements. 
      
        output(arr, i+1,max);
    
  } 
}