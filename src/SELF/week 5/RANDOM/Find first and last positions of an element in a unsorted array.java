import java.util.*;

public class Main {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
   int x = sc.nextInt();
    int[] arr = new int [n];
 
    for(int i=0; i<n; i++){
     arr[i] =sc.nextInt();
    }
    
   Arrays.sort(arr);
     int[] output= new int[2];
     Arrays.fill(output,-1);
     for(int i =0; i<n; i++){
       if(arr[i]==x){
         output[0] =i;
         break;
       }
     }
     for(int i=n-1; i>=0; i--){
       if(arr[i]==x){
         output[1] = i;
         break;
       }
     }
     
     for(int r:output)System.out.print(r+" ");
  }
}



We have given an unsorted array with a duplicate element and we have to find starting and ending index of the given element inside the sorted array

Input Format:

First line contains integer N and integer K.

Second line contains N integers

Output Format:

Print both the starting and ending index, if not present then print "-1 -1".

EXAMPLE 1:

Input:

10 8
1 2 2 2 2 3 4 7 8 8 
Output::

8 9
EXPLANATION:

8 is present at index 8 and 9.

EXAMPLE 2:

Input:

10 6
7 3 2 8 2 2 8 2 2 1
Output::

-1 -1

EXPLANATION:

6 is not present in the array.

CONSTRAINTS:

2 <= nums.length <= 10000

0 <= nums[i] <= 100000