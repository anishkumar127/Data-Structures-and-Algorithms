
class Solution {
    void pushZerosToEnd(int[] nums, int n) {
        
        int index =0;
        
        for(int i=0; i<n; i++){
            if(nums[i]!=0)
            nums[index++] = nums[i];
        }
        
        while(index<n){
            nums[index++]=0;
        }
    }
}


// theory part


Given an array arr[] of N positive integers. Push all the zeros of the given array to the right end of the array while maitaining the order of non-zero elements.


Example 1:

Input:
N = 5
Arr[] = {3, 5, 0, 0, 4}
Output: 3 5 4 0 0
Explanation: The non-zero elements
preserve their order while the 0
elements are moved to the right.
Example 2:

Input:
N = 4
Arr[] = {0, 0, 0, 4}
Output: 4 0 0 0
Explanation: 4 is the only non-zero
element and it gets moved to the left.

Your Task:
You don't need to read input or print anything. Complete the function pushZerosToEnd() which takes the array arr[] and its size n as input parameters and modifies arr[] in-place such that all the zeroes are moved to the right.  


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ N ≤ 105
0 ≤ arri ≤ 105