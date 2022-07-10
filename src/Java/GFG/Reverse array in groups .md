<!-- https://practice.geeksforgeeks.org/problems/reverse-array-in-groups0255/1/?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Arrays&sortBy=submissions# -->

```
class Solution {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        //  k=k%n;
         int [] nArr = new int [n];
       
        for(int i=0; i<n; i++){
            nArr[i] = arr.get(i);
        }
         
         for(int i=0; i<n; i+=k){
             int left = i;
             int right = Math.min(i+k-1,n-1);
             reverse(nArr,left,right);
         }
         arr.clear(); // all data clear in the list.
         
         for(int i =0; i<n; i++){
             arr.add(nArr[i]);
         }
    }
   void reverse(int arr[] , int s, int e ){
        while(s<e){
            arr[s] ^= arr[e];
            arr[e] ^= arr[s];
            arr[s]^=arr[e];
            s++;
            e--;
        }
        
    }
}
```


```
class Solution {
   //Function to reverse every sub-array group of size k.
   void swap(ArrayList<Integer> arr , int lo , int hi){
       while(lo < hi){
           Collections.swap(arr , lo , hi);
           lo++;
           hi--;
       }
   }
   void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
       int i ;
       for(i = 0 ; i+k < n ; i += k){
           int l = i;
           int r = i + k - 1;
           swap(arr , l , r);
       }
       if(i + k != n){
           swap(arr , i , n-1);
       }
   }
}
```