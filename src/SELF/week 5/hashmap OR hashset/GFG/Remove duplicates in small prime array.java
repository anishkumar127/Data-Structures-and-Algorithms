using array list.

class Solution
{
    ArrayList<Integer> removeDuplicate(int arr[], int n)
    {
        ArrayList<Integer> list = new ArrayList<>();
               for (int i=0; i<n; i++){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        return list;
    }
}



hashset. but way if while not containsing put into array list and also in hashset.

class Solution
{
    ArrayList<Integer> removeDuplicate(int arr[], int n)
    {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0; i<n; i++){
            if( !set.contains(arr[i])){
                list.add(arr[i]);
                set.add(arr[i]);
            }
        }
            return list;
    }
}



// linked hash set use for maintain order. original order.
//and without iterator

class Solution
{
    ArrayList<Integer> removeDuplicate(int arr[], int n)
    {
        
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        
        for(int i=0; i<n; i++){
            lhs.add(arr[i]);
        }
        
        ArrayList<Integer> list = new ArrayList<>(lhs);
       
        return list;
    }
}






// iterator 

ArrayList<Integer> removeDuplicate(int arr[], int n)
    {
        ArrayList<Integer> res = new ArrayList<Integer>();
        LinkedHashSet<Integer> dup = new LinkedHashSet<Integer>();
        for(int i=0;i<n;i++)
            dup.add(arr[i]);
        Iterator<Integer> it = dup.iterator();
        while(it.hasNext())
        {
            res.add(it.next());
        }
        return res;
    }
    
    
/*
not working part.
 // HashSet<Integer> set = new HashSet<>();
        
        // for(int i=0; i<n; i++){
        //     set.add(arr[i]);  
            
        //     if( !set.contains(arr[i])){
        //         list.add(arr[i]);
        //     }
        // }
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i=0; i<n; i++){
        //     map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        // }
        // for(int val: map.keySet()){
        //     list.add(val);
        // }
        
        // for(int val:set){
        //     list.add(val);
        // }

*/



Given an array consisting of only prime numbers, remove all duplicate numbers from it. 

Example 1:

Input:
N = 6
A[] = {2,2,3,3,7,5}
Output: 2 3 7 5
Explanation: After removing the duplicate
2 and 3 we get 2 3 7 5.
Your Task:

Complete the function removeDuplicate() that takes the array of integers and N as input parameters and returns the modified array which has no duplicates. Retain only the first occurrence of the duplicate element. The elements in the returning array should be in the same order as they appear in the original array.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1<=N=106
2<=A[i]<100
