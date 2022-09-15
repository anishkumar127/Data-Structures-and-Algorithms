
class Solution
{
    public int firstElementKTime(int[] a, int n, int k) { 
        
        // int n = a.length;
        
        // creating hashamp
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<a.length; i++){
            int element = a[i];
            map.put(element, map.getOrDefault(element,0)+1);
            
            if(map.get(element)==k){
                return element;
            }
        }
       
        return -1;
    } 
}



Given an array of N integers. Find the first element that occurs at least K number of times.
 

Example 1:

Input :
N = 7, K = 2
A[] = {1, 7, 4, 3, 4, 8, 7}
Output :
4
Explanation:
Both 7 and 4 occur 2 times. 
But 4 is first that occurs 2 times
As at index = 4, 4 has occurred 
atleast 2 times whereas at index = 6,
7 has occurred atleast 2 times.
 

Your Task:  
You don't need to read input or print anything. Your task is to complete the function firstElementKTime() which takes the array A[], its size N, and an integer K as inputs and returns the required answer. If the answer is not present in the array, return -1.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 <= N, K <= 105
1<= A <= 106