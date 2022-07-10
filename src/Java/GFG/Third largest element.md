``https://practice.geeksforgeeks.org/problems/third-largest-element/1/?page=2&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Arrays&sortBy=submissions#
``
```
class Solution
{
    int thirdLargest(int arr[], int n)
    {
	 
	    int first =0;
	    int second =0;
	    int third =0;
	    for(int i=0; i<n; i++){
	        if(arr[i]>first){
	            third = second;
	            second = first;
	            first = arr[i];
	        }else if ( arr[i] > second){
	            third = second;
	            second = arr[i];
	        }else if( arr[i]>third){
	            third = arr[i];
	        }
	    }
	    if(third ==0){
	        return -1;
	    }else {
	        return third;
	    }
    }
}

```
```
class Solution
{
    int thirdLargest(int arr[], int n)
    {
            // PriorityQueue<Integer> pq = new PriorityQueue<>();
              PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
            for(int i=0; i<3; i++){
                pq.add(arr[i]);
            }
            for(int i=3; i<n; i++){
               if(arr[i]>pq.peek()){
                   pq.poll();
                   pq.add(arr[i]);
               }
            }
            return pq.peek();
    }
}
```

