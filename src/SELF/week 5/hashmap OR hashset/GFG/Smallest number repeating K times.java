
class Solution
{
    int findDuplicate(int arr[], int N,int K)
    {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        
        int min=Integer.MAX_VALUE;
        int ans =0;
        
        Set<Map.Entry<Integer,Integer> > entries = map.entrySet();
        for(Map.Entry<Integer,Integer> val:entries){
            if(val.getValue()==K && val.getKey()<min){
                min = val.getKey();
            }
        }
        return min;
    }
}



class Solution
{
    int findDuplicate(int arr[], int N,int K)
    {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        
        int min=Integer.MAX_VALUE;
        int ans =0;
        
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()==K && entry.getKey()<min){
                min = entry.getKey();
            }
        }
        
        return min;
    }
}


Given an array arr of size N, the goal is to find out the smallest number that is repeated exactly ‘K’ times.

 

Example 1:

Input:
N=5, K=2
arr[] = { 2 2 1 3 1 }
Output: 1
Explanation: Here in array,
2 is repeated 2 times, 1 is repeated
2 times, 3 is repeated 1 time.
Hence 2 and 1 both are repeated 'k' 
times i.e 2 and min(2, 1) is 1 .
 

Example 2:

Input:
N=4, K=1 
arr[] = { 3 5 3 2 }
Output:  2 
Explanation: Both 2 and 5 are repeating 1
time but min(5, 2) is 2.
 

Your Task:
You just need to complete the function findDuplicate() that takes array arr, integer N and integer K as parameters and returns the required answer.
Note- If there is no such element then return -1.

 

 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(MAX). where MAX is maximum element in the array.

 

Constraints:
1 ≤ N ≤ 105
1 ≤ arr[i] ≤ 105



