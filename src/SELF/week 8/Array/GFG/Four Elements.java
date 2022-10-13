// brute force

class Compute
{
    boolean find4Numbers(int arr[], int n, int x) 
    {
        for(int i=0; i<n-3; i++){
            for(int j=i+1; j<n-2; j++){
                for(int k=j+1; k<n-1; k++){
                    for(int l=k+1; l<n; l++){
                        int sum = arr[i] +arr[j]+arr[k]+arr[l];
                        if(sum==x) return true;
                    }
                }
            }
        }
        return false;
    }
}


// using two pointer

class Compute
{
    boolean find4Numbers(int arr[], int n, int x) 
    {
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int sum = arr[i]+arr[j];
                if(sum>x) break; // sum will not found.
                
                int remainingSum = x-sum;
                int front  = j+1;
                int back = n-1;
                while(front<back){
                    if(arr[front]+arr[back]==remainingSum)return true;
                    else if(arr[front]+arr[back]<remainingSum) front++;
                    else back--;
                }
            }
        }
        return false;
    }
}





Given an array A of N integers. You have to find whether a combination of four elements in the array whose sum is equal to a given value X exists or not.
 

Example 1:

Input:
N = 6
A[] = {1, 5, 1, 0, 6, 0}
X = 7
Output:
1

Explantion:
1, 5, 1, 0 are the four elements which makes sum 7.
 


Your Task:  
You don't need to read input or print anything. Your task is to complete the function find4Numbers() which takes the array A[], its size N and an integer X as inputs and returns true if combination is found else false. Driver code will print 1 or 0 accordingly.

 

Expected Time Complexity: O(N3)
Expected Auxiliary Space: O(1)

 

Constraints:
4 <= N <= 100
1 <= A[i] <= 1000