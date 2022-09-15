import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr= new int[n];
    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    
    for(int i=0; i<n; i++){
      for(int j=1; j<n; j++){
        if(arr[j-1]>arr[j]){
          // swap .
          
          int temp = arr[j-1];
          arr[j-1] = arr[j];
          arr[j] = temp;
        }
      }
    }
    for(int x:arr)System.out.print(x+" ");
  }
}

Note: Use of inbuilt sort function is not permitted.

Approach: Find out the Space and Time complexity to be able to optimize your program.

Input Format

First line contains integer N denoting the size of array arr[]
Second line contains N array integers each separated by a space denoting elements of arr[]
Output Format

Output N integers of the sorted array separated by a space in a single line
Example

Input

4
4 12 9 3
Output

3 4 9 12