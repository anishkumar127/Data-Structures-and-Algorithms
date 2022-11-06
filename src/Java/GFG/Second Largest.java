class Solution {
	int printSecondLargestNumber(int arr[], int n) {
		if (n < 2) {
			return -1;
		}
		int max = 0;
		int sm = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				sm = max;
				max = arr[i];
			} else if (arr[i] > sm && arr[i] != max) {
				sm = arr[i];
			}
		}
		if (sm == 0) {
			return -1;
		}
		return sm;
	}

    //O(N*N)
    int printSecondLargestNumber2(int arr[], int n) {
		Arrays.sort(arr);
		return arr[1];
	}
}