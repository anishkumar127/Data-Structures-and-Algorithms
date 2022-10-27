import java.util.*;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     
     int arr[][] = new int[n][n];
     
     for(int i=0; i<n; i++){
       for(int j=0; j<n;j++){
         arr[i][j] = sc.nextInt();
       }
     }
     
     int sum =0;
     int s =0;
     int e = arr.length-1;
     
     for(int i=0; i<n; i++){
       if(s==e)sum=sum-arr[i][s];
       sum+=arr[i][s]+arr[i][e];
       s++;
       e--;
     }
     
     System.out.print(sum);
  }
}

/*
 3
1 2 3
4 5 6
7 8 9
Output

25 

 
 */

 Consider a 2D-array with dimensions n x n. Your task is to return the sum of the 2D-array diagonals.

Note: Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

Input Format
The first line of input contains integer N which is the number of rows and columns of the 2D array.

Next N lines contain N spaced integers each.

Output Format
Print a single integer which is the sum of diagonals.

Example 1
Input

3
1 2 3
4 5 6
7 8 9
Output

25 
Explanation

The sum is 1+5+9+3+7 = 25. Note that we don't re-count the element mat[1][1] i.e. 5.

Example 2
Input

4
1 1 1 1
1 1 1 1 
1 1 1 1
1 1 1 1
Output

8
Explanation

The sum is 1+1+1+1+1+1+1+1 = 8.