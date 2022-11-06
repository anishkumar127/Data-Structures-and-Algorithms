import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    
    // O(N logK)
	public static int kthSmallest(int[] arr, int k) {

		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
			if (pq.size() > k) {
				pq.poll();
			}
		}
		return pq.peek();
	}

    // sorting 
    // O(N*N)
	public static int kthSmallest2(int[] arr, int k) {

		Arrays.sort(arr);
        return arr[k];
	}
}




