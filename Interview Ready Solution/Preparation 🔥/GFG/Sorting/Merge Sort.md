```java

class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
         
         // temp array.
         int temp [] = new int [r-l+1];
         
         int s = l;
         int e = m+1;
         int k= 0;
         
         while(s<=m && e<=r){
             if(arr[s]<arr[e]){
                 temp[k] = arr[s];
                 s++;
                 k++;
             }else{
                 temp[k] = arr[e];
                 e++;
                 k++;
             }
         }
         
         // if anything left on left side.
         while(s<=m){
             temp[k]  = arr[s];
             s++;
             k++;
         }
         
         // right side left. 
         while(e<=r){
             temp[k] = arr[e];
             e++;
             k++;
         }
         // copy temp array to array.
         
        //  for(int i=0; i<temp.length; i++){
        //      arr[i] = temp[i];
        //  }
    for( k=0, s=l; k<temp.length; k++ , s++){
      arr[s] = temp[k];
    }
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        // base case. 
        if(l>=r) return ;
        
        int mid = l+(r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        
        merge(arr,l,mid,r);
    }
}
```

**with driver code**
```java
//{ Driver Code Starts
import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
	static void printArray(int arr[])
    {
        StringBuffer sb=new StringBuffer("");
        int n = arr.length;
        for (int i=0; i<n; ++i)
            sb.append(arr[i]+" ");
        System.out.println(sb.toString());
    }

    

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int T = sc.nextInt();
		while(T>0)
		{
		    //taking elements count
			int n = sc.nextInt();
			
			//creating an object of class Merge_Sort
			Merge_Sort ms = new Merge_Sort();
			
			//creating an array of size n
			int arr[] = new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

            
			Solution g = new Solution();
			
			//calling the method mergeSort
			g.mergeSort(arr,0,arr.length-1);

            //calling the method printArray
			ms.printArray(arr);
		T--;
		}
	}
}



// } Driver Code Ends


class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
         
         // temp array.
         int temp [] = new int [r-l+1];
         
         int s = l;
         int e = m+1;
         int k= 0;
         
         while(s<=m && e<=r){
             if(arr[s]<arr[e]){
                 temp[k] = arr[s];
                 s++;
                 k++;
             }else{
                 temp[k] = arr[e];
                 e++;
                 k++;
             }
         }
         
         // if anything left on left side.
         while(s<=m){
             temp[k]  = arr[s];
             s++;
             k++;
         }
         
         // right side left. 
         while(e<=r){
             temp[k] = arr[e];
             e++;
             k++;
         }
         // copy temp array to array.
         
        //  for(int i=0; i<temp.length; i++){
        //      arr[i] = temp[i];
        //  }
    for( k=0, s=l; k<temp.length; k++ , s++){
      arr[s] = temp[k];
    }
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        // base case. 
        if(l>=r) return ;
        
        int mid = l+(r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        
        merge(arr,l,mid,r);
    }
}

```





**theory part**

Given an array arr[], its starting position l and its ending position r. Sort the array using merge sort algorithm.
Example 1:

Input:
N = 5
arr[] = {4 1 3 9 7}
Output:
1 3 4 7 9
Example 2:

Input:
N = 10
arr[] = {10 9 8 7 6 5 4 3 2 1}
Output:
1 2 3 4 5 6 7 8 9 10

Your Task:
You don't need to take the input or print anything. Your task is to complete the function merge() which takes arr[], l, m, r as its input parameters and modifies arr[] in-place such that it is sorted from position l to position r, and function mergeSort() which uses merge() to sort the array in ascending order using merge sort algorithm.

Expected Time Complexity: O(nlogn) 
Expected Auxiliary Space: O(n)

Constraints:
1 <= N <= 105
1 <= arr[i] <= 103