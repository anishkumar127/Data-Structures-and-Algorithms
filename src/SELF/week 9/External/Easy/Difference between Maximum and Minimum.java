import java.util.*;

class Accio{
    static int DifferencebetweenMaximumandMinimum(int n, int[] arr){
        // write code here
            int min = Integer.MAX_VALUE;
            int max =Integer.MIN_VALUE;
            for(int i=0; i<n; i++){
                    min = Math.min(min,arr[i]);
                    max = Math.max(max,arr[i]);
            }
            int diff = max-min;
            int count=0;
            for(int val:arr){
                    if(val>diff) count++;
            }
            return count;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[]=new int[n];
        for(int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }
        Accio obj = new Accio();
        int ans=obj.DifferencebetweenMaximumandMinimum(n,nums);
        System.out.println(ans);
    }
}


You are given an integer array Arr of size N. You need to find the number of elements whose value is greater than the difference between maximum and minimum element of the array.

Input Format:

The first line of input contains N representing the number of elements.

The second line of input contains N space seperated integers, representing elements of the array Arr.

Output Format:

Print the count of number of elements which is greater than the difference of maximum and minimum element of the array.

Example 1:

Input

5
2 1 3 1 1
Output:

1
Explanation:

maximum in the array is 3 and minimum in the array is 1, the difference between them is 2, the number of elements that are greater than 2 in the array is 1, which is arr[2].

Example 2:

Input

4
1 4 3 4
Output:

2
Explanation:

maximum in the array is 4 and minimum in the array is 1, the difference between them is 3, the number of elements that are greater than 3 in the array is 2, which is arr[1] and arr[3].

Constraints:

1 <= N <= 10^5

1 <= Arr[i] <= 10^6