                    // TLE if using PriorityQueue

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 

      PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
      
         for(int i =0; i<arr.length; i++){
             pq.add(arr[i]);
             if(pq.size()>k){
                 pq.poll();
             }
         }
         return pq.peek();
    } 
}


                    // sorting 

