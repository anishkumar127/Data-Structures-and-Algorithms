import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
      int size = input.nextInt();
      int []arr = new int[size];
  int sum =0;
  for(int i=0; i<size; i++){
    arr[i]=input.nextInt();
  }
  for(int x:arr){
    sum +=x;
  }
  System.out.println(sum/size);
      }
}