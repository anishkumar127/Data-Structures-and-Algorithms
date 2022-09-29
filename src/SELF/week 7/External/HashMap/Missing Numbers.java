import java.util.*;
/*
Given two arrays of integers, find which elements in the second array are missing from the first array. 
If a number occurs multiple times in the lists, you must ensure that the frequency of that number in both 
lists is the same. If that is not the case, then it is also a missing number. Return the missing numbers sorted ascending.
Only include a missing number once, even if it is missing multiple times.
*/
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int nums1[] = new int [n];
      for(int i=0; i<n; i++){
        nums1[i] = sc.nextInt();
      }
      
      int m = sc.nextInt();
      int nums2[] = new int[m];
      for(int i=0; i<m; i++){
        nums2[i]  = sc.nextInt();
      }
      
      HashMap<Integer,Integer> map = new HashMap<>();
      
      // add frequncy and duplicate increase.
      for(int i=0; i<n; i++){
        map.put(nums1[i], map.getOrDefault(nums1[i],0)+1);
      }
      
      // remove frequncy of duplicate element.
      for(int i=0; i<m; i++){
        map.put(nums2[i],map.getOrDefault(nums2[i],0)-1);
      }
      
      // if set not contain 0 frequncy then this missing no.
      for(int val:map.keySet()){
        if(map.get(val)!=0){
          System.out.print(val+" ");
        }
      }
  }
}


Given two arrays of integers, find which elements in the second array are missing from the first array. If a number occurs multiple times in the lists, you must ensure that the frequency of that number in both lists is the same. If that is not the case, then it is also a missing number. Return the missing numbers sorted ascending. Only include a missing number once, even if it is missing multiple times.

Input
There will be four lines of input: n - the size of the first list, The next line contains n space-separated integers arr[i] m - the size of the second list, The next line contains m space-separated integers brr[i]

Output
Output array of integers (in increasing order) which tells you elements of second array not present in first array

Constraints:
1 <= n, m <= 2 * 10^5 n <= m 1 <= brr[i] <= 10^4

Example
Input : arr[] = [7,2,5,3,5,3] brr[] = [7,2,5,4,6,3,5,3]

Output : [4,6]

Input:
10 
203 204 205 206 207 208 203 204 205 206 
13 
203 204 204 205 206 207 205 208 203 206 205 206 204
Output:
204 205 206