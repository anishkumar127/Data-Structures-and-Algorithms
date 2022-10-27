// brute force


import java.util.*;

public class Main {
    public static void main(String[] args) {
      // 6
// 3 2 1 5 6 4
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

int [] arr = new int[n];
for(int i=0; i<n; i++){
  arr[i] = sc.nextInt();
}
Arrays.sort(arr);

// System.out.print(Arrays.toString(arr));
System.out.print(arr[1]);

  }
}



// heap
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

int [] arr = new int[n];
for(int i=0; i<n; i++){
  arr[i] = sc.nextInt();
}


PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
for(int val:arr){
  pq.add(val);
  if(pq.size()>2){
    pq.poll();
  }
}

System.out.print(pq.peek());
  }
}













Find the 2nd smallest element in an unsorted array.

Input
Input consists of the first line containing integer N followed by N natural numbers for the array.

Constraints:
1 <= n <= 10000
1 <= value of natural number <= 10000000

Output
In a new line, print the 2nd smallest element in the array.

Example
Input:
6
3 2 1 5 6 4
Output:
2
Input:
6
3 7 1 4 5 6
Output:
3