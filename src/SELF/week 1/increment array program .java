import java.util.*;
// Output:

// 1 1 1 1 1 
public class Main {
    public static void main(String[] args) {
    int [] arr = new int [5];
    increment(arr);
    for(int i :arr){
      System.out.print(i+" ");
    }
  }
  private static void increment(int []arr ){
    
    for(int i=0; i<arr.length; i++){
      arr[i] =arr[i]+1;
    }
    // return arr;
  }
}