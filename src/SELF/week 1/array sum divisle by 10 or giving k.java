import java.util.*;
/*
STDIN
6 10
 5 5 10 -2 -3 20

Output:

array is 5 
count 1

6 10
 4 5 10 -2 10 10

Output:

array is 10 
count 1

STDIN
6 10
 4 5 10 -2 1 10

Output:

count 0

*/
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int arr[] = new int [n];
      for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
      }
      int count =0;
      for(int i =0; i<arr.length-1; i++){
        if((arr[i]+arr[i+1])%k==0){
          count++;
          System.out.println("array is "+arr[i]+" ");
        }
      }
      // for(int p :arr){
      //   System.out.print(p);
      // }
    System.out.print("count "+count);
    // System.out.print(k);
  }
}