

class Solution {
    
    public int findUnique(int a[], int n, int k)
    {
    
     HashMap<Integer,Integer> map = new HashMap<>();
     
     for(int i=0; i<n; i++){
         map.put(a[i], map.getOrDefault(a[i],0)+1);
     }
     
      for(int x:map.keySet()){
          if(map.get(x)%k!=0)
          return x;
      }
      return -1;
    }
}


class Solution {
    
    public int findUnique(int a[], int n, int k)
    {
    
     HashMap<Integer,Integer> map = new HashMap<>();
     
     for(int i=0; i<n; i++){
         map.put(a[i], map.getOrDefault(a[i],0)+1);
     }
     
     for(Map.Entry<Integer,Integer>entry:map.entrySet()){
         int key = entry.getKey();
         int val = entry.getValue();
         
         if(val%k!=0){
             return key;
         }
     }
    
      return -1;
    }
}




Given an array of size n which contains all elements occurring in multiples of K, except one element which doesn't occur in multiple of K. Find that unique element.
 

Example 1:

Input : 
n = 7, k = 3
arr[] = {6, 2, 5, 2, 2, 6, 6}
Output : 
5
Explanation:
Every element appears 3 times except 5.
 

Example 2:

Input  : 
n = 5, k = 4
arr[] = {2, 2, 2, 10, 2}
Output :
10
Explanation:
Every element appears 4 times except 10.
 

Your Task:  
You don't need to read input or print anything. Your task is to complete the function findUnique() which takes the array A[], its size N and an integer K as inputs and returns the element with single occurence.

 

Expected Time Complexity: O(N. Log(A[i]) )
Expected Auxiliary Space: O( Log(A[i]) )

 

Constraints:
3<= N<=2*105
2<= K<=2*105
1<= A[i]<=109

