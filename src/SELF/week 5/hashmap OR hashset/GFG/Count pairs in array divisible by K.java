Tc O(n);
Sc O(k);  O(2K) = O(k);

class Solution
{
    public static long countKdivPairs(int arr[], int n, int k)
    {
       
       HashMap<Integer,Integer> map = new HashMap<>();
       
       long ans =0;

       for(int i=0; i<n; i++){
           int rem = arr[i]%k;   // finding the remender  like . 1%4 = 1,  4%4 =0
           int complimentry = k-rem;  // complimentry  (k-rem);   4-1= 3 . is 3 present into hashmap or not.
           
           if(rem ==0 && map.containsKey(0)== true){  // if rem =0; and its also present into hasmap. ans++;
               ans+=map.get(0);
           }else if( rem!=0 && map.containsKey(complimentry)== true){  // if no rem 0 and if map contains complimentry of k-rem 4-1 = 3. then ans++;
               ans += map.get(complimentry);
           }
           
            map.put(rem,map.getOrDefault(rem,0)+1);   // if not present rem. then put into map. if present then ++ frequncy.

       }
       return ans;
    }
}

/*
 so its. like running top to bottom.
 check it and put it.
 check it and put it.
 like 1%4 = 1 is present or not.  and also  k-1 = 3 present or not.
 check both. 
 and not present then put map. that rem and his frequncy how much times its occurre into map.
*/



Given an array A[] and positive integer K, the task is to count total number of pairs in the array whose sum is divisible by K.

Example 1:

Input : 
A[] = {2, 2, 1, 7, 5, 3}, K = 4
Output : 5
Explanation : 
There are five pairs possible whose sum
is divisible by '4' i.e., (2, 2), 
(1, 7), (7, 5), (1, 3) and (5, 3)
Example 2:

Input : 
A[] = {5, 9, 36, 74, 52, 31, 42}, K = 3
Output : 7 
Explanation : 
There are seven pairs whose sum is divisible by 3, 
i.e, (9, 36), (9,42), (74, 52), (36, 42), (74, 31), 
(31, 5) and (5, 52).
Your task :
You don't have to read input or print anything. Your task is to complete the function countKdivPairs() which takes the array, it's size and an integer K as input and returns the count of pairs whose sum is divisible by K.
 
Expected Time Complexity : O(n)
Expected Auxiliary Space : O(k)
 
Constraints :
1 <= N <=10^6
1 <= A[i] <= 10^6
1 <= K <= 100
