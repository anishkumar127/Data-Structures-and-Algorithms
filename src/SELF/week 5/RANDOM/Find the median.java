
import java.util.*;

public class Main {
    public static void main(String[] args) {
    //  90 100 78 89 67
    // 56 67 30 79
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int [] arr= new int[n];
    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    
    Arrays.sort(arr);
    // 67 78 89 90 100  89 
    // 30 56 67 79     67.
    double median;
  if (arr.length % 2 == 0)
    median = ((double)arr[arr.length/2] + (double)arr[arr.length/2 - 1])/2;
else
    median = (double) arr[arr.length/2];
    System.out.print((int)median);
  }
}



Given an array arr[] of N integers, calculate the median

Example 1:

Input: N = 5 arr[] = 90 100 78 89 67 Output: 89 Explanation: After sorting the array middle element is the median

Example 2:

Input: N = 4 arr[] = 56 67 30 79 Output: 61 Explanation: In case of even number of elements, average of two middle elements is the median.

Your Task:
You need to take the array as input and print the floor value of the median.

Constraints:
1 <= Length of Array <= 100
1 <= Elements of Array <= 100