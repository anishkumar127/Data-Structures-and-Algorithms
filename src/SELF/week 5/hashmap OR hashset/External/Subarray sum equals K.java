
import java.util.*;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int arr[] = new int[n];
     for(int i=0; i<n; i++){
       arr[i] = sc.nextInt();
     }
     
     int k = sc.nextInt();
     int sum =0;
     int ans = 0;
     HashMap<Integer,Integer> map = new HashMap<>();
     // edge case.
     map.put(0,1);
     for(int i=0; i<n; i++){
       
       sum+=arr[i];
       
       int isPresent = sum -k;
       
       if(map.containsKey(isPresent)){
         ans+= map.get(isPresent);
       }
       
       map.put(sum,map.getOrDefault(sum,0)+1);
     }
      System.out.println(ans);
  }
}


Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

Input Format:

Input consists of 3 lines.

1st line contains the number of elements followed by n spaced integers.

3rd line contains integer K.

Output Format:

Print true the total number of subarrays with given sum K.

EXAMPLE 1:

Input:

3
1 1 1
2
Output::

2
EXPLANATION:

subarray [1, 1] and [1, 1] have sum 2

EXAMPLE 2:

Input:

3
1 2 3
3
Output::

2
EXPLANATION:

subarray [1, 2] and [3] have sum 3

CONSTRAINTS:

1 <= nums.length <= 2 * 104

-1000 <= nums[i] <= 1000

-107 <= k <= 107