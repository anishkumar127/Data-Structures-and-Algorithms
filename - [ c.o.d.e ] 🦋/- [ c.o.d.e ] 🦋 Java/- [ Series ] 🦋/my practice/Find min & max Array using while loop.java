import java.util.*;

public class Main {
    public static void main(String[] args) {
      int arr[ ] = {5, 3, 1, 6, 9};
      int n = arr.length;
      int j =n-1;
      int min = arr[0];
      int max = arr[0];
      while(j>0){
        if(arr[j]>max){
          max=arr[j];
        }
        if(arr[j]<min){
          min=arr[j];
        }
        j--;
      }
      System.out.print(min+" "+max);
    }
}