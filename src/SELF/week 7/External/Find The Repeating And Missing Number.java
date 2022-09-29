import java.util.*;

public class Main {

	public static void main(String[] args)
	{

		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
		HashMap<Integer, Boolean> map = new HashMap<>();
    for(int value:arr){
      if(map.containsKey(value)){
        System.out.print(value+" ");
      }
      map.put(value,true);
    }
    
		for (int i = 1; i <= n; i++) {
			if (map.get(i) == null) {
				System.out.print(i); // missing.
			}
		}
	}
}



// hashmap

import java.util.*;

public class Main {

	public static void main(String[] args)
	{

		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

		HashMap<Integer, Boolean> map = new HashMap<>();

		int max = arr.length;

		for (Integer i : arr) {

			if (map.get(i) == null) {
				map.put(i, true);
			}
			else {
				System.out.print(i+" "); // repeating.
			}
		}
		for (int i = 1; i <= max; i++) {
			if (map.get(i) == null) {
				System.out.print(i); // missing.
			}
		}
	}
}


// extream optimal 

import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        getTwoElements(arr,n);
        System.out.print(x+" "+y);
  }
  static int x, y;
 
    static void getTwoElements(int arr[], int n)
    {
        /* Will hold xor of all elements
       and numbers from 1 to n  */
        int xor1;
 
        /* Will have only single set bit of xor1 */
        int set_bit_no;
 
        int i;
        x = 0;
        y = 0;
 
        xor1 = arr[0];
 
        /* Get the xor of all array elements  */
        for (i = 1; i < n; i++)
            xor1 = xor1 ^ arr[i];
 
        /* XOR the previous result with numbers from
       1 to n*/
        for (i = 1; i <= n; i++)
            xor1 = xor1 ^ i;
 
        /* Get the rightmost set bit in set_bit_no */
        set_bit_no = xor1 & ~(xor1 - 1);
 
        /* Now divide elements into two sets by comparing
    rightmost set bit of xor1 with the bit at the same
    position in each element. Also, get XORs of two
    sets. The two XORs are the output elements. The
    following two for loops serve the purpose */
        for (i = 0; i < n; i++) {
            if ((arr[i] & set_bit_no) != 0)
                /* arr[i] belongs to first set */
                x = x ^ arr[i];
 
            else
                /* arr[i] belongs to second set*/
                y = y ^ arr[i];
        }
        for (i = 1; i <= n; i++) {
            if ((i & set_bit_no) != 0)
                /* i belongs to first set */
                x = x ^ i;
 
            else
                /* i belongs to second set*/
                y = y ^ i;
        }
        
        // at last do a linear check which amont x and y is missing or repeating 
 
        /* *x and *y hold the desired output elements */
    }
}



















// optimal

import java.util.Scanner;

public class Main {

    public static void printRepeatingAndMissing(int n, int[] arr) {
        // sum of numbers 1 to n, i.e. 1 + 2 + .... + n
        long s1 = (n * (n + 1)) / 2;

        // sum of squares of numbers 1 to n, i.e. 1^2 + 2^2 + .... + n^2
        long s2 = (n * (n + 1) * (2 * n + 1)) / 6;

        // x -> repeating, y -> missing

        // sum of numbers given array
        long s = 0;
        for (int i = 0; i < n; i++) {
            s += arr[i];
        }

        // s - s1
        long xMinusY = s - s1;

        // sum of numbers squares of given array
        long ss = 0;
        for (int i = 0; i < n; i++) {
            ss += (arr[i] * arr[i]);
        }

        // ss - s2
        long xSqrMinusYSqr = ss - s2;

        long xPlusY = xSqrMinusYSqr / xMinusY;

        // finding x and y
        long x = (xMinusY + xPlusY) / 2;

        long y = xPlusY - x;

        System.out.println(x + " " + y);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        printRepeatingAndMissing(n, arr);
        scn.close();
    }
}