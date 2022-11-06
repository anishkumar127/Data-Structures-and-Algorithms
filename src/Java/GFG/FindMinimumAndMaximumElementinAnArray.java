import java.util.TreeSet;

class Compute {
	// using tree data structure.
	// O(NlogN)
	static pair getMinMax1(long a[], long n) {

		TreeSet<Long> tree = new TreeSet<>();
		for (long arr : a) {
			tree.add(arr);
		}

		return new pair(tree.first(), tree.last());
	}

	// using one loop and min max.
	// O(N)
	static pair getMinMax(long a[], long n) {
		if (n == 0)
			throw new RuntimeException("Can't find min and max for array of length 0.");
		// Write your code here
		long max = a[0], min = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		return new pair(min, max);
	}
}

class pair {
	long min, max;

	pair(Long long1, Long long2) {
		min = long1;
		max = long2;
	}
}

public class Main {
	public static void main(String[] args) {

		long a[] = { 1, 7, -1, 6, 9, -100 };

		pair pair = Compute.getMinMax(a, a.length);

		System.out.printf("Min: %d and Max: %d.\n", pair.min, pair.max);
	}
}