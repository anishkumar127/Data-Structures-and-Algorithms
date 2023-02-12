```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Solution{
    public static int singleNumber(int[] nums) {
    // Your code here
		// not passed
		//  Set<Integer> set = new HashSet<>();
		// int el = 0;
  //       for (int num : nums) {
  //           if (!set.contains(num)) {
  //               set.add(num);
		// 		el = num;
  //           } 
  //       }
  //       return el;

		// passed
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int num: nums){
			map.put(num,map.getOrDefault(num,0)+1);
		}

		for(int el:map.keySet()){
			if(map.get(el)==1){
				return el;
			}
		}
		return -1;
}
}
public class Main {
  public static void main (String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(Solution.singleNumber(nums));
	}
}

```










Unique Number in a Triplet Array
Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.

You must implement a solution with a linear runtime complexity and use only constant extra space.

Input Format
The first line contains n which denotes the size of array.

Next line contains n space separated integers which denotes the array.

Output Format
Return the single element present in the array.

Example 1
Input

4
2 2 3 2
Output

3
Example 2
Input

7
2 2 2 4 4 4 5
Output

5
Constraints
1 <= nums.length <= 3 * 10^4

-2^31 <= nums[i] <= 2^31 - 1

Each element in nums appears exactly three times except for one element which appears once.