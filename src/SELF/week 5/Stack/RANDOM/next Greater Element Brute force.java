import java.util.*;

public class Main {
    public static void main(String[] args) {
     int arr[] = {7,8,1,4}; // output 8 -1 4 -1 
     int n = arr.length;
     int[] output = new int [n];
     
     Arrays.fill(output,-1);
     for(int i=0; i<n; i++){
       for(int j=i+1; j<n; j++){
         if(arr[i]<arr[j]){
           output[i] =arr[j];
           break;
         }
       }
     }
     
     for(int x:output)System.out.print(x+" ");
  }
}