class Solution
{
    static int findSubArraySum(int Arr[], int N, int k)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        // need variable like
        int sum =0;
        int ans =0;
        // one edge.
        //  0+ 1 +2 +3 // cumilative sum.
        
        map.put(0,1);
        for(int i=0; i<N; i++){
            sum+=Arr[i];
            
            int isPresent = sum-k;
            
            if(map.containsKey(isPresent)){
                ans+=map.get(isPresent);
            }
            
            // we have to sum put into map. or is present then increase frequency.
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}



Given an unsorted array of integers, find the number of continuous subarrays having sum exactly equal to a given number k.


Example 1:

Input:
N = 5
Arr = {10 , 2, -2, -20, 10}
k = -10
Output: 3
Explaination: 
Subarrays: arr[0...3], arr[1...4], arr[3..4]
have sum exactly equal to -10.

Example 2:

Input:
N = 6
Arr = {9, 4, 20, 3, 10, 5}
k = 33
Output: 2
Explaination: 
Subarrays : arr[0...2], arr[2...4] have sum
exactly equal to 33.

Your Task:
You don't need to read input or print anything. Your task is to complete the function findSubArraySum() which takes the array Arr[] and its size N and k as input parameters and returns the count of subarrays.


Expected Time Complexity: O(NlogN)
Expected Auxiliary Space: O(N)


Constraints:
1 ≤ N ≤ 2*104
-103 ≤ Arr[i] ≤ 103
-107 ≤ k ≤ 107

