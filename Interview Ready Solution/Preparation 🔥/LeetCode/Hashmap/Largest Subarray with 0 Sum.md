```Java
import java.util.HashMap;
import java.io.*;
import java.util.*;

class Main {
	static int maxLen(int arr[])
	{
                int n = arr.length;
		int maxIndex = 0;
                int sum = 0;
                HashMap<Integer,Integer>map  = new HashMap<>();

                for(int i=0; i<n; i++){
                     sum+=arr[i];   // getting sum.
                        // edge case.
                        if(sum==0) maxIndex = maxIndex+1; // if we getting 0 sum anywhere.
                 // now checking sum already present into map or not.
                        if(map.containsKey(sum)){
                                maxIndex = Math.max(maxIndex,i-map.get(sum));
                        }
                        else{
                                // if that sum not present into map. then put that sum and his index value.
                                map.put(sum,i);
                        }
                }
                return maxIndex;
	}

	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++)
		{
			nums[i] = sc.nextInt();
		}

		System.out.println(maxLen(nums));
	}
}


```

Given an array arr[] of length N, find the length of the longest sub-array with a sum equal to 0.

A subarray is a contiguous part of array.

Complete the given function.

Input Format:
First line contains integer N

Second line contains n integers arr[i].

Output Format:
Print the required index.

EXAMPLE 1:
Input:

8
15 -2  2 -8 1 7 10 23
Output:

5
Explanation:

The longest sub-array with elements summing up-to 0 is {-2, 2, -8, 1, 7}

EXAMPLE 2:
Input:

3
1 2 3
Output:

0
Explanation:

There is no subarray with 0 sum

constraints:
-100000 <= nums.length <= 100000

0 <= nums[i] <= 100000
