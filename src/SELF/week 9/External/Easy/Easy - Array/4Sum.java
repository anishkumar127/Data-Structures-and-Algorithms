import java.util.*;
import java.io.*;
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                long target2 = (long) target - (long) nums[i] - (long) nums[j];
                int lo = j + 1, hi = n - 1;

                while (lo < hi) {
                    int twoSum = nums[lo] + nums[hi];

                    if (twoSum < target2) lo++;
                    else if (twoSum > target2) hi--;
                    else {
                        List<Integer> quad = Arrays.asList(nums[i], nums[j], nums[lo], nums[hi]);
                        ans.add(quad);

                        while (lo < hi && nums[lo] == quad.get(2)) lo++;
                        while (lo < hi && nums[hi] == quad.get(3)) hi--;
                    }
                }

                while (j + 1 < n && nums[j] == nums[j + 1]) j++;
            }

            while (i + 1 < n && nums[i] == nums[i + 1]) i++;
        }

        return ans;
    }

}

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        int k = sc.nextInt();
        Solution Obj = new Solution();
        List<List<Integer>> res = Obj.fourSum(nums, k);
        for(int i=0; i<res.size(); i++){   
            for(int j=0; j<4; j++){
                System.out.print(res.get(i).get(j) + " ");
            } 
            System.out.println("");
        }
        sc.close();
	}
}




Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

0 <= a, b, c, d < n

a, b, c, and d are distinct.

nums[a] + nums[b] + nums[c] + nums[d] == target

You may return the answer in any order.

NOTE: You just have to complete the given function.

Input Format
You will be provided with one array and integer target.

Output Format
Return all the required unique quadruplets.

Example 1
Input

6
1 0 -1 0 -2 2 
0
Output

-2 -1 1 2
-2 0 0 2
-1 0 0 -1
Explanation

There are three unique required quadruplets.

Example 2
Input

5
2 2 2 2 2
8
Output

2 2 2 2
Explanation

There is only one unique required quadruplets.

Constraints
1 <= nums.length <= 200 -10^9 <= nums[i] <= 10^9 -10^9 <= target <= 10^9