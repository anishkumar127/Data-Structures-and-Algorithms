import java.util.*;

public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      int arr[] = new int[n];
      
      for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
      }
      
      HashMap<Integer,Integer>map = new HashMap<>();
      
      for(int el :arr){
        map.put(el,map.getOrDefault(el,0)+1);
      }
      
      for(int val:map.keySet()){
        if(map.get(val)>=2){
          System.out.print(val+" ");
        }
      }
  }
}


Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, print an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant extra space.

Input:
The first line contains a single integer n(size of array n) Second line contains n spaced integers

Output:
Print all the elements that appear twice in sorted manner

Constraints
1 <= n <= 10^5
Sample Input 1
8 4 3 2 7 8 2 3 1

Sample Output 1
2 3
Sample Input 2
3
1 1 2
Sample Output 2
1