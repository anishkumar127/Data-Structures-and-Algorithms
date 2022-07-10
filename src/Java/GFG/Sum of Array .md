``https://practice.geeksforgeeks.org/problems/sum-of-array2326/1/?page=4&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Arrays&sortBy=submissions#``


```
class Solution {
    int sum(int arr[], int n) {
        int sum =0;
        for(int i =0; i<n; i++){
            sum +=arr[i];
        }
        return sum;
    }
}


```