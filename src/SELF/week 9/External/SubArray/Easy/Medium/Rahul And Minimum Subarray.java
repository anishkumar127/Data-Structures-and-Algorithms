// 1 case not passing

import java.util.*;


class Solution {
    
    public static void minSubArrayLen(int arr[], int target, int n) {

            if(n==0){
                    System.out.print(0);
            }
            if(n==1){
                    if(target<arr[0]){
                            System.out.print(1);
                    }else{
                            System.out.print(0);
                    }
            }
            int s =0;
            int e =0;
            int sum =0;
            int ans = Integer.MAX_VALUE;
            while(e<n){
                    sum+=arr[e];

                    while(sum>target && s<=e){
                            ans = Math.min(ans,e-s+1);
                            sum = sum-arr[s];
                            s++;
                    }
                    e++;
            }
        System.out.println(ans);

    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        Solution.minSubArrayLen(arr,target,n);
        
    }
}



Rahul is a programming enthusiast. He is currently learning about arrays/lists. One day his teacher asked him to solve a very difficult problem.

The problem was to find the length of the smallest subarray(subarray is a contiguous part of an array/list) from the given array/list ARR of size N with its sum greater than a given value X. If there is no such possible subarray return 0.

Example:

Given an ARR: [1, 2, 21, 7, 6, 12] and a number X: 23.

The length of the smallest subarray is 2 as the subarray is [21, 7].

Note: Here are multiple subarrays whose sum is greater than X such as [1, 2, 21] or [7, 6, 12] but we have to choose the minimum length subarray.

Input Format:
The first line will contain two integers N and X that denote the size of the ARR and the minimum value of the substring to be created from the array ARR respectively.

The second linecontains N space-separated integers ARR[i], the elements of array ARR.

Output Format:
Return an integer denoting the length of the minimum subarray whose sum is greater than X.

Example 1:
Input:

5 11
9 1 5 3 9
Output:

2
Explanation:

The length of the minimum subarray is 2. The subarray is [3, 9] as the sum is 12 which is greater than the given value 11.

Example 2:
Input:

4 8
5 1 2 1
Output:

4
Explanation:

The length of the minimum subarray is 4. The subarray is [5,1, 2, 1] as the sum is 9 which is greater than the given value 8.

Constraints:
1 <= N <= 10^3

1 <= X <= 10^9

0 <= A[i] <= 10^9