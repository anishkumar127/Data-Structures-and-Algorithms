https://practice.geeksforgeeks.org/problems/peak-element/1/?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Arrays&sortBy=submissions#

```
class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
     Map<Integer,Integer> map = new HashMap<>();
     for(int i =0; i<n; i++){
         map.put(arr[i],i);
     }
     int max = Integer.MIN_VALUE;
     for(int i =0; i<n; i++){
         max = Math.max(arr[i],max);
     }
     return map.get(max);
    }
}
```


```
class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
   if(n==1){
       return 0;
   }
   int i;
     for( i =0; i<n-1; i++){
        if(arr[i+1]<arr[i]){
            break;
        }
     }
     return i;
    }
}
```
```
int peakElement(int arr[], int n)
{
  // Your code here
    for(int i=0;i<n;i++)
 {
     if(i!=0 && i!=n-1)
     {
         if(arr[i]>arr[i-1]&& arr[i]>arr[i+1])
         return i;
     }
     if(i==0)
     {
         if(arr[i]>arr[i+1])
         return i;
     }
     if(i==n-1)
     {
         if(arr[i]>arr[i-1])
         return i;
     }
  }
 return-1;
}

```


```
class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
    int l=0,r=n-1;

      while(l<=r)
      {
          int mid=l+(r-l)/2;
       //   if mid is 0th position then it must be great than (mid+1)th pos.
       // if mid is (n-1)th pos. then it must be great than (mid-1)th pos.
          if((mid==0 || arr[mid]>=arr[mid-1]) && (mid==n-1 || arr[mid]>=arr[mid+1]))
          return mid;
       //   if (mid+1)th pos. element is great than go right side else go left side.
          else if(arr[mid]<=arr[mid+1])
          l=mid+1;
          else
          r=mid-1;
      }
      return -1;
    }
}

```

```
class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
      int index = 0;
       int maxi = 0;
       for(int i = 0;i<n;i++){
           if(arr[i] > maxi){
               maxi = arr[i];
               index = i;
           }
       }
       return index;
    }
}
```

```
class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
     
       for(int i = 0; i < n; i++){
           if(n == 1){
               return 0;
           }
           else if(i == 0){
               if(arr[i] > 0 && arr[i] > arr[i+1]){
                   return i;
               }
           }
           else if(i == n-1){
               if(arr[i] > 0 && arr[i] > arr[i-1]){
                   return i;
               }
           }
           else{
               if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                   return i;
               }
           }
       }
       return -1;
    }
}
```

``Time complexity O(LogN) and Space complexity is O(1)``
```
class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
     int l=0,h=n-1;
  int mid=0;
  while(l<=h){
      mid=l+(h-l)/2;
      if( (mid==0||arr[mid-1]<=arr[mid])&&(mid==n-1||arr[mid]>=arr[mid+1])) return mid;
      if(mid>0&&arr[mid-1]>arr[mid]) h=mid-1;
      else l=mid+1;
  }
  return mid;
    }
}
```

