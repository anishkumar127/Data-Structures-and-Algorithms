import java.io.*;
import java.util.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
        arr[i]=sc.nextInt();

        Solution ob = new Solution();
		int ans=ob.sumOddLengthSubarrays(arr);    
        System.out.println(ans); // print the result
		
	}
}


class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
       // Your code here
               int n = arr.length;
        
        int sum =0;
        
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j+=2){
                for(int k=i; k<=j; k++){
                    sum+=arr[k];
                }
            }
        }
        return sum;
    }
}


Time Complexity: O(N3) 
Auxiliary Space: O(1)




Efficient Approach: To optimize the above approach, the idea is to observe the following pattern after generating all the subarrays of odd length:

For any element at index idx there are (idx + 1) choices on the left side of it and (N – idx) choices on the right side of it.
Therefore, for any element arr[i], the count of arr[i] is (i + 1) * (N – i) in all the subarrays.
So, for an element arr[i], there are ((i + 1) * (N – i) + 1) / 2 sub-arrays with odd length.
Finally, arr[i] will have a total of ((i + 1) * (n – i) + 1) / 2 frequency in the sum.
Therefore, to find the sum of all elements of all the subarrays of odd length, the idea is to iterate over the array and for every ith array element, add [((i + 1) * (n – i) + 1) / 2]*arr[i] to the sum.

Below is the implementation of the above approach:


// Java program for the above approach
class GFG{
 
// Function that finds the sum of all
// the element of subarrays of odd length
static int OddLengthSum(int []arr)
{
     
    // Stores the sum
    int sum = 0;
 
    // Size of array
    int l = arr.length;
 
    // Traverse the given array arr[]
    for(int i = 0; i < l; i++)
    {
         
        // Add to the sum for each
        // contribution of the arr[i]
        sum += (((i + 1) * (l - i) +
                 1) / 2) * arr[i];
    }
 
    // Return the final sum
    return sum;
}
 
// Driver Code
public static void main(String[] args)
{
     
    // Given array arr[]
    int []arr = { 1, 5, 3, 1, 2 };
 
    // Function call
    System.out.print(OddLengthSum(arr));
}
}
 

 
Alice is given an array arr of size N. Her task is return the sum of all the odd legth subarrays of arr. Alice is weak at programming, help Alice solve this problem.

Note

All the subarrays will be contiguous.

Input Format
The first line of input contains a single number N.

The second line of input contains N space separated integers representing array elements.

Output Format
Return the sum of all the odd length subarrays of array arr.

Example 1
Input

5
1 4 2 5 3
Output

58
Explanation

The odd-length subarrays of arr and their sums are:
[1] = 1
[4] = 4
[2] = 2
[5] = 5
[3] = 3
[1,4,2] = 7
[4,2,5] = 11
[2,5,3] = 10
[1,4,2,5,3] = 15
If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
Example 2
Input

5
1 2 2 1 7
Output

46
Explanation

[1]=1
[2]=2
[2]=2
[1]=1
[7]=7
[1,2,2]=5
[2,2,1]=5
[2,1,7]=10
[1,2,2,1,7]=13
If we add all the sum 1+2+2+1+7+5+5+10+13=46.