import java.util.*;
/*STDIN
4
 1 2 3 5

Output:

1 3 6 11 
*/
public class Main {
    public static void main(String[] args) {
 
 Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr= new int [n];
    for(int i=0; i<n;i++){
      arr[i] = sc.nextInt();
    }
    int sum = 0;
    for(int i=0; i<n; i++){
      sum = sum+arr[i];
      System.out.print(sum+" ");
        // System.out.print(Arrays.toString(sum));
    }
  
  }
}