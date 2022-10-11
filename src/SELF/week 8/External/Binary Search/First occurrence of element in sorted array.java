import java.util.*;

public class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
		System.out.println(firstOccurrence(arr, n, k));
	}
	static int firstOccurrence(int arr[], int n, int k)
	{
		/* Write your code here */
		int s =0;
		int e = n-1;
		int ans = -1;
		while(s<=e){
		  int mid = s+(e-s)/2;
		  
		  if(arr[mid]==k){
		    ans   = mid;
		    e = mid-1;
		  }else if(arr[mid]>k){
		    e=mid-1;
		  }else{
		    s = mid+1;
		  }
		}
		return ans;
	}
}



















Given a sorted array arr[] of size n with possibly duplicate elements, find index of the first occurrence of an element k in the given array.

Input Format
The first line of input contains two space-separated elements n and k which represents the size of the array and the element to be searched in the array respectively.

The second line of input contains n space-separated elements denoting the sorted array arr[].

Output Format
Print the index of the first occurrence of element k in the array. If there is no occurrence of the element, print -1 instead.

Example 1
Input

5 2
1 2 2 3 4
Output

1
Explanation

Element 2 is present at indices 1 and 2. The first occurence is at index 1.

Example 2
Input

5 6
1 2 3 4 5
Output

-1
Explanation

There is no occurence of element 6 in the given array.

Constraints
1 <= n <= 10^5

1 <= k <= 10^5

1 <= arr[i] <= 10^5

Solution must run in log(n) time complexity where n is the size of array.