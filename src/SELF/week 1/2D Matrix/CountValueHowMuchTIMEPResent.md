import java.util.*;
/*
3x3 
nput 1 4 6 2 8 5 6 5 0 5

Output 1 3

1 4 6
2 8 5
6 5 0
5

*/
public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
    
      int count =0;
      
      int arr[][] = new int [3][3];
      for(int i=0; i<3; i++){
        for(int j =0; j<3; j++){
          arr[i][j] = sc.nextInt();
          // System.out.println(arr[i][j]);
          if(arr[i][j]==5){
            count++;
          }
          
          }
   
      }
      // int s= sc.nextInt();
      
      // for(int [] newArray: arr){
      //   for(int x : newArray){
      //     // System.out.print(x+" ");
      //     if(x==5){
      //       count++;
      //     }
      //   }
      // }
      System.out.print(count);
      
      
  }
}

