import java.util.Arrays;

//https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1#

class Solution {
	int missingNumber(int array[], int n) {
		int[] arr = array;
		long sum = 0; // sum is 10;
		
		for (int i = 0; i <= n; i++) {
			sum += i; // in which doing sum of 1 ,3 4, 5
		}
		
		long sum2 = 0;
		for (int i = 0; i < n - 1; i++) {
			sum2 += arr[i]; // in which sum n-1 like 1 , 2, 3 = 6
		}
		return (int) (sum - sum2); // 10-6 = 4
	}

	int missingNumber2(int array[], int n) {
		Arrays.sort(array); 
		for (int i = 0; i < array.length; i++) {
			if (array[i] != i + 1) { 
				// in this. arr[i] = 3 & i=3
				// and +1 3!=4 then i=3 and +1 return 3+1 =4
				return i + 1;
			}
		}
		return n;
	}

	int missingNumber3(int array[], int n) {
		int sum = (n * (n + 1)) / 2; // 10
		for (int i = 0; i < n - 1; i++) {
			sum -= array[i];
			//10 -1 , 9-2 , 7 -3 , sum = 4 return 4
		}
		return sum;
	}

	int missingNumber4(int array[], int n) {
		Arrays.sort(array);
		for (int i = 1; i < n; i++) {
			if (array[i - 1] != i)
				return i;
		}
		return n;
	}
}
