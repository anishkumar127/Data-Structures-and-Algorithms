//Question Link: https://practice.geeksforgeeks.org/problems/prime-number2314/0/
class Solution {
	static int isPrime(int N) {
		// code here
		if (N == 1 || N == 0) {
			return 0;
		}
		if (N == 2) {
			return 1;
		}
		for (int i = 2; i * i <= N; i++) {
			if (N % i == 0) {
				return 0;
			}
		}

		return 1;
	}
}
