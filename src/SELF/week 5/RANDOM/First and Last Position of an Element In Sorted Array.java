import java.util.*;

public class Main {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
   int x = sc.nextInt();
    int[] arr = new int [n];
 
    for(int i=0; i<n; i++){
     arr[i] =sc.nextInt();
    }
    
       
     int[] output= new int[2];
     Arrays.fill(output,-1);
     for(int i =0; i<n; i++){
       if(arr[i]==x){
         output[0] =i;
         break;
       }
     }
     for(int i=n-1; i>=0; i--){
       if(arr[i]==x){
         output[1] = i;
         break;
       }
     }
     
     for(int r:output)System.out.print(r+" ");
  }
}



You have been given a sorted array/list ARR consisting of ‘N’ elements. You are also given an integer ‘K’. Now, your task is to find the first and last occurrence of ‘K’ in ARR.

Note:

If ‘K’ is not present in the array, then the first and the last occurrence will be -1.
ARR may contain duplicate elements.
For example, if ARR = [0, 1, 1, 5] and K = 1, then the first and last occurrence of 1 will be 1(0 - indexed) and 2.

Input Format: The first line contains two single-space separated integers ‘N’ and ‘K’, respectively. The second line contains ‘N’ single space-separated integers denoting the elements of the array/list ARR.

Output Format: Print two single-space separated integers denoting the first and the last occurrence of ‘K’ in ARR, respectively.

Example 1: Input: 6 3 0 5 5 6 6 6 Output: -1 -1 Explanation: 3 is not present in the array. Hence the first and last occurrence of 3 is -1 and -1.

Example 2: 8 2 0 0 1 1 2 2 2 2 Output: 4 7 Explanation: The first occurrence of 2 in at index 4 and last occurrence is at index 7.

Constraints: 1 <= N <= 100000 0 <= K <= 10^5 0 <= ARR[i] <=10^5


