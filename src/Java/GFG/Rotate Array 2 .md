<!-- https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1/?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Arrays&sortBy=submissions# -->

```
class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
      // 1 2 3 4 5 
      
        d = d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    static int [] reverse(int arr[], int s,int e){
        
        while(s<e){
            arr[s] ^=arr[e];
            arr[e]^=arr[s];
            arr[s]^=arr[e];
            s++;
            e--;
        }
        return arr;
    }
}
```