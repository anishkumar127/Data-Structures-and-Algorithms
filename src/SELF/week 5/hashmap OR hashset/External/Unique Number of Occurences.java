import java.util.*;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int[] arr= new int[n];
     for(int i=0; i<n; i++){
       arr[i] = sc.nextInt();
     }
     
    boolean isFound=  isUnique(arr,n);
    System.out.println(isFound);
     
  }
  private static boolean isUnique(int[] arr, int n){
    
    HashMap<Integer,Integer>map = new HashMap<>();
    
    for(int i=0; i<n; i++){
      map.put(arr[i],map.getOrDefault(arr[i],0)+1);
    }
    
    HashSet<Integer> set = new HashSet<>();
    
    for(int el:map.values()) set.add(el);
    
    return (set.size()==map.size());
  }
}


Given an array of integers arr, return true if the number of occurrences of each value in the array is unique, or false otherwise.

Input Format:

Input consists of 2 lines.

1st line contains the number of elements followed by n spaced integers.

Output Format:

Print true if the number of occurrences of each value in the array is unique, or false otherwise.

EXAMPLE 1:

Input:

5
1 2 2 1 1 3
Output::

true
EXPLANATION:

The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.

EXAMPLE 2:

Input:

2
1 2
Output::

false
EXPLANATION:

Both 1 and 2 have 1 occurence

CONSTRAINTS:

1 <= arr.length <= 1000

-1000 <= arr[i] <= 1000