
class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        HashMap<Long,Long> map = new HashMap<>();
        int n = A.length;
        int m = B.length;
        for(int i=0; i<n; i++){
            map.put(A[i], map.getOrDefault(A[i],(long)0)+1);
        }
         for(int i=0; i<m; i++){
            map.put(B[i], map.getOrDefault(B[i],(long)0)-1);
        }
        
        for(long val :map.values()){
            if(val!=0){
                return false;
            }
        }
        return true;
    }
}



Given two arrays A and B of equal size N, the task is to find if given arrays are equal or not. Two arrays are said to be equal if both of them contain same set of elements, arrangements (or permutation) of elements may be different though.
Note : If there are repetitions, then counts of repeated elements must also be same for two array to be equal.

Example 1:

Input:
N = 5
A[] = {1,2,5,4,0}
B[] = {2,4,5,0,1}
Output: 1
Explanation: Both the array can be 
rearranged to {0,1,2,4,5}
Example 2:

Input:
N = 3
A[] = {1,2,5}
B[] = {2,4,15}
Output: 0
Explanation: A[] and B[] have only 
one common value.
Your Task:
Complete check() function which takes both the given array and their size as function arguments and returns true if the arrays are equal else returns false.The 0 and 1 printing is done by the driver code.

Expected Time Complexity : O(N)
Expected Auxilliary Space : O(N)

Constraints:
1<=N<=107
1<=A[],B[]<=1018