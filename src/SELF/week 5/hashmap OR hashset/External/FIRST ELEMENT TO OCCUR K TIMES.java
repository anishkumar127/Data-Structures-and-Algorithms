import java.util.*;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int k = sc.nextInt();
     int[] arr= new int[n];
     for(int i=0; i<n; i++){
       arr[i] = sc.nextInt();
     }
     
    int isITGet=  isKRepeated(arr,n,k);
    System.out.println(isITGet);
     
  }
  private static int isKRepeated(int[] arr, int n,int k){
    
    HashMap<Integer,Integer>map = new HashMap<>();
    
    for(int i=0; i<n; i++){
      map.put(arr[i],map.getOrDefault(arr[i],0)+1);
      
      if(map.get(arr[i])==k){
        return arr[i];
      }
    }
    return -1;
  }
}


Given an array of n integers. Find the first element that occurs k number of times. If there is no element which occurs for atleast k number of times print -1.

Input
line 1: contains two integers n and k.

line 2: contains n spaced integers denoting elements of array.

Output
Print a single integer denoting the first element in array which occurs for atleast k times. If no such element exists, print -1.

Constraints
1<=n<=10^6

1<=arr[i]<=10^6

Expected Time Complexity: O(N)

Expected Space Complexity: O(N)

Sample Input
7 2
1 7 4 3 4 8 7
Sample Output
4