import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      int arr[] = new int[n];
      for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
      }

boolean isSumZero =false;
    for(int i=0; i<n; i++){
      int sum =0;
      for(int j=i; j<n; j++){
        sum+=arr[j];
        if(sum==0){
          isSumZero=true;
          // System.out.println("Subarray found from Index "+i+" to "+j);
                System.out.println("Subarray found from Index "+i+" to "+j);
        }
      }
    }
if(!isSumZero) System.out.print("-1");
  }
}
/*
If no valid subarray is present then print -1.

Subarray found from Index i to j
Example 1
Input

10
3 4 -7 3 1 3 1 -4 -2 -2
Output

Subarray found from Index 0 to 2
Subarray found from Index 0 to 9
Subarray found from Index 1 to 3
Subarray found from Index 2 to 5
Subarray found from Index 3 to 9
Subarray found from Index 5 to 7

*/













Write a program to print starting and ending indexes of all the subarrays of arr[] whose sum is equal to zero.

If no valid subarray exists whose sum is zero then print -1.

Print all the indexes in increasing order of the starting index.

Input Format
First line contains an integer N denoting size of array.

Second line contains N integers denoting the array elements

Output Format
Print the starting and ending indexes of all the subarrays whose sum is zero as shown in sample test case.

If no valid subarray is present then print -1.

Subarray found from Index i to j
Example 1
Input

10
3 4 -7 3 1 3 1 -4 -2 -2
Output

Subarray found from Index 0 to 2
Subarray found from Index 0 to 9
Subarray found from Index 1 to 3
Subarray found from Index 2 to 5
Subarray found from Index 3 to 9
Subarray found from Index 5 to 7
Explanation

Adding the given subarray values we can see that we get sum as zero for each subarray.

Example 2
Input

3
0 0 0
Output

Subarray found from Index 0 to 0
Subarray found from Index 0 to 1
Subarray found from Index 0 to 2
Subarray found from Index 1 to 1
Subarray found from Index 1 to 2
Subarray found from Index 2 to 2