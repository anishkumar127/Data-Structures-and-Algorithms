class Compute {
    
    public static int missingNumber(int A[], int N)
    {
         HashMap<Integer, Boolean> map = new HashMap<>();
         
         for(int el:A){
             if(map.get(el)==null){
                 map.put(el,true);
             }
         }
         int ans=0;
         for(int i=1; i<=N; i++){
             if(map.get(i)==null){
                 ans = i;
                 break;
             }
         }
         return ans;
    }
}



Vaibhav likes to play with numbers and he has N numbers. One day he was placing the numbers on the playing board just to count that how many numbers he has. He was placing the numbers in increasing order i.e. from 1 to N. But when he was putting the numbers back into his bag, some numbers fell down onto the floor. He picked up all the numbers but one number, he couldn't find. Now he has to go somewhere urgently, so he asks you to find the missing number.
NOTE: Don't use Sorting


Example 1:

Input:                                                       
N = 4                                        
A[] = {1, 4, 3}
Output:
2     
Explanation:
Vaibhav placed 4 integers but he picked
up only 3 numbers. So missing number
will be 2 as it will become 1,2,3,4.
 

Example 2:

Input:                        
N = 5
A[] = {2, 5, 3, 1}
Output:
4
Explanation:
Vaibhav placed 5 integers on the board,
but picked up only 4 integers, so the
missing number will be 4 so that it
will become 1,2,3,4,5.
 

Your Task:  
You don't need to read input or print anything. Your task is to complete the function missingNumber() which takes the array A[] and its size N as inputs and returns the missing number.

 

Exected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
2 ≤ N ≤ 104
1 ≤ A[i] ≤ 104

Size of the array A[] = N-1 