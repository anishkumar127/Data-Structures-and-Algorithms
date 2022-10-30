import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                    arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            for(int x :arr)System.out.print(x+" ");
    }
}


Given an integer array of which both first half and second half are sorted. The task is to merge two sorted halves of the array into a single sorted array.

Note: The two halves can be of arbitrary sizes.

Input
line 1: contains an integer n denoting size of array.

line 2: contains n spaced integers denoting elements of array.

Output
Print an array consisting of n elements denoting the sorted array.

Constraints
1<=n<=10^5

-10^6<=arr[i]<=10^6

Expected Time Complexity: O(N)

Expected Space Complexity: O(N)

Sample Input
6
2 3 8 -1 7 10
Sample Output
-1 2 3 7 8 10