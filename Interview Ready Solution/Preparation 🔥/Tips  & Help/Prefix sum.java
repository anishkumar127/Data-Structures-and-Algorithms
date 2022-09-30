import java.util.*;

public class Main {
    public static void main(String[] args) {
     int arr[] = {10,5,2,7,1,9};
     for(int i=1; i<arr.length; i++){ // 1st ignore then counting previous plus next 
      arr[i] = arr[i-1]+arr[i];
     }
     for(int el:arr)System.out.print(el+" ");
  }
}