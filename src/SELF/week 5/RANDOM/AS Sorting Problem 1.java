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
        if(arr[j-1]<arr[j]){
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


Write a program to sort an array (arr[]) of integers in descending (decreasing) order using Bubble sort algorithm. First take input of size of the array i.e. N, followed by N numbers which represent the array elements.

Note: Use of inbuilt sort function is not permitted.

Time complexity: There are N elements in the array and for every element we make N interations , hence N*N iterations which gives us a Time complexity of O(N^2) in the worst case.

Space Complexity: Since this algorithm works without the use of any additional storage space apart from the input, we can say that the Space Complexity will be O(1)

Input Format

First line contains integer N denoting the size of array arr[]
Second line contains N array integers each separated by a space denoting elements of arr[]
Output Format

Output N integers of the sorted array separated by a space in a single line
Example

Input

5
1 4 3 7 2
Output

7 4 3 2 1