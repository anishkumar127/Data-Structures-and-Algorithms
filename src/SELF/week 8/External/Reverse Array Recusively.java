import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      int arr[] = new int[n];
      
      for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
      }
      
      reverse(arr,0,n-1);
      
      for(int val:arr)System.out.print(val+" ");
  }
  private static void reverse(int[] arr, int s , int e){
    // base
    if(s>e) return;
    // swap
   int temp = arr[s];
    arr[s] = arr[e];
    arr[e] = temp;
    // recursive call.
    reverse(arr,s+1,e-1);
  }
}



You are given an array arr of length n. You have to print the reversed array.

Note: You have to use Recursion.

Input Format
The first line of input contains an integer n, size of the array.

the next line contains n space seperated integers denoting the elements of the array.

Output Format
Print n space seperated integers denoting the reverse of the input array.

EXAMPLE 1
Input::

3
2 3 2
Output::

2 3 2
EXPLANATION:

After reversing 2 3 2, we will get 2 3 2

EXAMPLE 2
Input:

6
1 3 5 7
Output::

7 5 3 1
EXPLANATION:

After reversing 2 3 2, we will get 2 3 2

CONSTRAINTS
0 <= nums.length <= 100

0 <= nums[i] <= 100000