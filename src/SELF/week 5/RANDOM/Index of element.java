import java.util.*;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int t = sc.nextInt();
     
     int arr[] = new int[n];
     for(int i=0; i<n; i++){
       arr[i] = sc.nextInt();
     }
     
     ArrayList<Integer> list = new ArrayList<>();
     
     for(int i=0; i<n; i++){
       if(arr[i]==t){
         list.add(i+1);
       }
     }
     if(list.isEmpty()){
       list.add(-1);
     }
    // System.out.println(list);
     for(int x:list){
       System.out.print(x+" ");
     }
     
  }
}



You are given an integer array Arr of size N and a number X. You need to print all the indixes of the given X in the array,else print -1.

Note

You have to give output in 1 based indexing.

Input Format:

The first line of input contains N and X representing the number of elements and the number whose indixes is to be given respectively.

The second line of input contains N space seperated integers, representing elements of the array Arr.

Output Format:

Print the indixes of number X in the array Arr, else print -1.

Example 1:

Input

5 1
2 1 3 1 1
Output:

2 4 5
Explanation:

1 is present at index 2, 4 and 5.

Example 2:

Input

5 1
2 4 3 5 6
Output:

-1
Explanation:

1 is not present in the array, so we print -1.

Constraints:

1 <= N <= 10e5

1 <= X <= 10^6

1 <= Arr[i] <= 10^6
