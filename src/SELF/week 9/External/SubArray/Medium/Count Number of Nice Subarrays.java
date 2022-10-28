// 1 test case fail 

import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
        int k = sc.nextInt();
      int arr[] = new int[n];
      for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
      }
      if(k<0 || k>n) {
              System.out.print(-1);
              return;
      }
      int count =0;
      for(int i=0; i<n; i++){
        int odd=0;
        for(int j=i; j<n; j++){
          if(arr[j]%2!=0){
            odd++;
          }
          if(odd==k) count++;
        }
      }
      
      System.out.println(count);
  }
}

/*
5 3 1 1 2 1 1

Sample Output 1
2

*/



Given an array of integers nums and an integer k. A continuous subarray is called nice if there are k odd numbers on it.

print the number of nice sub-arrays.

Input:
The first line contains a two integers n(size of array n) The next line contains n integers

Output:
print the number of nice sub-arrays.

Constraints
1 <= nums.length <= 50000
1 <= nums[i] <= 10^5
1 <= k <= nums.length
Sample Input 1
5 3 1 1 2 1 1

Sample Output 1
2
Explanation
The only sub-arrays with 3 odd numbers are [1,1,2,1] and [1,2,1,1].
Sample Input 2
3 1
2 4 6
Sample Output 2
0









