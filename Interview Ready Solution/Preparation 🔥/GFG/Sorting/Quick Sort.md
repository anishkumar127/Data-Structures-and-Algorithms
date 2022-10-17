```java

class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
       // base case
       if(low>=high) return ;
       int pivotIndex = partition(arr,low,high);
       // left call.
       quickSort(arr,low,pivotIndex-1);
       //  right call
       quickSort(arr,pivotIndex+1, high);
    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
        // get last index is pivot.
        int pivot = arr[high];
        int i =low-1 ;  // -1;
        
        for(int idx =low ; idx<high; idx++){
            if(arr[idx]<=pivot){
                i++;  // index increase -1 to 0 and then +1 2 3 so on.
                // swap
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
            }
        }
        // now set pivot to right place.
        i++;
        int temp = pivot;
        arr[high] = arr[i];
        arr[i] = temp;
        return i;  // right index of pivot now.
    } 
}

```


``with driver code``

```java
//{ Driver Code Starts
import java.util.*;
class Sorting
{
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    // Driver program
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			
			new Solution().quickSort(arr,0,n-1);
			printArray(arr);
		    T--;
		}
} }
// } Driver Code Ends


class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
       // base case
       if(low>=high) return ;
       int pivotIndex = partition(arr,low,high);
       // left call.
       quickSort(arr,low,pivotIndex-1);
       //  right call
       quickSort(arr,pivotIndex+1, high);
    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
        // get last index is pivot.
        int pivot = arr[high];
        int i =low-1 ;  // -1;
        
        for(int idx =low ; idx<high; idx++){
            if(arr[idx]<=pivot){
                i++;  // index increase -1 to 0 and then +1 2 3 so on.
                // swap
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
            }
        }
        // now set pivot to right place.
        i++;
        int temp = pivot;
        arr[high] = arr[i];
        arr[i] = temp;
        return i;  // right index of pivot now.
    } 
}
```










**theory part**
Quick Sort is a Divide and Conquer algorithm. It picks an element as a pivot and partitions the given array around the picked pivot.
Given an array arr[], its starting position is low (the index of the array) and its ending position is high(the index of the array).

Note: The low and high are inclusive.

Implement the partition() and quickSort() functions to sort the array.


Example 1:

Input: 
N = 5 
arr[] = { 4, 1, 3, 9, 7}
Output:
1 3 4 7 9
Example 2:

Input: 
N = 9
arr[] = { 2, 1, 6, 10, 4, 1, 3, 9, 7}
Output:
1 1 2 3 4 6 7 9 10

Your Task: 
You don't need to read input or print anything. Your task is to complete the functions partition()  and quickSort() which takes the array arr[], low and high as input parameters and partitions the array. Consider the last element as the pivot such that all the elements less than(or equal to) the pivot lie before it and the elements greater than it lie after the pivot.


Expected Time Complexity: O(N*logN)
Expected Auxiliary Space: O(1)


Constraints:
1 <= N <= 103
1 <= arr[i] <= 104

