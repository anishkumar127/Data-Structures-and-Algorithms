import java.util.*;
// 1 4 5 0 2 5 1 8 3 4 9 8
// 3x4
/*
1 4 5 0
2 5 1 8
3 4 9 8
*/
public class Main {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
  // int m = sc.nextInt();
  // int n = sc.nextInt();
  int sum =0;
   int arr[][] ={{1, 4, 5, 0},{2, 5, 1, 8},{3, 4, 9, 8}};
   for(int i=0; i<arr.length; i++){
     for(int j =0; j<arr[0].length; j++){
      // arr[m][n] = sc.nextInt();
      sum = sum+arr[i][j];
     }
   }
   System.out.println(sum);
  }
  
}
