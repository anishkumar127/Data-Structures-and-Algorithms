import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    
    int ans=0;
    
    for(int i=0; i<n; i++){
      pq.add(arr[i]);
      
      if(pq.size()>k){
        pq.poll();
      }
    }
    
    System.out.println(pq.peek());
  }
}


Given an array arr[] of n positive integers and a number k. The task is to find the kth largest element in the array.

Note: DO NOT USE sort() stl.

Input
line 1: contains two integers n and k.

line 2: contains n separated integers denoting elements of array.

Output
print a single integer denoting the kth largest element in the array.

Constraints
1 <= N <= 10^4

1 <= arr[i] <= 10^5

1 <= K <= N

Time Complexity:O(nlogk)

Sample Input
5 3
3 5 4 2 9
Sample Output
4
Explanation
Third largest element in the array is 4.