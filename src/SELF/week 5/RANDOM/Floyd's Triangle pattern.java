import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int k =1;
     for(int i=1; i<=n; i++){
       
       for(int j=1; j<=i; j++){
        
        System.out.print(k+" ");
        k++;
       }
       System.out.println();
     }
     
  }
}


Take input of N from the user and write a program to print the Floyd's Triangle pattern as follows (N=5):

1 
2 3
4 5 6
7 8 9 10
11 12 13 14 15
Input Format

Enter input of an integer N
Output Format

Print the pattern for user entered value of N
Example Input

5
Output

1 
2 3 
4 5 6 
7 8 9 10       
11 12 13 14 15 


