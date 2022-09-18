import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);

                int n = sc.nextInt();
                int [] arr = new int[n];
                int max =0;
                for(int i=0; i<n; i++){
                        arr[i] = sc.nextInt();
                        max = Math.max(max,arr[i]);
                }
                System.out.println(max);
	}
}



Ninja and his friend are playing a game of finding the largest element in an array/list ‘ARR’ consisting of ‘N’ unique elements. To make it difficult for Ninja to win, his friend rotates 'ARR' K(possibly zero) times to the left about the largest element. Now, it is Ninja’s turn to find and tell the largest element to his friend. For Example: 'ARR' = [1, 2, 3, 4, 5] after rotating 2 times to the left about its largest element (here, 5) becomes [3, 4, 5, 1, 2]. Your task is to help Ninja determine the largest element in the sorted and rotated ‘ARR’. For Example: For the rotated 'ARR’ = [4, 5, 1, 2, 3], the largest element is ‘5’ which is at index 1(0 based indexing).

Input Format: The first line contains a single integer 'N’ denoting the number of elements in the ‘ARR’. The second line of contains ‘N’ single space-separated integers, denoting the elements of the ‘ARR’.

Output Format: Print the largest element in the given array/list.

Example 1: Input: 3 2 3 1 Output: 3 Explanation: The largest element in the given ‘ARR’ is 3 which is at index 1 (0 based indexing).

Example 2: Input: 4 1 2 3 4 Output: 4 Explanation: The largest element in the given ‘ARR’ is 4 which is at index 3 (0 based indexing).

Constraints: 1 <= N <= 10^5 1 <= ARR[i] <= 10^5

