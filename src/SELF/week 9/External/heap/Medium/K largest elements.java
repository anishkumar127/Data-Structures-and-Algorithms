import java.util.*;

public class Main {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();
 int k = sc.nextInt();
 int arr[]  = new int[n];
 for(int i=0; i<n; i++){
   arr[i] = sc.nextInt();
 }

 PriorityQueue<Integer> pq = new PriorityQueue<>();
 ArrayList<Integer> ans = new ArrayList<>();
 
 for(int val: arr){
   pq.offer(val);
   if(pq.size()>k){
     pq.poll();
   }
 }

  while(!pq.isEmpty()){
    ans.add(pq.poll());
  }
  Collections.reverse(ans);
    for(int val:ans){
      System.out.print(val+" ");
  }
  }
}

/*
5 2
12 5 787 1 23
Sample Output

787 23
*/


Given an array of N positive integers, print K largest elements from the array.

Input
The first line contains an integer N and integer K.
The second line contains N spaced integers, the elements of the array.
Constraints
1 ≤ N ≤ 10⁴
K <= N
1 ≤ arr[i] ≤ 10⁶
Output
Print the K largest elements in descending order.

Expected Time Complexity: O(N*logK)
Expected Auxiliary Space: O(K)

Example
Sample Input

5 2
12 5 787 1 23
Sample Output

787 23
Explanation

First largest element in the array is 787 and the second largest
is 23.
Sample Input

7 3
1 23 12 9 30 2 50
Sample Output

50 30 23
Explanation

Three Largest element in the array are 50, 30 and 23.

